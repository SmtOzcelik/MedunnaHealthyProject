package stepDefinitions.apiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.US17Pojo.ActualDataPojo;
import pojos.US17Pojo.TestItemsPojo;
import utilities.Authentication;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US17_ApiStepDef {

    Response response;
    RequestSpecification spec;

    TestItemsPojo expectedData;
    ActualDataPojo actualData;
    static Faker faker;

    @Given("Kullanici pathparams olusturur")
    public void kullaniciPathparamsOlusturur() {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();

        spec.pathParams("1", "api", "2", "c-test-items");
    }



    @And("Kullanici post request gonderir")
    public void kullaniciPostRequestGonderir() {

        response = RestAssured.given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+ Authentication.generateToken()).body(expectedData).post("{1}/{2}");
        response.prettyPrint();
    }

    @Given("Kullanici expected data olusturur")
    public void kullanici_expected_data_olusturur() {
        expectedData=new TestItemsPojo("faker.medical().medicineName()","faker.medical().symptoms()",faker.number().randomDigitNotZero(),
                "faker.number().digit()","faker.number().digit()");
        System.out.println(expectedData);
    }

        @And("Kullanici gelen responsu dogrular")
        public void kullaniciGelenResponsuDogrular() {
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),ActualDataPojo.class);
                System.out.println(actualData);

        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getDefaultValMin(),actualData.getDefaultValMin());
        assertEquals(expectedData.getDefaultValMax(),actualData.getDefaultValMax());

    }

    @And("Kullanici put request gonderir")
    public void kullaniciPutRequestGonderir() {

        response=given().spec(spec).contentType(ContentType.JSON).when().put("/{1}/{2}");
        response.prettyPrint();

    }

    @Given("Kullanici path params olusturur")
    public void kullaniciPathParamsOlusturur() {
    }

    @And("Kullanici delete request gonderir")
    public void kullaniciDeleteRequestGonderir() {
    }

    @And("Kullanici status code {int} oldugunu dogrular")
    public void kullaniciStatusCodeOldugunuDogrular(int arg0) {
    }



}

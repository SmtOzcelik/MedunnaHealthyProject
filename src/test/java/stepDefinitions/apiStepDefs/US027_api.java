package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US16.pojosUS027.ExpectedData;
import pojos.US16.pojosUS027.ResponseActual;
import utilities.Authentication;

public class US027_api  {


    ExpectedData expectedData = new ExpectedData();
    Response response;
    RequestSpecification spec;



    @Given("kullanici path params olusturur.")
    public void kullaniciPathParamsOlusturur() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();

        spec.pathParams("1", "api", "2", "c-messages");

    }



    @And("kullanici post request gonderir")
    public void kullaniciPostRequestGonderir() {

        response = RestAssured.given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+ Authentication.generateToken()).body(expectedData).post("{1}/{2}");

        //response.prettyPrint();


    }

    @And("kullanici gelen response'u dogrular.")
    public void kullaniciGelenResponseUDogrular() {

        ResponseActual actualData = response.as(ResponseActual.class);

        //System.out.println("expectedData = " + expectedData);
        //System.out.println("actualData = " + actualData);

        Assert.assertEquals(expectedData.getMessage(), actualData.getMessage());
        Assert.assertEquals(expectedData.getName(), actualData.getName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getEmail());
        Assert.assertEquals(expectedData.getSubject(), actualData.getSubject());



    }

    @And("kullanici expected data olusturur, {string} {string} {string} {string}")
    public void kullaniciExpectedDataOlusturur(String mail, String message, String name, String subject) {
        expectedData.setEmail(mail);
        expectedData.setMessage(message);
        expectedData.setName(name);
        expectedData.setSubject(subject);
    }
}

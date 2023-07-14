package stepDefinitions.apiStepDefs;


import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US09Pojo.AppoinmentPojo;
import pojos.US09Pojo.CountryPojo;
import pojos.US09Pojo.UserPojo;
import pojos.US10Pojo.Appointment_Pojo;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US009_ApiStepDef {
    static Response response;
    static String token;
    static UserPojo user;
    static CountryPojo country;
    static AppoinmentPojo expectedData;
    static AppoinmentPojo actualData;

    @Given("Staff Medunna Url i id ile ayarlar")
    public void staff_medunna_url_i_id_ile_ayarlar() {
        String patientEndPoint = ConfigReader.getProperty("patientEndPoint");
        token = Authentication.generateToken();
        response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type`",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(patientEndPoint);
        response.prettyPrint();
    }
    @Then("Staff GET request yapar ve response alir")
    public void staff_get_request_yapar_ve_response_alir() {
        user=new UserPojo("teamadmin86","2022-07-20T21:07:28.837545Z",131032,"hy","pk","456-87-1234","hy@gmail.com",false,"en",null,"2022-07-20T21:07:28.836771Z","456-87-1234");
        country=new CountryPojo(263705,"TURKEY");
        expectedData=new AppoinmentPojo("patient2","2021-12-31T18:37:27.252314Z",4856,"Adanali01","Turkiyeliii",null,"5555555555","Apositive","MALE","sananeGardasYaw","bosversenee@gmail.com","",user,null,null,country,null);

    }
    @Then("Staff json datayi deserialize yaparak javaya dondurur")
    public void staff_json_datayi_deserialize_yaparak_javaya_dondurur() {
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), AppoinmentPojo.class);
    }
    @Then("Staff randevulari API ile dogrular")
    public void staff_randevulari_api_ile_dogrular() {
        assertEquals(200,response.getStatusCode());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());


    }


}
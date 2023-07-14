package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import pojos.US10Pojo.Appointment_Pojo;

import pojos.US10Pojo.Patient_Pojo;
import pojos.US10Pojo.PhysicianPojo;
import pojos.US10Pojo.UserPojo;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US010_ApiStepDef {
    static Response response;
    static Appointment_Pojo actualData;
    static Appointment_Pojo expectedData;
    static UserPojo user;
    static Patient_Pojo patient;
    static PhysicianPojo physician;
    static String token;
    @Given("US010 Doktor Medunna Url i id ile ayarlar")
    public void doktorMedunnaUrlIIdIleAyarlar() {
        String patientEndPoint = ConfigReader.getProperty("US10EndPoint");
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

    @And("US010 Doctor GET request yapar ve response alir")
    public void doctorGETRequestYaparVeResponseAlir() {
        user = new UserPojo("anonymousUser","2022-11-28T09:09:18.532425Z",349424,"hastacso","hasta cs",
                "hasta cs","hastacs@gmail.com",true,"en",null,null,"758-45-1536");

        patient= new Patient_Pojo("hastacso","2022-11-28T09:11:26.804288Z",349755,"hasta cs",
                "hasta cs",null,"4589651236",null,null,"","hastacs@gmail.com",
                "null",user,null,null,null);

        physician = new PhysicianPojo("batch81","2022-11-18T07:37:55.641703Z",306348,"doktor",
                "cs","1992-03-17T22:00:00Z","555-555-5555","MALE","Apositive","",
                "",user,"SURGERY",null,null,500.00,null,null);

        expectedData= new Appointment_Pojo("hastacso","2022-11-28T09:25:21.251167Z",381005,
                "2022-12-12T00:00:00Z","2022-12-12T01:00:00Z","PENDING",null,
                null,null,null,
                "",physician,patient,null);
    }

    @And("US010 Doctor json datayi deserialize yaparak javaya dondurur")
    public void doctorJsonDatayiDeserializeYaparakJavayaDondurur() {
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), Appointment_Pojo.class);
    }

    @And("US010 Doctor randevulari API ile dogrular")
    public void doctorRandevulariAPIIleDogrular() {
        assertEquals(200,response.getStatusCode());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(user.getFirstName(),actualData.getPatient().getUser().getFirstName( ));
        assertEquals(expectedData.getStartDate(),actualData.getStartDate());

    }
}
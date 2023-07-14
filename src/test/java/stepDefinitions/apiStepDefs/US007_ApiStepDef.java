package stepDefinitions.apiStepDefs;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import io.restassured.response.Response;

import pojos.US01.MedunnaBaseURL;
import pojos.US07Pojo.PatientUS007;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;


public class US007_ApiStepDef extends MedunnaBaseURL {

    Response response;
    static PatientUS007 expectedData;
    static PatientUS007 actualData;

    @Given("DKullanici appointments icin endpoint belirler")
    public void dkullaniciAppointmentsIcinEndpointBelirler() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get(ConfigReader.getProperty("appointmentEndPoint"));
        response.prettyPrint();

        expectedData = new PatientUS007("cizmelikedi", "2022-11-24T16:38:15.297613Z", "2022-11-24T00:00:00Z",
                "2022-11-24T01:00:00Z");
        System.out.println("expectedData = " + expectedData);

    }

    @And("DKullanici send request ve get response yapar")
    public void dkullaniciSendRequestVeGetResponseYapar() {
        actualData=ObjectMapperUtils.convertJsonToJava(response.asString(),PatientUS007.class);
        System.out.println("actualData = " + actualData);


    }

    @Then("DKullanici Api ile beklenen datalari dogrular")
    public void dkullaniciApiIleBeklenenDatalariDogrular() {
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getCreatedBy(), actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(), actualData.getCreatedDate());
        assertEquals(expectedData.getStartDate(), actualData.getStartDate());
        assertEquals(expectedData.getEndDate(), actualData.getEndDate());


    }
}
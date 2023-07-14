package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.*;
import io.cucumber.java.en.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;
import pojos.US18.US18_Country;
import pojos.US18.US18_Physician_Pojo;
import pojos.US18.US18_user;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class US018_Api {

    static Response response;
    static US18_Physician_Pojo actualData;
    static US18_Physician_Pojo expectedData;
    static US18_user user;
    static US18_Country country;
    static String token;

    @Given("Admin Medunna Url i id ile ayarlar.")
    public void AdminMedunnaUrlIIdIleAyarlar() {

        String physicianEndPointUS18 = ConfigReader.getProperty("physicianEndPointUS18");
        token = Authentication.generateToken();
        response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type`",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(physicianEndPointUS18);
        response.prettyPrint();
    }
/*
        {
            "createdBy": "adminmuhammet",
                "createdDate": "2022-12-08T16:16:09.763420Z",
                "id": 385372,
                "firstName": "Pikacu",
                "lastName": "Pika",
                "birthDate": "2000-01-07T22:00:00Z",
                "phone": "0123456789",
                "gender": "MALE",
                "bloodGroup": "Apositive",
                "adress": "Karsiyaka",
                "description": "Docent",
                "user": {
            "createdBy": "anonymousUser",
                    "createdDate": "2022-11-14T20:55:46.860618Z",
                    "id": 300457,
                    "login": "pikaa",
                    "firstName": "Pikacu",
                    "lastName": "Pika",
                    "email": "projecalisiyorum@gmail.com",
                    "activated": true,
                    "langKey": "en",
                    "imageUrl": null,
                    "resetDate": null,
                    "ssn": "587-35-9009"
        },
            "speciality": "ALLERGY_IMMUNOLOGY",
                "appointments": null,
                "country": {
            "id": 80065,
                    "name": "USA"
        },
            "cstate": null,
                "examFee": 300.00,
                "image": "",
                "imageContentType": null
        }
*/

    @When("Admin GET request gonderir.")
    public void adminGETRequestGonderir() {
        user = new US18_user("anonymousUser","2022-11-14T20:55:46.860618Z",300457,"pikaa",
                "Pikacu","Pika","projecalisiyorum@gmail.com",true,"en",null,null,"587-35-9009");

        country = new US18_Country(80065,"USA");

        expectedData = new US18_Physician_Pojo("adminmuhammet","2022-12-08T16:16:09.763420Z",385372,"pikacu","Pika",
                "2000-01-07T22:00:00Z","0123456789","MALE","Apositive","Karsiyaka","Docent",user,
                "ALLERGY_IMMUNOLOGY", null,country,null,300.00,null,null);

    }
    @Then("Admin json datayi deserialize yaparak javaya dondurur.")
    public void AdminJsonDatayiDeserializeYaparakJavayaDondurur() {
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),US18_Physician_Pojo.class);
    }

    @And("Admin status kodunun ikiyuz oldugu gorulur.")
    public void AdminStatusKodununikiyuzOlduguGorulur() {
        int actualStatusCode = response.getStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("Admin response'u API ile dogrular.")
    public void AdminResponseUAPIIleDogrular() {
        assertEquals(200,response.getStatusCode());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(user.getFirstName(),actualData.getUser().getFirstName());
        assertEquals(expectedData.getCountry().getName(),actualData.getCountry().getName());
    }

    @And("Admin tum physicians bilgilerini API response ile alir.")
    public void adminTumPhysiciansBilgileriniAPIResponseIleAlir() {
        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("createdBy", equalTo("adminmuhammet"),
                        "createdDate", equalTo("2022-12-08T16:16:09.763420Z"),
                        "id", equalTo(385372),
                        "firstName", equalTo("Pikacu"),
                        "lastName", equalTo("Pika"),
                        "birthDate", equalTo("2000-01-07T22:00:00Z"),
                        "phone", equalTo("0123456789"),
                        "description", equalTo("Docent"),
                        "speciality", equalTo("ALLERGY_IMMUNOLOGY")
                        //,"examFee", equalTo(300.00)  // exam fee ler esit ama kabul etmedi
                );
    }


}

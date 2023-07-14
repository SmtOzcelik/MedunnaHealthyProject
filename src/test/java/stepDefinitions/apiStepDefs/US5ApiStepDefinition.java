package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US05Pojo.Patient;
import pojos.US05Pojo.US5UserPojo;
import utilities.ObjectMapperUtils;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;



public class US5ApiStepDefinition {

    Response response;
    Patient patient;
    private ObjectMapperUtils JsonUtil;


    @Given("Kullanici id numarali hastanin randevu bilgileri")
    public void KullaniciIdNumaraliHastaninRandevuBiligleri() {
        response=given()
                .headers("Authorization","Bearer "+ generateToken())
                .when()
                .get("https://medunna.com/api/patients/318263");

        // response.prettyPrint();
    }

    @Then("Kullanici status konudun {int} oldugunu dugrular")
    public void KullaniciStatusKonudunOldugunuDugrular(int arg0) {
        Assert.assertEquals("Statuscode  esleşmedi ",200,response.statusCode());
    }

    @Then("Kullanici bilgilerini dogrular")
    public void KullaniciBilgilerinDogrular() {
        US5UserPojo actualuser= new US5UserPojo("3313","jonnyjones",358-65-3578, "Johnny", "Jones", "jonnyj@gmail.com" ,
                "null",true,"en", "anonymousUser","2021-12-25T16:44:14.972932Z",null);
        Patient expectedData = new Patient("hp06-team18","2022-11-21T09:35:09.334760Z",
                318263,"zeka1H","zeka1H",
            "2022-11-20T21:00:00Z","011-222-3333","MALE","Apositive","meydan",
                "zeka1H@gmail.com",""
                ,actualuser,null,null,null,null);


        Patient actualData = JsonUtil.convertJsonToJava(response.asString(), Patient.class);

        System.out.println("aData = " + actualData);
        System.out.println("eData = " + expectedData );

        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getBirthDate(),actualData.getBirthDate());
        assertEquals(expectedData.getPhone(),actualData.getPhone());
        assertEquals(expectedData.getGender(),actualData.getGender());
        assertEquals(expectedData.getBloodGroup(),actualData.getBloodGroup());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getDescription(),actualData.getDescription());

}
}


/*

{
    "createdBy": "hp06-team18",
    "createdDate": "2022-11-21T09:35:09.334760Z",
    "id": 318263,
    "firstName": "zeka1H",
    "lastName": "zeka1H",
    "birthDate": "2022-11-20T21:00:00Z",
    "phone": "011-222-3333",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "meydan ",
    "email": "zeka1H@gmail.com",
    "description": "",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2021-12-25T16:44:14.972932Z",
        "id": 3313,
        "login": "jonnyjones",
        "firstName": "Johnny",
        "lastName": "Jones",
        "email": "jonnyj@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "358-65-3578"
    },
    "appointments": null,
    "inPatients": null,
    "country": null,
    "cstate": null
}
 */
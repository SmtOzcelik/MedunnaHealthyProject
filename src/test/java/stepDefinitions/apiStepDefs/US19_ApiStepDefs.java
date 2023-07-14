package stepDefinitions.apiStepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import pojos.US19Pojo.US19Staff;
import pojos.US19Pojo.US19User;
import utilities.Authentication;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US19_ApiStepDefs  {
    /*
       {
    "createdBy": "team22",
    "createdDate": "2022-12-08T11:00:14.878014Z",
    "id": 381899,
    "firstName": "personel",
    "lastName": "serap",
    "birthDate": "2022-12-07T23:00:00Z",
    "phone": "458-569-5844",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "",
    "description": "",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-11-17T16:04:35.829907Z",
        "id": 307508,
        "login": "personelserap2",
        "firstName": "personel",
        "lastName": "serap",
        "email": "personelserap2@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "135-78-1112"
    },
    "country": null,
    "cstate": null
}
         */

    RequestSpecification spec;
    Response response;

    @Given("gereken endpoint ayarlanir")
    public void gerekenEndpointAyarlanir() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
        spec.pathParams("1","api","2", "staff", "3", 381899);

    }

    @When("get sorgusu gonderilir")
    public void getSorgusuGonderilir() {
        response = given().spec(spec).headers("Authorization","Bearer "+generateToken()).get("{1}/{2}/{3}");
        response.prettyPrint();
    }

    @Then("status kodunun {string} oldugu dogrulanir")
    public void statusKodununOlduguDogrulanir(String arg0) {

        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("response bodysinin beklenen sekilde geldigi dogrulanir")
    public void responseBodysininBeklenenSekildeGeldigiDogrulanir() {
        US19User user=new US19User(307508,"personelserap2","135-78-1112","personel","serap","personelserap2@gmail.com",
                null,true,"en","anonymousUser");

        US19Staff exData=new US19Staff("personel","serap","2022-12-07T23:00:00Z","458-569-5844","MALE","Apositive","","",
                user);

        System.out.println("exData = " + exData);


        US19Staff actualData=ObjectMapperUtils.convertJsonToJava(response.asString(), US19Staff.class);
        System.out.println("actualData = " + actualData);


        Assert.assertEquals(exData.getFirstName(),actualData.getFirstName());
        Assert.assertEquals(exData.getLastName(),actualData.getLastName());
        Assert.assertEquals(exData.getBirthDate(),actualData.getBirthDate());
        Assert.assertEquals(exData.getPhone(),actualData.getPhone());
        Assert.assertEquals(exData.getGender(),actualData.getGender());
        Assert.assertEquals(exData.getBloodGroup(),actualData.getBloodGroup());
        Assert.assertEquals(exData.getAdress(),actualData.getAdress());
        Assert.assertEquals(exData.getDescription(),actualData.getDescription());






    }
}
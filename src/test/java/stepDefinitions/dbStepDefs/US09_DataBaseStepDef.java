package stepDefinitions.dbStepDefs;

import io.cucumber.java.en.*;
import pojos.US09Pojo.AppoinmentPojo;
import pojos.US09Pojo.CountryPojo;
import pojos.US09Pojo.UserPojo;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getRowMap;

public class US09_DataBaseStepDef {


    Map<String, Object> hastaBilgileri;

    String query = "select * from patient where id=4856";

    static UserPojo user;

    static CountryPojo country;

    static AppoinmentPojo expectedData;

    @Given("Staff connection baglantisini yapar")
    public void staff_connection_baglantisini_yapar() {
        createConnection();
    }
    @Then("Staff hasta bilgilerini request yapar")
    public void staff_hasta_bilgilerini_request_yapar() {
       hastaBilgileri = getRowMap(query);
        System.out.println("hastaBilgileri = " + hastaBilgileri);
    }
    @Then("Staff hasta bilgilerini dogrular")
    public void staff_hasta_bilgilerini_dogrular() {
        user=new UserPojo("teamadmin86","2022-07-20T21:07:28.837545Z",131032,"hy","pk","456-87-1234","hy@gmail.com",false,"en",null,"2022-07-20T21:07:28.836771Z","456-87-1234");
        country=new CountryPojo(263705,"TURKEY");
        expectedData=new AppoinmentPojo("patient2","2021-12-31T18:37:27.252314Z",4856,"Adanali01","Turkiyeliii",null,"5555555555","Apositive","MALE","sananeGardasYaw","bosversenee@gmail.com","",user,null,null,country,null);


        String actualPatientIDString = hastaBilgileri.get("user_id").toString();

        int actualPatientId= Integer.valueOf(actualPatientIDString);
        System.out.println("actualPatientID = " + actualPatientIDString);


        String actualFirstname= hastaBilgileri.get("first_name").toString();
        System.out.println("actualFirstname = " + actualFirstname);

        String actualEmail= hastaBilgileri.get("email").toString();
        System.out.println("actualEmail = " + actualEmail);

        assertEquals(user.getId(),actualPatientId);
        assertEquals(expectedData.getFirstName(),actualFirstname);
        assertEquals(expectedData.getEmail(),actualEmail);

    }
}

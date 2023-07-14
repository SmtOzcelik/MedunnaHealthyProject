package stepDefinitions.dbStepDefs;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;
import pojos.US10Pojo.Appointment_Pojo;
import pojos.US10Pojo.Patient_Pojo;
import pojos.US10Pojo.PhysicianPojo;
import pojos.US10Pojo.UserPojo;

import java.util.Map;

import static utilities.DatabaseUtility.*;

public class US10_DataBaseStefDef {

        Map<String, Object> randevuBilgileri;

        String query = "Select * from appointment where id = 381005";

        static Appointment_Pojo expectedData;
        static UserPojo user;
        static Patient_Pojo patient;
        static PhysicianPojo physician;
    @Given("Kullanici connection baglantisini yapar")
    public void kullanici_connection_baglantisini_yapar() {createConnection();}
    @Then("Kullanici hasta bilgilerini request yapar")
    public void kullanici_hasta_bilgilerini_request_yapar() {
        randevuBilgileri = getRowMap(query);
        System.out.println("randevuBilgileri = " + randevuBilgileri);
    }


    @Then("Kullanici hasta bilgilerini dogrular")
    public void kullanici_hasta_bilgilerini_dogrular() {
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

        String actualPatientIDString = randevuBilgileri.get("patient_id").toString();

        int actualPatientId= Integer.valueOf(actualPatientIDString);
        System.out.println("actualPatientID = " + actualPatientIDString);

        String actualStatus = randevuBilgileri.get("status").toString();
        System.out.println("actualStatus = " + actualStatus);

        String actualStartDate= randevuBilgileri.get("start_date").toString();
        System.out.println("startDate = " + actualStartDate);

        String actualEndDate= randevuBilgileri.get("end_date").toString();
        System.out.println("actualEndDate = " + actualEndDate);

        assertEquals(patient.getId(),actualPatientId);
        assertEquals(expectedData.getStatus(),actualStatus);






    }

}

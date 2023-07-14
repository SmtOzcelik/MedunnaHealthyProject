package stepDefinitions.dbStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class US07_db {
    String query;
    Object actualData;
    Object expectedData;


    @Given("DKullanici database baglanir")
    public void dkullaniciDatabaseBaglanir() {
        DatabaseUtility.createConnection();
    }

    @And("DKullanici randevu tablosundan verileri alir")
    public void dkullaniciRandevuTablosundanVerileriAlir() {
        query="select * from public.appointment";

        System.out.println(DatabaseUtility.getColumnNames(query));

        actualData=new HashMap<>(DatabaseUtility.getRowMap(query));
        System.out.println("actualData = " + actualData);
        expectedData=new HashMap<>(DatabaseUtility.getRowMap(query));
        System.out.println("expectedData = " + expectedData);

        List<Object> patientInfo=getColumnData(query,"patient_id");
        patientInfo.add(getColumnData(query,"created_by"));
        patientInfo.add(getColumnData(query,"id"));


        System.out.println( patientInfo);

        //  String fileName="src/test/resources/testdata/Patients.txt";
        //  WriteToTxt.savePatients(fileName,patientInfo);

    }

    @Then("DKullanici aldigi bilgileri dogrular")
    public void dkullaniciAldigiBilgileriDogrular() {
        Assert.assertEquals(actualData,expectedData);

    }

    @And("DKullanici database baglantisini kapatir")
    public void dkullaniciDatabaseBaglantisiniKapatir() {
        DatabaseUtility.closeConnection();


    }
}
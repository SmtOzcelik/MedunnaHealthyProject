package stepDefinitions.dbStepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.getRowMap;


public class US05_db {

    Map<String,Object> actualData;

    // ne yapayım hocam ? neresi çalışmıyo hocam bu class rannerr dan
    @Given("ZAKullanici connection kurar")
    public void zakullaniciConnectionKurar() {
        DatabaseUtility.createConnection(ConfigReader.getProperty("database_url"),
                ConfigReader.getProperty("database_username"),
                ConfigReader.getProperty("database_password"));
    }

    @And("ZAKullanici id hasta biligilerini ceker")
    public void zakullaniciIdHastaBiligileriniCeker() {
        String query="SELECT * FROM public.patient where id=318263";
        actualData= getRowMap(query);
        System.out.println(getRowMap(query));
    }

    @Then("ZAKullanici bilgilerini dogrular")
    public void zakullaniciBilgileriniDogrular() {
        assertEquals((long)318263,actualData.get("id"));

    }
}

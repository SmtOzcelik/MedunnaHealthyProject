package stepDefinitions.dbStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DataBaseUS19Utils;

import java.sql.SQLException;

public class US19DataBaseStepDef {
    @Given("KullaniciAbd database baglanir")
    public void kullaniciabdDatabaseBaglanir() {
        DataBaseUS19Utils.createConnection();
    }

    @When("KullaniciAbd {string} {string} ile {string} tablosundan {string} alir")
    public void kullaniciabdIleTablosundanAlir(String column, String table, String idColumn, String actualId) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DataBaseUS19Utils.executeQuery(query);
    }

    @Then("KullaniciAbd {string} {string} olmalidir")
    public void kullaniciabdOlmalidir(String firstNameColumn, String actualFirstName) throws SQLException {
        DataBaseUS19Utils.getResultset().next();

    }

    @And("KullaniciAbd database baglantisini kapatir")
    public void kullaniciabdDatabaseBaglantisiniKapatir() {

        DataBaseUS19Utils.closeConnection();
    }
}

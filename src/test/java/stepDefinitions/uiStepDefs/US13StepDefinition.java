package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Aysun;
import pages.Cuneyt;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US13StepDefinition {

   Aysun page = new Aysun();

    @Given("Staff Url adresine gider")
    public void staff_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }
    @Then("Kullanici girisine tiklar")
    public void kullanici_girisine_tiklar() {
        page.ilkButon.click();
    }
    @Then("Staff Login islemini gerceklestirir")
    public void staffLoginIsleminiGerceklestirir() {
        page.ilkSignIn.click();
        ReusableMethods.waitFor(2);
        page.username.sendKeys(ConfigReader.getProperty("Staff2UserName"));
        page.password.sendKeys(ConfigReader.getProperty("Staff2PassWord"));
        page.signinButton.click();
    }
    @Then("Staff,My Pages sekmesi altinda Search Patient e tiklar")
    public void staff_my_pages_sekmesi_altinda_search_patient_e_tiklar() {
     ReusableMethods.waitFor(1);
     page.myPagesButton.click();
     ReusableMethods.waitFor(1);
     page.searchPatientButton.click();
    }
    @Then("Staff,SSN numarasini girerek hastayi goruntuler")
    public void staff_ssn_numarasini_girerek_hastayi_goruntuler() {
     ReusableMethods.waitFor(1);
     page.patientSSNbutton.sendKeys(ConfigReader.getProperty("SSNnumber"));
    }
    @Then("Staff,Show Appointments butonuna tiklar")
    public void staff_show_appointments_butonuna_tiklar() {
     ReusableMethods.waitFor(1);
     page.showAppointmentsButton.click();
    }
    @Then("Staff,Show Tests butonuna tiklar")
    public void staff_show_tests_butonuna_tiklar() {
     ReusableMethods.waitFor(1);
     page.showTestsButton.click();
    }
    @Then("Staff,View Results butonuna tiklar")
    public void staff_view_results_butonuna_tiklar() {
     ReusableMethods.waitForClickablility(page.viewResultButton,2);
     page.viewResultButton.click();
    }

    @Then("Staff,Edit butonuna tiklar")
    public void staff_edit_butonuna_tiklar() {
     ReusableMethods.waitFor(1);
     page.editButton.click();

    }
    @Then("Staff cikan sayfada test sonucunu girer")
    public void staff_cikan_sayfada_test_sonucunu_girer() {

        Random rand = new Random();
        String result = "";
        for (int i = 0; i < 8; i++) {
            int upperbound = 101;
            int int_random = rand.nextInt(upperbound);
            result = String.valueOf(int_random);
            page.resultTextBox.clear();
            page.resultTextBox.sendKeys(result);
        }
    }

    @Then("Staff save butonuna tiklayarak test sonucunu kaydeder")
    public void staff_save_butonuna_tiklayarak_test_sonucunu_kaydeder() {

        ReusableMethods.waitFor(2);
        page.saveButton.click();
        ReusableMethods.waitForVisibility(page.resultUpdateNotification, 2);
        Assert.assertTrue(page.resultUpdateNotification.isEnabled());
    }
    @And("Staff sayfayi kapatir")
    public void staffSayfayiKapatir() {
        Driver.closeDriver();
    }
    @Given("Doctor Url adresine gider")
    public void doctorUrlAdresineGider() {

        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }
    @Then("Doctor Kullanici girisine tiklar")
    public void doctorKullaniciGirisineTiklar() {
        page.ilkButon.click();
    }

    @And("Doctor Login islemini gerceklestirir")
    public void doctorLoginIsleminiGerceklestirir() {
        page.ilkSignIn.click();
        ReusableMethods.waitFor(2);
        page.username.sendKeys(ConfigReader.getProperty("Doctorusername"));
        page.password.sendKeys(ConfigReader.getProperty("Doctorpassword"));
        page.signinButton.click();

    }@And("Doktor my appointments a tiklar")
    public void doktorMyAppointmentsATiklar() {
        ReusableMethods.waitFor(1);
        page.myPagesButton.click();
        ReusableMethods.waitFor(1);
        page.myAppointments.click();

    }
    @And("Doktor edit e tiklar")
    public void doktorEditETiklar() {
        page.drEditButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Doktor show test results a tiklar")
    public void doktorShowTestResultsATiklar() {
        page.showTestResultsButton.click();
        ReusableMethods.waitFor(2);
        page.viewResultButton.click();

    }

    @And("Doktor test sonuclarini gordugunu dogrular")
    public void doktorTestSonuclariniGordugunuDogrular() {

       List<String> actualItems = new ArrayList<>(page.items.size());
        for (WebElement w : page.items) {
            actualItems.add(w.getText());
        }
        actualItems.forEach(System.out::println);


        List<String> expectedItems = new ArrayList<>(actualItems.size());
        expectedItems.add("ID");
        expectedItems.add("Name");
        expectedItems.add("Result");
        expectedItems.add("Default Min. Value");
        expectedItems.add("Default Max. Value");
        expectedItems.add(" Test");
        expectedItems.add("Description");
        expectedItems.add("Date");
        for (int i = 0; i < expectedItems.size(); i++) {

            Assert.assertEquals(expectedItems.get(i),actualItems.get(i));
        }
    }

        @And("Doktor Request Impatient a tiklayabilir \\(hastanin yatili tedavi gormesi) isteginde bulunabilmelidir.")
    public void doktorRequestImpatientATiklayabilirHastaninYatiliTedaviGormesiIstegindeBulunabilmelidir() {

            Driver.getDriver().navigate().back();
            Driver.getDriver().navigate().back();
            page.requestInpatientButton.click();
    }



}
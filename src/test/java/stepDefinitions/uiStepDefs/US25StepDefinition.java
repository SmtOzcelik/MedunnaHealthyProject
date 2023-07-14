package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Cayten;
import utilities.*;


public class US25StepDefinition {
    Cayten medunna=new Cayten();
    @Given("Kullanici url adresine gider.")
    public void kullanici_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }
    @When("Kullanici bilgi sekmesine tiklanir.")
    public void kullanici_bilgi_sekmesine_tiklanir() {
     medunna.kullaniciGirisButton.click();

    }
    @Then("Kullanici sing in sekmesine tiklar.")
    public void kullanici_sing_in_sekmesine_tiklar() {
    medunna.signInButton.click();
    }
    @Then("Kullanici username i girer.")
    public void kullanici_username_i_girer() {
        ReusableMethods.waitFor(1);
     medunna.usernameTextBox.sendKeys(ConfigReader.getProperty("PatientUserName"));
    }
    @Then("Kullanici password u girer.")
    public void kullanici_password_u_girer() {
        ReusableMethods.waitFor(1);
     medunna.passwordTextBox.sendKeys(ConfigReader.getProperty("PatientPassword"));
    }
    @Then("Kullanici sing in buttonuna basar.")
    public void kullanici_sing_in_buttonuna_basar() {
        ReusableMethods.waitFor(1);
     medunna.signIn.click();
    }
    @Then("Kullanici MY PAGES a tiklar.")
    public void kullanici_my_pages_a_tiklar() {
        ReusableMethods.waitFor(1);
      medunna.myPages.click();
    }
    @Then("Kullanici Make an Appointment a tiklar.")
    public void kullanici_make_an_appointment_a_tiklar() {
        ReusableMethods.waitFor(1);
      medunna.makeAnAppointment.click();
    }
    @Then("Kullanici First Name, Last Name, SSN, Email, Phone, Appointment DateTime bilgilerini girer.")
    public void kullanici_first_name_last_name_ssn_email_phone_appointment_date_time_bilgilerini_girer() {
        ReusableMethods.waitFor(1);
        medunna.firstName.clear();
        medunna.firstName.sendKeys("Gülşen");
        medunna.lastName.clear();
        medunna.lastName.sendKeys("Koç");
        medunna.ssn.clear();
        medunna.ssn.sendKeys("123-23-3322");
        medunna.email.clear();
        medunna.email.sendKeys("glsn50@gmail.com");
        medunna.phone.sendKeys("505-555-5555");
        medunna.date.clear();
        medunna.date.sendKeys("03.12.2022");

    }
    @Then("Kullanici Send an Appointment Request butonuna tiklar.")
    public void kullanici_send_an_appointment_request_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.jsExecutorScrool(medunna.sendAnAppointmentRequest);
        ReusableMethods.waitFor(1);
        ReusableMethods.jsExecutorClick(medunna.sendAnAppointmentRequest);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(medunna.create.isDisplayed());
    }


    @And("Kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }

    @When("Kullanici  Make an Appointment a tiklar.")
    public void kullaniciMakeAnAppointmentATiklar() {
        medunna.makeanAppointment.click();
    }
}

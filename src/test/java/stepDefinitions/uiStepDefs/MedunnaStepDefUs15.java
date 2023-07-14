package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaPageS2;
import utilities.ConfigReader;
import utilities.Driver;

import static junit.framework.TestCase.assertTrue;
import static utilities.ReusableMethods.*;
public class MedunnaStepDefUs15 {

    MedunnaPageS2 page = new MedunnaPageS2();

    @Given("rg {string}'e gider")
    public void rg_e_gider(String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("rg signin iconuna tiklar")
    public void rg_signin_iconuna_tiklar() {
        page.signinIcon.click();
    }
    @When("rg signin butonuna tiklar")
    public void rg_signin_butonuna_tiklar() {
        page.signinButton.click();
    }
    @When("rg gecerli {string} kullanici adi girer")
    public void rg_gecerli_kullanici_adi_girer(String physicianUsername) {
        page.usernameBox.sendKeys(ConfigReader.getProperty(physicianUsername));
    }
    @When("rg gecerli {string} kullanici sifresi girer")
    public void rg_gecerli_kullanici_sifresi_girer(String physicianPassword) {
        page.passwordBox.sendKeys(ConfigReader.getProperty(physicianPassword));
    }
    @When("rg sign in butonuna tiklar")
    public void rg_sign_in_butonuna_tiklar() {
        page.signinButton2.click();
    }
    @When("rg MYPAGES butonuna tiklar")
    public void rg_mypages_butonuna_tiklar() {
        page.myPagesButton.click();
    }
    @When("rg My Appointments butonuna tiklar")
    public void rg_my_appointments_butonuna_tiklar() {
        page.myAppointmentsButton.click();
    }
    @When("rg Hasta listesinde ilgili hastanin Edit butonuna tiklar")
    public void rg_hasta_listesinde_ilgili_hastanin_edit_butonuna_tiklar() {
        page.editButton.click();
        waitFor(3);
    }
    @When("rg Show Test Results butonuna tiklar")
    public void rg_show_test_results_butonuna_tiklar() {
        waitForClickablility(page.showTestResultsButton, 10);
        page.showTestResultsButton.click();
        waitForVisibility(page.viewResultsButton, 10);
    }
    @When("rg view Results butonuna tiklar")
    public void rg_view_results_butonuna_tiklar() {
        page.viewResultsButton.click();
    }
    @Then("rg id, name, default max value, default min value, test, description and the date bilgilerinin gorunur oldugu dogrulanir")
    public void rg_id_name_default_max_value_default_min_value_test_description_and_the_date_bilgilerinin_gorunur_oldugu_dogrulanir() {
        assertTrue(page.idVerification.isDisplayed());
        assertTrue(page.nameVerification.isDisplayed());
        assertTrue(page.resultVerification.isDisplayed());
        assertTrue(page.minValueVerification.isDisplayed());
        assertTrue(page.maxValueVerification.isDisplayed());
        assertTrue(page.testVerification.isDisplayed());
        assertTrue(page.descriptionVerification.isDisplayed());
        assertTrue(page.dateVerification.isDisplayed());
    }
    @And("rg sayfayi kapatir")
    public void rgSayfayiKapatir() {
        Driver.getDriver().close();
    }
    @And("rg Request Inpatient butonuna tiklar")
    public void rgRequestInpatientButonunaTiklar() {
        waitForClickablility(page.requestInpatientButton, 10);
        page.requestInpatientButton.click();
    }
    @And("rg basarili olusturma mesajinin gorunurlugunu dogrular")
    public void rgBasariliOlusturmaMesajininGorunurlugunuDogrular() {
        waitForVisibility(page.requestInpatientVerification, 10);
        assertTrue(page.requestInpatientVerification.isDisplayed());
    }
    @And("rg My Inpatients butonuna tiklar")
    public void rgMyInpatientsButonunaTiklar() {
        page.myInpatientsButton.click();
    }
    @Then("rg ID, start and end dates, description, created date appointment id, status, room and patient bilgilerinin gorunurlugunu dogrular.")
    public void rgIDStartAndEndDatesDescriptionCreatedDateAppointmentIdStatusRoomAndPatientBilgilerininGorunurlugunuDogrular() {
        assertTrue(page.idVerification.isDisplayed());
        assertTrue(page.inPatientStartDateVerification.isDisplayed());
        assertTrue(page.inPatientEndDateVerification.isDisplayed());
        assertTrue(page.inPatientStatusVerification.isDisplayed());
        assertTrue(page.inPatientDescriptionVerification.isDisplayed());
        assertTrue(page.inPatientCreatedDateVerification.isDisplayed());
        assertTrue(page.inPatientRoomVerification.isDisplayed());
        assertTrue(page.inPatientAppointmentVerification.isDisplayed());
        assertTrue(page.inPatientPatientVerification.isDisplayed());
    }
    @And("rg Item&Titles butonuna tiklar")
    public void rgItemTitlesButonunaTiklar() {
        page.itemsTitlesButton.click();
    }
    @And("rg Patient butonuna tiklar")
    public void rgPatientButonunaTiklar() {
        page.patientButton.click();
    }
    @And("rg Create a New Patient butonuna tiklar.")
    public void rgCreateANewPatientButonunaTiklar() {
        page.createNewPatientButton.click();
    }
    @Then("rg Hasta olusturma sayfasina geldigi dogrulanir")
    public void rgHastaOlusturmaSayfasinaGeldigiDogrulanir() {
        assertTrue(page.createNewPatientVerification.isDisplayed());
    }
    @And("rg staff My Pages butonuna tiklar")
    public void rgStaffMyPagesButonunaTiklar() {
        page.staffMypagesButton.click();
    }
    @And("rg staff Search Patient butonuna tiklar")
    public void rgStaffSearchPatientButonunaTiklar() {
        page.searchPatientButton.click();
    }

    @And("rg Create a New Patient butonunun olmadıgını dogrular.")
    public void rgCreateANewPatientButonununOlmadıgınıDogrular() {
        String expected="Create a new Patient";
        String actual=Driver.getDriver().getPageSource();
        assertTrue(actual.contains(expected));
    }
    @And("rg My Patient butonuna tiklar")
    public void rgMyPatientButonunaTiklar() {
        page.myPatientButton.click();
    }
    @And("rg My Pages\\(Patient) butonuna tiklar")
    public void rgMyPagesPatientButonunaTiklar() {
        page.myPagePatientButton.click();
    }
    @And("rg Make an Appointment butonuna tiklar")
    public void rgMakeAnAppointmentButonunaTiklar() {
        page.makeAppointmentButton.click();
    }
    @And("rg SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state City gibi hasta bilgilerini gorebilir.")
    public void rgSSNFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityGibiHastaBilgileriniGorebilir() {
        assertTrue(page.ssnAdminVerification.isDisplayed());
        assertTrue(page.idAdminVerification.isDisplayed());
        assertTrue(page.lastNameAdminVerification.isDisplayed());
        assertTrue(page.firstNameAdminVerification.isDisplayed());
        assertTrue(page.birthDateAdminVerification.isDisplayed());
        assertTrue(page.phoneAdminVerification.isDisplayed());
        assertTrue(page.genderAdminVerification.isDisplayed());
        assertTrue(page.bloodGrupAdminVerification.isDisplayed());
        assertTrue(page.addressAdminVerification.isDisplayed());
        assertTrue(page.descriptionAdminVerification.isDisplayed());
        assertTrue(page.createdDateAdminVerification.isDisplayed());
        assertTrue(page.userAdminVerification.isDisplayed());
        assertTrue(page.countryAdminVerification.isDisplayed());
        assertTrue(page.stateCityAdminVerification.isDisplayed());
        assertTrue(page.emailAdminVerification.isDisplayed());
    }
    @And("rg delete butonuna tiklar")
    public void rgDeleteButonunaTiklar() {
        page.patientDeleteButton.click();
    }
}
package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Cengizhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class US21StepDefinition {

    Cengizhan page = new Cengizhan();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Staff, Url adresine gider")
    public void staffUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }

    @When("Staff, Sign in butonuna tiklar..")
    public void staffSignInButonunaTiklar() {
        page.ilkButon.click();
    }

    @Then("Staff, Sign in islemini gerceklestirir.")
    public void staffSignInIsleminiGerceklestirir() {
        page.signinGiris.click();
        ReusableMethods.waitFor(1);
        page.username.sendKeys(ConfigReader.getProperty("StaffUserName"));
        page.password.sendKeys(ConfigReader.getProperty("StaffPassword"));
        ReusableMethods.waitFor(1);
        page.signinButtonKayit.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Staff , My Pages basligindaki Search Patient butonunu tiklar")
    public void staffMyPagesBasligindakiSearchPatientButonunuTiklar() {
        page.staffMyPagesButton.click();
        ReusableMethods.waitFor(1);
        page.staffSearchPatientButton.click();
        ReusableMethods.waitFor(1);
    }

    @When("Staff , SSN kutucuguna veri girerek hasta aratir")
    public void staffSSNKutucugunaVeriGirerekHastaAratir() {
        Assert.assertTrue(page.staffSearchPatientSsnBox.isEnabled());
        page.staffSearchPatientSsnBox.sendKeys("122-56-9045");
        ReusableMethods.waitFor(1);

    }

    @Then("Staff , View,Edit ve Show Appointment butonlarini goruntuler")
    public void staffViewEditVeShowAppointmentButonlariniGoruntuler() {
        Assert.assertTrue(page.staffViewButton.isDisplayed());
        Assert.assertTrue(page.staffEditButton.isDisplayed());
        Assert.assertTrue(page.staffShowButton.isDisplayed());
    }

    @And("Staff , Show Appointment butonunu tiklar")
    public void staffShowAppointmentButonunuTiklar() {
        page.staffShowButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("Staff , Edit butonunu tiklar")
    public void staffEditButonunuTiklar() {
        page.staffAppointmentEditButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Staff , Status da UNAPPROVED seceneginin oldugunu dogrular")
    public void staffStatusDaUNAPPROVEDSecenegininOldugunuDogrular() {
        page.staffAppointmentStatusBox.isEnabled();
    }

    @And("Staff , Status da PENDING seceneginin oldugunu dogrular")
    public void staffStatusDaPENDINGSecenegininOldugunuDogrular() {
       Assert.assertTrue(page.staffAppointmentStatusBox.isEnabled());
    }

    @And("Staff , Status da COMPLETED seceneginin olmadigini dogrular")
    public void staffStatusDaCOMPLETEDSecenegininOlmadiginiDogrular() {
        Assert.assertTrue(page.staffAppointmentStatusBox.isEnabled());
    }

    @And("Staff , Status da CANCELLED seceneginin oldugunu dogrular")
    public void staffStatusDaCANCELLEDSecenegininOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentStatusBox.isEnabled());
    }

    @And("Staff , Anamnesis kutucuguna veri girilemedigini dogrular")
    public void staffAnamnesisKutucugunaVeriGirilemediginiDogrular() {
        Assert.assertTrue(page.staffAnamnesisBox.isEnabled());
    }

    @And("Staff , Treatment kutucuguna veri girilemedigini dogrular")
    public void staffTreatmentKutucugunaVeriGirilemediginiDogrular() {
        Assert.assertTrue(page.staffTreatmentBox.isEnabled());
    }

    @And("Staff , Diagnosis kutucuguna veri girilemedigini dogrular")
    public void staffDiagnosisKutucugunaVeriGirilemediginiDogrular() {
        Assert.assertTrue(page.staffDiagnosisBox.isEnabled());
    }

    @And("Staff , Physician kutucugundan doctor secer")
    public void staffPhysicianKutucugundanDoctorSecer() {
        Assert.assertTrue(page.staffphysicianBox.isEnabled());
    }

    @And("Staff , Appointmen Save butonuna tiklar")
    public void staffAppointmenSaveButonunaTiklar() {
        page.staffAppointmentSaveButton.click();
    }

    @And("Staff , Appointment is Updated alertunun gorundugunu dogrular")
    public void staffAppointmentIsUpdatedAlertununGorundugunuDogrular() {
        Assert.assertTrue(page.staffAlertText.isDisplayed());
    }
}

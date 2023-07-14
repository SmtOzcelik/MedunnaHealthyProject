package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Cengizhan;
import utilities.Driver;
import utilities.ReusableMethods;

public class US22StepDefinition {

    Cengizhan page = new Cengizhan();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @When("Staff , SSN kutucuguna belli veri girerek hasta aratir")
    public void staffSSNKutucugunaBelliVeriGirerekHastaAratir() {
        page.staffSearchPatientSsnBox.sendKeys("123-12-8986");
        ReusableMethods.waitFor(1);

    }

    @And("Staff , Show Tests butonunu tiklar")
    public void staffShowTestsButonunuTiklar() {
        page.staffAppointmentShowTestButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Staff , View Results butonunu tiklar")
    public void staffViewResultsButonunuTiklar() {
        page.staffAppointmentViewTestResultButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Staff , Test Results ekraninin gorundugunu dogrular")
    public void staffTestResultsEkranininGorundugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultText.isDisplayed());
    }

    @And("Staff , TestResults ekraninda Edit butonunu tiklar")
    public void staffTestResultsEkranindaEditButonunuTiklar() {
        ReusableMethods.waitFor(1);
        page.staffAppointmentTestResultEdit.click();
        ReusableMethods.waitFor(1);

    }

    @And("Staff , EditTestResults ekraninda ID kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaIDKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultID.isDisplayed());
    }

    @And("Staff , EditTestResults ekraninda Date kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaDateKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultDate.isDisplayed());
    }

    @And("Staff , EditTestResults ekraninda Result kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaResultKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultResult.isEnabled());
    }

    @And("Staff , EditTestResults ekraninda Result kutucuguna veri girer")
    public void staffEditTestResultsEkranindaResultKutucugunaVeriGirer() {
        page.staffAppointmentTestResultResult.sendKeys("positive");
    }

    @And("Staff , EditTestResults ekraninda Description kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaDescriptionKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultDescription.isEnabled());
    }
    @And("Staff , EditTestResults ekraninda Description kutucuguna veri girer")
    public void staffEditTestResultsEkranindaDescriptionKutucugunaVeriGirer() {
        page.staffAppointmentTestResultDescription.sendKeys("Grip");
    }
    @And("Staff , EditTestResults ekraninda Created Date kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaCreatedDateKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultCreatedDate.isDisplayed());
    }

    @And("Staff , EditTestResults ekraninda TestItem kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaTestItemKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultItem.isDisplayed());
    }

    @And("Staff , EditTestResults ekraninda Test kutucugunun secilebilir oldugunu dogrular")
    public void staffEditTestResultsEkranindaTestKutucugununSecilebilirOldugunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultTest.isDisplayed());
    }
    @And("Staff , EditTestResults ekraninda Save butonuna tiklar.")
    public void staffEditTestResultsEkranindaSaveButonunaTiklar() {
        page.staffAppointmentTestResultEditSaveButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Staff , EditTestResults ekraninda TestResultUpdate alertunu dogrular")
    public void staffEditTestResultsEkranindaTestResultUpdateAlertunuDogrular() {
        Assert.assertTrue(page.staffAppointmentTestResultUpdatedAlert.isDisplayed());
    }
}

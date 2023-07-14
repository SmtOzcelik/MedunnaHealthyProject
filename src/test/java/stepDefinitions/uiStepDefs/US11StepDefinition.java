package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Cuneyt;
import utilities.*;


public class US11StepDefinition {

    Cuneyt page = new Cuneyt();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Dr. Url adresine gider")
    public void dr_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));

    }

    @Then("Dr.Kullanici bilgi sekmesini tiklar")
    public void dr_kullanici_bilgi_sekmesini_tiklar() {
        page.ilkButon.click();
    }

    @Then("Dr.Login islemini gerceklestirir")
    public void dr_login_islemini_gerceklestirir() {
        page.signinGiris.click();
        ReusableMethods.waitFor(2);
        page.username.sendKeys(ConfigReader.getProperty("Drusername"));
        page.password.sendKeys(ConfigReader.getProperty("Drpassword"));
        ReusableMethods.waitFor(2);
        page.signinButtonKayit.click();
    }

    @Then("Dr.MY PAGES sekmesini tiklar")
    public void dr_my_pages_sekmesini_tiklar() {
        ReusableMethods.waitFor(1);
        page.myPages.click();

    }

    @Then("Dr.My Appointments sekmesine tiklar")
    public void dr_my_appointments_sekmesine_tiklar() {
        ReusableMethods.waitFor(1);
        page.myAppointments.click();
    }

    @Then("Dr.Hasta randevu listesini goruntuler")
    public void dr_hasta_randevu_listesini_goruntuler() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.hastaListesi.isDisplayed());
    }

    @Then("Dr.Edit butonuna tiklar")
    public void dr_edit_butonuna_tiklar() {
        page.editButonu.click();

    }

    @Then("Dr.Create or edit an apppointment menusune ulasir")
    public void dr_create_or_edit_an_apppointment_menusune_ulasir() {
        Assert.assertTrue(page.createEditAppointmentText.isDisplayed());

    }

    @And("Dr. Hastanin id bilgisini gorunurlugunu dogrular")
    public void drHastaninIdBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.id.isDisplayed());
    }

    @And("Dr. Hastanin Start Date Time bilgisini gorunurlugunu dogrular")
    public void drHastaninStartDateTimeBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.startDateTime.isDisplayed());
    }

    @And("Dr. Hastanin End DateTime bilgisini gorunurlugunu dogrular")
    public void drHastaninEndDateTimeBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.endDateTime.isDisplayed());
    }

    @And("Dr. Hastanin Status bilgisini gorunurlugunu dogrular")
    public void drHastaninStatusBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.status.isDisplayed());
    }

    @And("Dr. Hastanin Physician bilgisini gorunurlugunu dogrular")
    public void drHastaninPhysicianBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.physician.isDisplayed());
    }

    @And("Dr. Hastanin Patient bilgisini gorunurlugunu dogrular")
    public void drHastaninPatientBilgisiniGorunurlugunuDogrular() {
        Assert.assertTrue(page.patient.isDisplayed());
    }

    @And("Dr. Edit butonuna tiklar")
    public void drEditButonunaTiklar() {
        page.editButonu.click();
    }

    @And("Dr. Anamnesis bolumu bos birakilamaz")
    public void drAnamnesisBolumuBosBirakilamaz() {

        page.anamnesisTextBox.click();
        ReusableMethods.waitFor(1);
        page.treatmentTextBox.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.anamnesisTextBoxDisplayed.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @And("Dr. Treatment bolumu bos birakilamaz")
    public void drTreatmentBolumuBosBirakilamaz() {
        page.diagnosisTextBox.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.treatmentTextBoxDisplayed.isDisplayed());

    }

    @And("Dr. Diagnosis bolumu bos birakilamaz")
    public void drDiagnosisBolumuBosBirakilamaz() {

        page.diagnosisTextBox.click();
        ReusableMethods.waitFor(1);
        page.treatmentTextBox.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.diagnosisTextBoxDisplayed.isDisplayed());

    }

    @And("Dr. Anamnesis bolumune tiklar ve bilgileri girer.")
    public void drAnamnesisBolumuneTiklarVeBilgileriGirer() {
        page.anamnesisTextBox.sendKeys("herhangi bir sağlik sorunu yoktur.");
        ReusableMethods.waitFor(1);

    }

    @And("Dr. Treatment bolumune tiklar ve bilgileri girer.")
    public void drTreatmentBolumuneTiklarVeBilgileriGirer() {
        page.treatmentTextBox.sendKeys("ayakta tedavi");
        ReusableMethods.waitFor(1);


    }

    @And("Dr. Diagnosis bolumune tiklar ve bilgileri girer.")
    public void drDiagnosisBolumuneTiklarVeBilgileriGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("hastalık hastasi");
        ReusableMethods.waitFor(1);

    }

    @And("Dr. prescription bolumune istege bagli bilgi girer.")
    public void drPrescriptionBolumuneIstegeBagliBilgiGirer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.diagnosisTextBox.sendKeys("gunde 8(sekiz) saat uyusa yeterli");
        ReusableMethods.waitFor(2);

    }

    @And("Dr. description bolumune istege bagli bilgi girer.")
    public void drDescriptionBolumuneIstegeBagliBilgiGirer() {
        page.prescriptionTextBox.sendKeys("tamamen psikolojik");
        ReusableMethods.waitFor(3);
    }

    @And("Dr. Status e tiklar")
    public void drStatusETiklar() {

    }

    @And("Dr. acilan menude PENDING in secilebilir oldugunu dogrular.")
    public void drAcilanMenudePENDINGInSecilebilirOldugunuDogrular() {

        page.statusDropDown1.sendKeys("PENDING");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(page.pendingtext.isDisplayed());
    }

    @And("Dr. acilan menude COMPLETED in secilebilir oldugunu dogrular.")
    public void drAcilanMenudeCOMPLETEDInSecilebilirOldugunuDogrular() {

        page.statusDropDown1.sendKeys("COMPLETED");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.completedtext.isDisplayed());
    }

    @And("Dr. acilan menude CANCELLED in secilebilir oldugunu dogrular.")
    public void drAcilanMenudeCANCELLEDInSecilebilirOldugunuDogrular() {

        page.statusDropDown1.sendKeys("CANCELLED");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.cancelledtext.isDisplayed());
    }

    @And("Dr. acilan menude UNAPPROVED in secilemedigini dogrular.")
    public void drAcilanMenudeUNAPPROVEDInSecilemediginiDogrular() {
        page.statusDropDown1.sendKeys("UNAPPROVED");
        ReusableMethods.waitFor(2);
        Assert.assertFalse(page.unapprovedtext.isEnabled());
    }
}

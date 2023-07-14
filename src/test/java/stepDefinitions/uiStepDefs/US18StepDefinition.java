package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Cengizhan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Objects;

public class US18StepDefinition {
    Cengizhan page = new Cengizhan();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Admin, Url adresine gider")
    public void adminUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));

    }

    @When("Admin, Sign in butonuna tiklar..")
    public void adminSignInButonunaTiklar() {
        page.ilkButon.click();

    }

    @Then("Admin, Sign in islemini gerceklestirir.")
    public void adminSignInIsleminiGerceklestirir() {
        page.signinGiris.click();
        ReusableMethods.waitFor(1);
        page.username.sendKeys(ConfigReader.getProperty("AdminUserName"));
        page.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
        ReusableMethods.waitFor(1);
        page.signinButtonKayit.click();
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Doctors sekmesini tiklar")
    public void adminDoctorsSekmesiniTiklar() {
        page.itemTitleButon.click();
        ReusableMethods.waitFor(1);
    }
    @And("Admin, My Links basligi altindaki Physician linkini tiklar")
    public void adminMyLinksBasligiAltindakiPhysicianLinkiniTiklar() {
        page.physciansButon.click();
        ReusableMethods.waitFor(1);



       //page.CreatePhysciansButton.click();
       //ReusableMethods.waitFor(10);
       //actions.sendKeys(Keys.F5).perform();
       //ReusableMethods.waitFor(10);

       ////WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
       ////wait.until(ExpectedConditions.invisibilityOf(page.physciansListText));
       //actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Admin, Doctor listesini goruntuler")
    public void adminDoctorListesiniGoruntuler() {

        ReusableMethods.waitFor(15);
        Assert.assertTrue(page.physciansListText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Given("Admin, Create a new Physician butonunu tiklar")
    public void adminCreateANewPhysicianButonunuTiklar() {
        page.createPhysciansButton.click();
        ReusableMethods.waitFor(3);
    }

    @When("Admin, Use Search kutucugunu isaretler")
    public void adminUseSearchKutucugunuIsaretler() {
        page.useSearchButon.click();
    }

    @Then("Admin, SSN kutucuguna gecerli bir SSN verisi girer")
    public void adminSSNKutucugunaGecerliBirSSNVerisiGirer() {
        page.ssnTextBox.sendKeys("407-23-5599");
    }

    @And("Admin, Search User butonunu tiklar")
    public void adminSearchUserButonunuTiklar() {
        page.searchButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("Admin, girdigi SSN'e ait kaydi goruntuler")
    public void adminGirdigiSSNEAitKaydiGoruntuler() {

        Assert.assertTrue(page.created.isDisplayed());
    }

    @Then("Sayfayi Kapat..")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }

    @And("Admin, Edit butonunu tiklar")
    public void adminEditButonunuTiklar() {

       // js.executeScript("arguments[0].scrollIntoView(true);", page.editButton);
       // ReusableMethods.waitFor(3);
        page.editButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Doctor bilgilerinin yer aldigi ekrani goruntuler")
    public void adminDoctorBilgilerininYerAldigiEkraniGoruntuler() {
        js.executeScript("arguments[0].scrollIntoView(true)",page.saveButton);
        Assert.assertTrue(page.saveButton.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, First Name kutucuguna yeni veri girer")
    public void adminFirstNameKutucugunaYeniVeriGirer() {
        Assert.assertTrue(page.firstNameBox.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, LastName kutucuguna yeni veri girer")
    public void adminLastNameKutucugunaYeniVeriGirer() {
        Assert.assertTrue(page.lastNameBox.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Birdt Day kutucuguna yeni veri girer")
    public void adminBirdtDayKutucugunaYeniVeriGirer() {
        Assert.assertTrue(page.birthDateBox.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Speciality kutucugunda ddm'den secim yapar")
    public void adminSpecialityKutucugundaDdmDenSecimYapar() {
        Assert.assertTrue(page.specialityBox.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Choose File butonunu tiklar")
    public void adminChooseFileButonunuTiklar() {
        Assert.assertTrue(page.chooseFileButton.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Exam Fee kutucuguna veri girer")
    public void adminExamFeeKutucugunaVeriGirer() {
        Assert.assertTrue(page.examFeeButton.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, User kutucugundaki ddm'den secim yapar")
    public void adminUserKutucugundakiDdmDenSecimYapar() {
        Assert.assertTrue(page.userBox.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Save butonunu tiklar")
    public void adminSaveButonunuTiklar() {
        page.saveButton.click();
    }

    @And("Admin, Physician updated mesajini goruntuler")
    public void adminPhysicianUpdatedMesajiniGoruntuler() {
        Assert.assertTrue(page.physicianUpdatedText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Delete butonunu tiklar")
    public void adminDeleteButonunuTiklar() {
        page.deleteButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Admin, Confirm Delete alert'unu gorur")
    public void adminConfirmDeleteAlertUnuGorur() {
        Assert.assertTrue(page.deleteAlert.isDisplayed());
    }

    @And("Admin, Alert uzerindeki Delete butonunu tiklar")
    public void adminAlertUzerindekiDeleteButonunuTiklar() {
        Assert.assertTrue(page.deleteButtonOnAlert.isEnabled());
    }
}

package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Ahmet;
import utilities.*;



public class US01StepDefinition{

    Faker faker = new Faker();
    Ahmet medunnaPage = new Ahmet();

    @Given("Kullanici url'e gider")
    public void kullaniciUrlEGider() {
        Driver.getDriver().get("https://medunna.com/");
    }

    @When("Kullanici register simgesine tiklar")
    public void kullaniciRegisterSimgesineTiklar() {
        medunnaPage.registerButonAnaSayfa.click();
    }

    @Then("Kullanici register'a tiklar")
    public void kullaniciRegisterATiklar() {
        medunnaPage.register.click();
    }

    @And("Kullanici {string} icermeyen bir SSN girer")
    public void kullaniciIcermeyenBirSSNGirer(String arg0) {
        medunnaPage.SSN_button.sendKeys("123456789", Keys.TAB);
    }


    @And("Kullanici Your SSN is invalid uyarisini gorur")
    public void kullaniciYourSSNIsInvalidUyarisiniGorur() {
        Assert.assertTrue(medunnaPage.SSN_uyari.isDisplayed());
    }


    @And("Kullanici dokuz haneli olmayan bir SSN girer")
    public void kullaniciDokuzHaneliOlmayanBirSSNGirer() {
        medunnaPage.SSN_button.sendKeys("12345678", Keys.TAB);
    }

    @And("Kullanici rakamlardan olusmayan bir SSN girer")
    public void kullaniciRakamlardanOlusmayanBirSSNGirer() {
        medunnaPage.SSN_button.sendKeys("abcdefgh", Keys.TAB);
    }

    @And("Kullanici bos bir SSN girer")
    public void kullaniciBosBirSSNGirer() {
        medunnaPage.SSN_button.sendKeys(" ", Keys.TAB);
    }

    @And("Kullanici gecerli bir SSN girer")
    public void kullaniciGecerliBirSSNGirer() {
        medunnaPage.SSN_button.sendKeys("123-45-6789", Keys.TAB);
    }


    @When("Kullanici bos bir First Name girer")
    public void kullaniciBosBirFirstNameGirer() {
        medunnaPage.firstName.sendKeys(" ", Keys.TAB);
    }

    @Then("Kullanici Your FirstName is required. uyarisini gorur")
    public void kullaniciYourFirstNameIsRequiredUyarisiniGorur() {
        Assert.assertTrue(medunnaPage.firstNameUyari.isDisplayed());
    }

    @When("Kullanici gecerli bir First Name girer")
    public void kullaniciGecerliBirFirstNameGirer() {
        medunnaPage.firstName.sendKeys("Ahmet", Keys.TAB);
    }

    @Then("Kullanici bos bir last name girer")
    public void kullaniciBosBirLastNameGirer() {
        medunnaPage.lastName.sendKeys(" ", Keys.TAB);
    }

    @And("Kullanici Your LastName is required. uyarisinin gorundugunu test eder")
    public void kullaniciYourLastNameIsRequiredUyarisininGorundugunuTestEder() {
        Assert.assertTrue(medunnaPage.lastNameUyari.isDisplayed());
    }

    @Then("Kullanici gecerli bir last name girer")
    public void kullaniciGecerliBirLastNameGirer() {
        medunnaPage.lastName.sendKeys("Öztürk", Keys.TAB);
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

}
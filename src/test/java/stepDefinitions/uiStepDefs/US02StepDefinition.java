package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Ahmet;


public class US02StepDefinition {

    Faker faker = new Faker();
    Ahmet medunnaPage = new Ahmet();

    @And("Kullanici bos bir username girer")
    public void kullaniciBosBirUsernameGirer() {
        medunnaPage.userName.sendKeys(" ", Keys.TAB);
    }

    @And("Kullanici Your username is required. uyarisinin gorundugunu test eder")
    public void kullaniciYourUsernameIsRequiredUyarisininGorundugunuTestEder() {
        Assert.assertTrue(medunnaPage.userNameUyari.isDisplayed());
    }

    @Given("Kullanici gecerli bir username girer")
    public void kullaniciGecerliBirUsernameGirer() {
        medunnaPage.userName.sendKeys("Ahmet", Keys.TAB);
    }

    @Given("Kullanici @ ve . karakterleri olmadan e-mail girer")
    public void kullaniciVeKarakterleriOlmadanEMailGirer() {
        medunnaPage.eMail.sendKeys("ahmetozturk", Keys.TAB);
    }

    @When("Kullanici This field is invalid uyarisinin gorundugunu test eder")
    public void kullaniciThisFieldIsInvalidUyarisininGorundugunuTestEder() {
        Assert.assertTrue(medunnaPage.eMailUyari.isDisplayed());
    }

    @When("Kullanici @ ve . karakterlerini iceren gecerli bir e-mail girer")
    public void kullaniciVeKarakterleriniIcerenGecerliBirEMailGirer() {
        medunnaPage.eMail.sendKeys(faker.internet().emailAddress(), Keys.TAB);
    }
    @When("Kullanici bos bir e-mail girer")
    public void kullaniciBosBirEMailGirer() {
        medunnaPage.eMail.sendKeys(" ", Keys.TAB);
    }

    @And("Kullanici gecerli bir e-mail girer")
    public void kullaniciGecerliBirEMailGirer() {
        medunnaPage.eMail.sendKeys(faker.internet().emailAddress(), Keys.TAB);
    }
}


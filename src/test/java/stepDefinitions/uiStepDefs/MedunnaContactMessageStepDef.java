package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPageF;
import utilities.Driver;

public class MedunnaContactMessageStepDef {

    MedunnaPageF medunna = new MedunnaPageF();

    @Then("kullanici contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        medunna.anasayfaContact.click();
    }

    @Then("kullanici {string} sayfasinin goruntulendigini dogrular.")
    public void kullaniciContactSayfasininGoruntulendiginiDogrular(String str) {
        String expectedUrl = "https://medunna.com/contact";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }

    @Then("kullanici name textboxa {string} girer")
    public void kullaniciNameTextboxaGirer(String str) {
       // JSIntoView(medunna.name);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);
        medunna.name.sendKeys(str);

    }

    @Then("Kullanici email textboxa {string} girer")
    public void kullaniciEmailTextboxaGirer(String str) {

        medunna.email.sendKeys(str);
        bekle(1);
    }

    @Then("kullanici subject textboxa {string} girer")
    public void kullaniciSubjectTextboxaGirer(String str) {

        medunna.subject.sendKeys(str);
        bekle(1);
    }

    @Then("kulanici message textboxa {string} girer")
    public void kulaniciMessageTextboxaGirer(String str) {
        medunna.message.sendKeys(str);
    }

    @And("kullanici mesajin kaydedildigini dogrular")
    public void kullaniciMesajinKaydedildiginiDogrular() {

        Assert.assertTrue(medunna.yourMessageHasBeenReceived2.isDisplayed());
        bekle(1);
    }

    @Then("kullanici Send butonuna tiklar.")
    public void kullaniciSendButonunaTiklar() {
        bekle(1);
        JSClick(medunna.sendButton);
    }


    public void JSIntoView(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void JSIntoViewAndClick(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);

    }
    public void JSClick(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);

    }


    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("kullnici {string} bekler")
    public void kullniciBekler(int arg0) {
        try {
            Thread.sleep(arg0*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

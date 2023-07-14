package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Abdullah;
import utilities.ReusableMethods;


public class US04StepDefinition {

    Abdullah abdullah = new Abdullah();

    @When("Profil resmine tıklar")
    public void profil_resmine_tıklar() {
        abdullah.okikonu.click();
    }
    @Then("Kullanici sing in'e tıklar")
    public void kullanici_sing_in_e_tıklar() {
        abdullah.singinButton.click();
    }
    @Then("Kullanici adini girer")
    public void kullanici_adini_girer() {
        abdullah.usernameBox.sendKeys("Batch81");
    }
    @Then("Kullanici dogru bir sifre girer")
    public void kullanici_dogru_bir_sifre_girer() {
        abdullah.passwordNameBox1.sendKeys("Batch81+");
    }
    @Then("Kullanici sing in'e tıkla")
    public void kullanici_sing_in_e_tıkla() {
        abdullah.sing1.click();
    }
    @Then("Kullanici basarı mesajının gorunurlugunu dogrular")
    public void kullanici_basarı_mesajının_gorunurlugunu_dogrular() {
        Assert.assertTrue(abdullah.profil2.isDisplayed());
    }
       @Then("Kullanici gelen sayfada {string} butonunu oldugunu doğrular")
    public void kullanici_gelen_sayfada_butonunu_oldugunu_doğrular(String string) {

        Assert.assertTrue(abdullah.rememberMe.isDisplayed());
    }

    @Then("Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.")
    public void kullanıcı_randevu_alıp_kaydolduğunda_profillerini_görebilir_ve_uygulamada_oturum_açabilir() {

        abdullah.profil2.isDisplayed();


    }

}

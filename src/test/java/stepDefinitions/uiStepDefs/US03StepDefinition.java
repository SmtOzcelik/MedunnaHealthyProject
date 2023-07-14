package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Ahmet;
import utilities.*;

public class US03StepDefinition {

    Faker faker = new Faker();
    Ahmet medunnaPage = new Ahmet();

    @And("Kullanici sifre kismina bir adet kucuk harf girer")
    public void kullaniciSifreKisminaBirAdetKucukHarfGirer() {
        medunnaPage.password.sendKeys("aaaaaaa", Keys.TAB);
    }

    @And("Kullanici password strenght seviyesinin degistigini kontrol eder")
    public void kullaniciPasswordStrenghtSeviyesininDegistiginiKontrolEder() {
        Assert.assertTrue(medunnaPage.renk.isDisplayed());
    }

    @And("Kullanici sifre kismina bir adet buyuk harf girer")
    public void kullaniciSifreKisminaBirAdetBuyukHarfGirer () {
        medunnaPage.password.sendKeys("Aaaaaaa", Keys.TAB);
    }


    @And("Kullanici password strenght seviyesinin degistigini kontrol eder two")
    public void kullaniciPasswordStrenghtSeviyesininDegistiginiKontrolEderTwo () {
        Assert.assertTrue(medunnaPage.renk2.isDisplayed());
    }

    @And("Kullanici sifre kismina bir adet rakam girer")
    public void kullaniciSifreKisminaBirAdetRakamGirer () {
        medunnaPage.password.sendKeys("A1aaaaa", Keys.TAB);
    }

    @And("Kullanici password strenght seviyesinin degistigini kontrol eder three")
    public void kullaniciPasswordStrenghtSeviyesininDegistiginiKontrolEderThree () {
        Assert.assertTrue(medunnaPage.renk3.isDisplayed());
    }

    @And("Kullanici sifre kismina bir adet ozel karakter girer")
    public void kullaniciSifreKisminaBirAdetOzelKarakterGirer () {
        medunnaPage.password.sendKeys("A1,aaaa", Keys.TAB);
    }

    @And("Kullanici password strenght seviyesinin degistigini kontrol eder four")
    public void kullaniciPasswordStrenghtSeviyesininDegistiginiKontrolEderFour () {
        Assert.assertTrue(medunnaPage.renk4.isDisplayed());
    }

    @And("Kullanici second password kismina ayni sifreyi girer")
    public void kullaniciSecondPasswordKisminaAyniSifreyiGirer () {
        medunnaPage.secondPassword.sendKeys("A1,aaaa", Keys.TAB);
    }

    @And("Kullanici password kismina {string} girer")
    public void kullaniciPasswordKisminaGirer(String sifre) {
        medunnaPage.password.sendKeys(sifre, Keys.TAB);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici second password kismina {string} girer")
    public void kullaniciSecondPasswordKisminaGirer(String sifre) {
        medunnaPage.secondPassword.sendKeys(sifre, Keys.TAB);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici sifre kismina {string} girer")
    public void kullaniciSifreKisminaGirer(String sifre) {
        medunnaPage.password.sendKeys(sifre, Keys.TAB);
    }

    @And("Kullanici sifre kismina aaaaaaa girer")
    public void kullaniciSifreKisminaAaaaaaaGirer() {
        medunnaPage.password.sendKeys("aaaaaaa", Keys.TAB);
    }

    @And("Kullanici second password kismina aaaaaaa girer")
    public void kullaniciSecondPasswordKisminaAaaaaaaGirer() {
        medunnaPage.secondPassword.sendKeys("aaaaaaa", Keys.TAB);
    }
}
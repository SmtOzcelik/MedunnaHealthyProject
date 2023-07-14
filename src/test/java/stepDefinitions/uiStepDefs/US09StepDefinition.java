package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Cayten;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US09StepDefinition {
    Actions actions=new Actions(Driver.getDriver());
    Select select;
    Cayten pages=new Cayten();
    @Given("logIn")
    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
        pages.kullaniciGirisButton.click();
        pages.signInButton.click();
        ReusableMethods.waitFor(1);
        pages.usernameTextBox.sendKeys(ConfigReader.getProperty("StaffUsName"));
        ReusableMethods.waitFor(1);
        pages.passwordTextBox.sendKeys(ConfigReader.getProperty("StaffPsw"));
        ReusableMethods.waitFor(1);
        pages.signIn.click();



    }
    @When("My Pages sekmesine tiklar")
    public void my_pages_sekmesine_tiklar() {

        ReusableMethods.waitFor(1);
        pages.myPages.click();

    }
    @Then("Search Patient secegine tiklar")
    public void search_patient_secegine_tiklar() {
        ReusableMethods.waitFor(1);
      pages.searchPatient.click();


    }
    @Then("Hasta bilgilerini gorur")
    public void hasta_bilgilerini_gorur() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(pages.hastaBaslik.isDisplayed());



    }


    @Then("Kullanici Edit butonuna tiklar.")
    public void kullaniciEditButonunaTiklar() {
        ReusableMethods.waitFor(1);
        pages.patientsTableHastaEditElementi.click();
    }


    @And("Id bilgisi duzenlenmedi")
    public void ıdBilgisiDuzenlenmedi() {
        pages.hastaBilgileriGuncellemeIdTextBoxElementi.sendKeys("4566");
        String actualId=pages.hastaBilgileriGuncellemeIdTextBoxElementi.getText();
        Assert.assertFalse(actualId.contains("4566"));

    }

    @And("Hastanin diger bilgileri guncellendi")
    public void hastaninDigerBilgileriGuncellendi() {
        Driver.getDriver().navigate().refresh();
        actions.sendKeys(pages.hastaBilgileriGuncellemeFirstNameTextBoxElementi).doubleClick().sendKeys("CÜNEYT")
                .sendKeys(Keys.TAB).sendKeys("KOÇ")
                .sendKeys(Keys.TAB).sendKeys("12.03.1990")
                .sendKeys(Keys.RIGHT).sendKeys("12:30")
                .sendKeys(Keys.TAB).sendKeys("cjklm@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("555-555-5555")
                .sendKeys(Keys.TAB).sendKeys("MALE")
                .sendKeys(Keys.TAB).sendKeys("0+")
                .sendKeys(Keys.TAB).sendKeys("ADANA").perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        pages.hastaBilgileriGuncellemeDescriptionTextBoxElementi.clear();
        ReusableMethods.waitFor(2);
        actions.click(pages.hastaBilgileriGuncellemeDescriptionTextBoxElementi).sendKeys("ceyhan")
                .sendKeys(Keys.TAB).sendKeys("qww")
                .sendKeys(Keys.TAB).sendKeys("France").perform();
        ReusableMethods.waitFor(1);
        pages.saveButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pages.bilgilerGuncellendi.isDisplayed());




    }
    @Then("Hasta arama kutusuna hastanin {string}'i girilir")
    public void hastaAramaKutusunaHastaninIGirilir(String SSN) {
        pages.hastaArama.sendKeys(SSN,Keys.ENTER);
    }
    @And("Wiev'e tiklanir")
    public void wievETiklanir() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        // jse.executeScript("arguments[0].scrollIntoView(true);",medunnaPage.viewButton);
        jse.executeScript("arguments[0].click();",pages.viewButton);

    }




    @And("Tum bilgilerin dolduruldugu goruldu")
    public void tumBilgilerinDoldurulduguGoruldu() {
        ReusableMethods.waitFor(1);
        assertFalse(pages.SSNBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.firstNameBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.lastNameBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.birthDateBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.emailBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.genderBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.bloodGroupBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.addressBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.descriptionBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.createdDateBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.userBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertFalse(pages.countryBosmu.getText().isEmpty());
        ReusableMethods.waitFor(1);
        assertTrue(pages.stateBosmu.getText().isEmpty());
    }

    @Then("Edit butonuna tiklanir")
    public void editButonunaTiklanir() {
        pages.edit.click();
    }

    @And("Herhangi bir hasta bilgisi silindi")
    public void herhangiBirHastaBilgisiSilindi() {
       pages.description.clear();
        ReusableMethods.waitFor(2);
        pages.saveButton.submit();
        ReusableMethods.waitForVisibility(pages.bilgilerGuncellendi,3);
        assertTrue(pages.bilgilerGuncellendi.isDisplayed());
}

    @And("hasta sayfayi kapatir")
    public void hastaSayfayiKapatir() {
        Driver.quitDriver();
    }
}

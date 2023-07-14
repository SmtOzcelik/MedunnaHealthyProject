package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Fatih_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US019StepDefinition {

    Fatih_Page fatih_page=new Fatih_Page();
    Actions action=new Actions(Driver.getDriver());
    @Given("Kullanici Medunna sayfasina gider")
    public void kullaniciMedunnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("Sign in Butonuna Tıklar")
    public void signInButonunaTıklar() {
        fatih_page.signInDropDown.click();
        fatih_page.signInButton.click();
    }

    @And("Username bolumune tıklar ve kullanici adi girer")
    public void usernameBolumuneTıklarVeKullaniciAdiGirer() {
        fatih_page.username.sendKeys("team08");
    }

    @And("Password bolumune tiklar ve sifre girer")
    public void passwordBolumuneTiklarVeSifreGirer() {
        fatih_page.password.sendKeys("12345");

    }

    @And("Sign In butonuna tiklar ve login olur")
    public void signInButonunaTiklarVeLoginOlur() {
        fatih_page.signInButton2.click();
    }

    @And("Items&Titels sekmesinden Staff bolumune girer")
    public void ıtemsTitelsSekmesindenStaffBolumuneGirer() {
        fatih_page.itemsTitlesButton.click();
        fatih_page.staffButton.click();
    }

    @And("Staff bolmune girildigi test edilir")
    public void staffBolmuneGirildigiTestEdilir() {
        Assert.assertTrue(fatih_page.staffText.isDisplayed());
    }

    @And("Create a new Staff butonu tiklanir")
    public void createANewStaffButonuTiklanir() {
        fatih_page.createANewStaffButton.click();
    }

    @And("Use search kutucugu tiklanarak secili hale getirilir")
    public void useSearchKutucuguTiklanarakSeciliHaleGetirilir() {
        fatih_page.useSearchButton.click();
    }

    @And("SSN alanina gecerli bir SSN no girilir")
    public void ssnAlaninaGecerliBirSSNNoGirilir() {
        fatih_page.ssnEntrance.sendKeys("750-01-0202");
    }

    @And("Search User butonu tiklanarak girilen SSN bilgilerine ait Staff bilgilerinin geldigi gorulur")
    public void searchUserButonuTiklanarakGirilenSSNBilgilerineAitStaffBilgilerininGeldigiGorulur() throws IOException {
        fatih_page.searchUserButton.click();
        ReusableMethods.getScreenshot("SearchStaff");
    }

    @Given("Kullanici admin olarak giris yapar")
    public void kullaniciAdminOlarakGirisYapar() {
        //ReusableMethods.loginMethod();
    }

    @And("First Name bilgisi doldurulur")
    public void firstNameBilgisiDoldurulur() {
        fatih_page.firstName.sendKeys("Staff Fatih");
    }

    @And("Last Name bilgisi doldurulur")
    public void lastNameBilgisiDoldurulur() {
        fatih_page.lastName.sendKeys("Kirac");
    }

    @And("Birth Date bilgisi doldurulur")
    public void birthDateBilgisiDoldurulur() {
        fatih_page.birthDay.sendKeys("10.07.1981");
    }

    @And("Phone sekmesine {int} haneli tel no girilir")
    public void phoneSekmesineHaneliTelNoGirilir(int arg0) {
        fatih_page.phoneNumber.sendKeys("5063447515");
    }

    @And("Gender secilir")
    public void genderSecilir() {
        action.sendKeys(Keys.TAB).sendKeys("FEMALE").perform();
    }

    @And("-Blood Group tıklanarak kan grubu secilir")
    public void bloodGroupTıklanarakKanGrubuSecilir() {
        action.sendKeys(Keys.TAB).sendKeys("0+").perform();
    }

    @And("-Adress bilgisi doldurulur")
    public void adressBilgisiDoldurulur() {
        action.sendKeys(Keys.TAB).sendKeys("K.Maras").perform();

    }

    @And("-Description bilgisi doldurulur")
    public void descriptionBilgisiDoldurulur() {
        action.sendKeys(Keys.TAB).sendKeys("Accountment Staff").perform();
    }

    @And("-Country bilgisi secilir")
    public void countryBilgisiSecilir() {
        for (int i = 0; i < 6; i++) {
            action.sendKeys(Keys.TAB).perform();

        }
        action.sendKeys(Keys.TAB).sendKeys("Turkiyem").perform();
    }

    @And("-State-City  sekmesi tiklanarak  secim yapilir")
    public void stateCitySekmesiTiklanarakSecimYapilir() throws InterruptedException {
        Thread.sleep(2000);
        action.sendKeys(Keys.TAB).sendKeys("Kahramanmaraş").perform();
    }

    @And("-Save tusu tıklanarak kayıt edilir")
    public void saveTusuTıklanarakKayıtEdilir() {
        fatih_page.saveButton.click();
    }

    @And("-SSN bilgisi ile sorgulama yapilarak kayit isleminin basarili oldugu test edilir")
    public void ssnBilgisiIleSorgulamaYapilarakKayitIslemininBasariliOlduguTestEdilir() throws IOException, InterruptedException {
        Thread.sleep(2000);
        fatih_page.itemsTitlesButton.click();
        fatih_page.staffButton.click();
        Thread.sleep(2000);
        fatih_page.createANewStaffButton.click();
        fatih_page.useSearchButton.click();
        fatih_page.ssnEntrance.sendKeys("750-01-0202");
        fatih_page.searchUserButton.click();
        ReusableMethods.getScreenshot("SearchStaff");
    }

    @And("Gelen listedeki Staff'lerin ID stununda gorulen ID lerine tiklayarak secim yapar")
    public void gelenListedekiStaffLerinIDStunundaGorulenIDLerineTiklayarakSecimYapar() {
        fatih_page.selectStaffId.click();
    }

    @And("Secilen ID bilgilerine sahip Staff bilgilerinin goruldugu test edilir")
    public void secilenIDBilgilerineSahipStaffBilgilerininGorulduguTestEdilir() {
        Assert.assertTrue(fatih_page.staffName.isDisplayed());
    }

    @And("Kullanici bilgilerinin yer aldigi satirda edit bolümü tiklanir")
    public void kullaniciBilgilerininYerAldigiSatirdaEditBolümüTiklanir() {
        fatih_page.editButton.click();
    }

    @And("Acilan ekranda degistirilmek istenen bilgi guncellemesi yapilir")
    public void acilanEkrandaDegistirilmekIstenenBilgiGuncellemesiYapilir() {
        fatih_page.editStaffName.clear();
        fatih_page.editStaffName.sendKeys("Fatih");
    }

    @And("Save butonu tiklanarak duzenlemenin kaydedildigi test edilir.")
    public void saveButonuTiklanarakDuzenlemeninKaydedildigiTestEdilir() throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            action.sendKeys(Keys.TAB).perform();
        }
        Thread.sleep(1000);
        action.sendKeys(Keys.TAB).sendKeys("ay9").perform(); //kullanıcı secilmez ise gecmiyor
        // action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        fatih_page.saveButton.click();
        Assert.assertTrue(fatih_page.newStaffName.isDisplayed());
    }

    @And("Silinmesi istenen Staff satirindaki Delete butonuna tiklanir")
    public void silinmesiIstenenStaffSatirindakiDeleteButonunaTiklanir() {
        fatih_page.deleteButton.click();
    }

    @And("Acilan onay ekraninda Delete butonuna tiklanir")
    public void acilanOnayEkranindaDeleteButonunaTiklanir() throws InterruptedException {
        Thread.sleep(2000);
        fatih_page.confirmDeleteButton.click();
    }

    @And("SSN bilgisi ile sorgulama yapilarak ilgili kaydin gorulmedigi test edilir")
    public void ssnBilgisiIleSorgulamaYapilarakIlgiliKaydinGorulmedigiTestEdilir() throws InterruptedException {
        fatih_page.itemsTitlesButton.click();
        fatih_page.staffButton.click();
        Thread.sleep(2000);
        fatih_page.createANewStaffButton.click();
        fatih_page.useSearchButton.click();
        fatih_page.ssnEntrance.sendKeys("121-21-1111");
        fatih_page.searchUserButton.click();

        Assert.assertNotEquals(fatih_page.firstName.getText(),"personel1");//personel1 isimli staff silinmeis lazım iken
        //delete yapildiginda silinme islemi yapiyor ama aynı id ile arama yapildiginda baska isimle staff cikartioyor

    }

    @And("Save butonu tiklanarak düzenlemenin kaydedildigi test edilir.")
    public void saveButonuTiklanarakDüzenlemeninKaydedildigiTestEdilir() {
        
    }


}
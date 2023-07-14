package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import pages.MedunnaPageS2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class MedunnaStepDefUs08 {
    MedunnaPageS2 page = new MedunnaPageS2();
    String sifre;
    String eskiSifre;
    String bos;
    String filePath;
    FileInputStream fis;
    Workbook workbook;
    FileOutputStream fos;
    Row row;
    Cell cell;
    Sheet sheet;

    @Given("rg kullanici {string} url'e gider")
    public void rgkullaniciUrlEGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("rg kullanici login olur")
    public void rgkullaniciLoginOlur() {

        page.accountMenu.click();
        page.signIn.click();
        page.usernameBox.sendKeys(ConfigReader.getProperty("userUsername"));
        page.passwordBox.sendKeys(ConfigReader.getProperty("userPassword"));
        page.signInButton.click();

        // Actions Yontem
        //ReusableMethods.getActions()
        //        .click(page.usernameBox)
        //        .sendKeys(ConfigReader.getProperty("userUsername"))
        //        .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("userPassword"))
        //        .sendKeys(Keys.ENTER).perform();
    }

    @Then("rg kullanici account menuden password link tiklar")
    public void rgkullaniciAccountMenudenPasswordLinkTiklar() {

        page.accountMenu.click();
        page.passwordLink.click();
    }

    @And("rg kullanici current password girer")
    public void kullaniciCurrentPasswordGirer() {

        page.currentPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }

    @And("rg kullanici new password girer")
    public void rgkullaniciNewPasswordGirer() {

        page.newPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }

    @And("rg kullanici new password confirmation girer")
    public void rgkullaniciNewPasswordConfirmationGirer() {

        page.confirmPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }

    @And("rg kullanici {string} mesajinin gorunur olmadigini dogrular")
    public void rgkullaniciMesajininGorunurOlmadiginiDogrular(String message) throws IOException {


        try {
            assertFalse(page.notMatchTextMessage.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.waitFor(2);
            ReusableMethods.getScreenshotWebElement("SSpasword", page.passwordScreen);
        }

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {

        Driver.closeDriver();
    }

    @And("kullanici buyuk harf,rakam ve ozel karakter ile en az yedi karakter new password girer")
    public void kullaniciBuyukHarfRakamVeOzelKarakterIleEnAzYediKarakterNewPasswordGirer() throws IOException {

        page.newPasswordBox.sendKeys("AS1222!!");
    }

    @And("rg kullanici Password strenght seviyesinin limegreen oldugunu dogrular")
    public void rgkullaniciPasswordStrenghtSeviyesininLimegreenOldugunuDogrular() throws IOException {

        assertEquals(4, page.limeGreenStrength.size());
        ReusableMethods.getScreenshotWebElement("limegreenSS", page.strengthBar);
    }

    @And("kullanici New password'a kucuk harf ekler")
    public void kullaniciNewPasswordAKucukHarfEkler() {

        page.newPasswordBox.sendKeys("aa");
    }

    @And("rg kullanici Password strength seviyesinin green oldugunu dogrular")
    public void rgkullaniciPasswordStrengthSeviyesininGreenOldugunuDogrular() throws IOException {

        assertEquals(5, page.greenStrength.size());
        ReusableMethods.getScreenshotWebElement("SSgreen", page.strengthBar);
    }

    @And("kullanici kucuk harf,rakam ve ozel karakter ile en az yedi karakter new password girer")
    public void kullaniciKucukHarfRakamVeOzelKarakterIleEnAzYediKarakterNewPasswordGirer() {

        page.newPasswordBox.sendKeys("aaa123232!!");
    }

    @And("kullanici New password'a buyuk harf ekler")
    public void kullaniciNewPasswordABuyukHarfEkler() {

        page.newPasswordBox.sendKeys("BB");
    }

    @And("rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter sartlarindan herhangi ucu ile{string} girer")
    public void rgkullaniciKucukHarfBuyukHarfRakamVeOzelKarakterSartlarindanHerhangiUcuIleGirer(String password) {

        page.newPasswordBox.sendKeys(password);
    }

    @And("rg kullanici {string} girmedigi sifre sartini ekler")
    public void rgkullaniciGirmedigiSifreSartiniEkler(String karakter) {

        page.newPasswordBox.sendKeys(karakter);
    }

    @When("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String username) {

        page.accountMenu.click();
        page.signIn.click();

        page.usernameBox.sendKeys(username);
    }

    @When("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {

        page.passwordBox.sendKeys(password);
    }

    @And("rg kullanici {int} saniye bekler")
    public void rgkullaniciSaniyeBekler(int sn) {

        ReusableMethods.waitFor(sn);
    }

    @And("rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter ile en az yedi karakterli new password girer")
    public void rgkullaniciKucukHarfBuyukHarfRakamVeOzelKarakterIleEnAzYediKarakterliNewPasswordGirer() {

        page.newPasswordBox.sendKeys("javA011!!");
    }

    @And("rg kullanici save butonuna tiklar")
    public void rgkullaniciSaveButonunaTiklar() {


        page.saveButton.click();
    }

    @And("rg kullanici Password changed! uyarisinin gorunur olmadigini dogrular")
    public void rgkullaniciPasswordChangedUyarisininGorunurOlmadiginiDogrular() {

        try {

            ReusableMethods.waitForVisibility(page.passwordChangedMessage, 15);
            assertTrue(page.passwordChangedMessage.isDisplayed());
            ReusableMethods.getScreenshot("eskisifrekullanildi");

        } catch (Exception e) {

            System.out.println("Eski sifre kullanilabildi");
            try {
                ReusableMethods.getScreenshot("EskiSifreKullanildi");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @And("rg kullanici new password box'a sifre girer")
    public void rgkullaniciNewPasswordBoxASifreGirer() {

        page.newPasswordBox.sendKeys("qwwertA!w");
    }

    @And("rg kullanici new password confirmation box'a new passworddan farkli sifre girer")
    public void rgkullaniciNewPasswordConfirmationBoxANewPassworddanFarkliSifreGirer() {

        page.confirmPasswordBox.sendKeys("qwrwett!A");
        page.saveButton.click();
    }

    @And("rg kullanici {string} mesajinin gorunur oldugunu dogrular")
    public void rgkullaniciMesajininGorunurOldugunuDogrular(String message) throws IOException {

        assertTrue(page.notMatchTextMessage.isDisplayed());
        ReusableMethods.getScreenshotWebElement("dontMatch", page.notMatchTextMessage);
    }

    @And("rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter ile en fazla alti karakterli new password girer")
    public void rgkullaniciKucukHarfBuyukHarfRakamVeOzelKarakterIleEnFazlaAltiKarakterliNewPasswordGirer() {

        page.newPasswordBox.sendKeys("A23!aa");
    }

    @And("rg kullanici Password strength seviyesinin red oldugunu dogrular")
    public void rgkullaniciPasswordStrengthSeviyesininRedOldugunuDogrular() throws IOException {

        assertEquals(1, page.redStrength.size());
        ReusableMethods.getScreenshotWebElement("redStrength", page.strengthBar);
    }


    @And("rg Kullanici {string} boxa en az yedi karakter girerek strenght bar'in farkli durumlarini test eder.")
    public void rgkullaniciBoxaEnAzYediKarakterGirerekStrenghtBarInFarkliDurumlariniTestEder(String password) throws IOException {

        page.newPasswordBox.sendKeys(password);
        ReusableMethods.getScreenshotWebElement(password, page.strength);
    }

    @When("rg kullanici login olup account menuden password linke tiklar")
    public void rgkullaniciLoginOlupAccountMenudenPasswordLinkeTiklar() throws IOException {


        filePath = "src/resources/excelTest.xlsx";
        fis = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(fis);
        // read
        //System.out.println(wb.getSheet("Sayfa1").getRow(0).getCell(0));
        //System.out.println(wb.getSheet("Sayfa1").getRow(1).getCell(0));

        sifre = workbook.getSheet("Sayfa1").getRow(0).getCell(0).toString();
        // 1.satır 1.hücreyi bana getir dedik yukarı.
        eskiSifre = workbook.getSheet("Sayfa1").getRow(1).getCell(0).toString();
        // 2.satır 1.hücreyi bana getir dedik.
        bos = "";

        // login
        page.accountMenu.click();
        ReusableMethods.waitFor(2);
        page.signIn.click();
        ReusableMethods.waitFor(2);
        page.usernameBox.sendKeys(ConfigReader.getProperty("excellUsernameMe"));
        ReusableMethods.waitFor(2);
        page.passwordBox.sendKeys(sifre);
        ReusableMethods.waitFor(2);
        page.signInButton.click();
        page.accountMenu.click();
        ReusableMethods.waitFor(2);
        page.passwordLink.click();
        ReusableMethods.waitFor(2);
    }

    @Then("rg kullanici current passwordu girer ve new password ve confirm password'e eski sifreyi girer")
    public void rgkullaniciCurrentPassworduGirerVeNewPasswordVeConfirmPasswordEEskiSifreyiGirer() throws IOException {

        filePath = "src/resources/excelTest.xlsx";

        page.currentPasswordBox.sendKeys(sifre);
        ReusableMethods.waitFor(2);
        page.newPasswordBox.sendKeys(eskiSifre);
        ReusableMethods.waitFor(2);
        page.confirmPasswordBox.sendKeys(eskiSifre);
        ReusableMethods.waitFor(2);

        bos = sifre;
        sifre = eskiSifre;
        eskiSifre = bos;

        System.out.println("sifre = " + sifre);
        System.out.println("eskiSifre = " + eskiSifre);

        // Delete
        sheet = workbook.getSheet("Sayfa1");
        row = sheet.getRow(0);
        cell = row.getCell(0);
        row.removeCell(cell);
        fos = new FileOutputStream(filePath);
        workbook.write(fos);
        // Delete
        sheet = workbook.getSheet("Sayfa1");
        row = sheet.getRow(1);
        cell = row.getCell(0);
        row.removeCell(cell);
        fos = new FileOutputStream(filePath);
        workbook.write(fos);

        //write
        workbook.getSheet("Sayfa1").getRow(0).createCell(0).setCellValue(sifre);
        workbook.getSheet("Sayfa1").getRow(1).createCell(0).setCellValue(eskiSifre);
        fos = new FileOutputStream(filePath);
        workbook.write(fos);

        fos.close();
        fis.close();
        workbook.close();
    }
}

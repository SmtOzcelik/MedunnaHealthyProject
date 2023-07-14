package stepDefinitions.uiStepDefs;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.us06;
import utilities.ConfigReader;
import utilities.Driver;

public class US06StepDefinition {
    pages.us06 us06 = new us06();
    Faker faker = new Faker();
    String expectedCreatedDate;
    int actualCreatedIndex;

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @Given("Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar")
    public void kullanici_sayfanin_sag_ust_kosesinde_yer_alan_insan_ikonuna_tiklar() {
        us06.anasayfaInsanIkonu.click();
    }

    @And("kullanici acilan dropdown menude signIn butonuna tiklar")
    public void kullaniciAcilanDropdownMenudeSignInButonunaTiklar() {
        us06.anasayfaInsanIkonuSignInElementi.click();
    }


    @Then("kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String username) {
        us06.loginUsernameTextBox.sendKeys(ConfigReader.getProperty(username));
    }

    @Then("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String password) {
        us06.loginPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
    }

    @And("kullanici Sign In butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us06.loginSignInButonu.click();
    }


    @Given("Hasta {string} ana sayfasina gider")
    public void hasta_ana_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }

    @Given("Anasayfada giris ikonuna tiklar")
    public void anasayfada_giris_ikonuna_tiklar() {
        us06.girisIkonu.click();
    }

    @Given("Sign in secenegine tiklar")
    public void sign_in_secenegine_tiklar() {
        us06.signInTextElement.click();
    }

    @Given("Gecerli bir username girer")
    public void gecerli_bir_username_girer() {
        us06.signInUsername.sendKeys(ConfigReader.getProperty("PatientUserName"));
    }

    @Given("Gecerli bir parola girer")
    public void gecerli_bir_parola_girer() {
        us06.signInPassword.sendKeys(ConfigReader.getProperty("PatientPassword"));
    }

    @Given("Sign in buttonuna tiklar")
    public void sign_in_buttonuna_tiklar() {
        us06.signInButton.click();
    }

    @Given("My Pages\\(patient)e tiklar")
    public void my_pages_patient_e_tiklar() {
        us06.myPagesPatient.click();
    }

    @Given("Make an Appointmenta tiklar")
    public void make_an_appointmenta_tiklar() {
        us06.makeAnAppointmentElement.click();
    }

    @Then("First Name kutusunun bos birakilamayacagini kontrol eder")
    public void first_name_kutusunun_bos_birakilamayacagini_kontrol_eder() throws InterruptedException {
        us06.makeAnAppointmentUserName.clear();
        us06.sendAnAppointmentRequest.click();

        String expectedResult = "Your FirstName is required.";
        String actualResult = us06.firstNameRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Sayfayi kapatir.")
    public void sayfayiKapatir() throws InterruptedException {
        Driver.closeDriver();
    }

    @And("SSN kutusunun bos birakilamayacagini kontrol eder")
    public void ssnKutusununBosBirakilamayacaginiKontrolEder() {
        us06.makeAnAppointmentSsn.clear();
        us06.sendAnAppointmentRequest.click();

        String expectedResult = "Your SSN is required.";
        String actualResult = us06.ssnRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Last Name kutusunun bos birakilamayacagini kontrol eder")
    public void lastNameKutusununBosBirakilamayacaginiKontrolEder() {
        us06.makeAnAppointmentLastName.clear();
        us06.sendAnAppointmentRequest.click();

        String expectedResult = "Your LastName is required.";
        String actualResult = us06.lastNameRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Phone kutusunun bos birakilamayacagini kontrol eder")
    public void phoneKutusununBosBirakilamayacaginiKontrolEder() {
        us06.makeAnAppointmentPhone.clear();
        us06.sendAnAppointmentRequest.click();

        String expectedResult = "Phone number is required.";
        String actualResult = us06.phoneNumberRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Given("Randevu formuna telefon numarasi girer")
    public void randevu_formuna_telefon_numarasi_girer() {
        us06.makeAnAppointmentPhone.sendKeys(ConfigReader.getProperty("patientPhoneNumber"));
    }

    @Given("Send an Appointment Requeste tiklar")
    public void send_an_appointment_requeste_tiklar() {
        us06.sendAnAppointmentRequest.click();
    }

    @Given("Randevu olusturuldugunu kontrol eder")
    public void randevu_olusturuldugunu_kontrol_eder() {
        //Assert.assertTrue(us06.appointmentSavedTextElement.isDisplayed());
    }

    @Given("My Appointmentsa tiklar")
    public void my_appointmentsa_tiklar() {
        us06.makeAppointmentsElement.click();
    }

    @Given("Ramdevularin goruntulendigini kontrol eder")
    public void ramdevularin_goruntulendigini_kontrol_eder() {

        for (int i = 0; i < us06.createdDateElements.size(); i++) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", us06.createdDateElements.get(i));
            if (us06.createdDateElements.get(i).getText().contains(expectedCreatedDate)) {
                actualCreatedIndex = i;
                break;
            }
        }
        String actualCreatedDate = us06.createdDateElements.get(actualCreatedIndex).getText();

        Assert.assertEquals(actualCreatedDate, expectedCreatedDate);
        System.out.println();
    }

    @Given("Settingse tiklar")
    public void settingse_tiklar() {
        us06.settings.click();
    }

    @Given("First Name bilgisinin dogrulugunu kontrol eder")
    public void first_name_bilgisinin_dogrulugunu_kontrol_eder() throws InterruptedException {
        String expectedFirstName = ConfigReader.getProperty("userFirstName");
        String actualFirstName = us06.settingsFirstName.getAttribute("value");
        Assert.assertEquals(actualFirstName, expectedFirstName);
    }

    @Given("Last Name bilgisinin dogrulugunu kontrol eder")
    public void last_name_bilgisinin_dogrulugunu_kontrol_eder() {
        String expectedLastName = ConfigReader.getProperty("userLastName");
        String actualLastName = us06.settingsLastName.getAttribute("value");
        Assert.assertEquals(actualLastName, expectedLastName);
    }

    @Given("Email bilgisinin dogrulugunu kontrol eder")
    public void email_bilgisinin_dogrulugunu_kontrol_eder() {
        us06.settingsEmail.clear();
        String expectedEmail = faker.internet().emailAddress();
        us06.settingsEmail.sendKeys(expectedEmail + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String actualEmail = us06.settingsEmail.getAttribute("value");

        Assert.assertEquals(actualEmail, expectedEmail);
    }

    @And("First Name bilgisinin degistirilebildigini kontrol eder")
    public void firstNameBilgisininDegistirilebildiginiKontrolEder() throws InterruptedException {
        us06.settingsFirstName.clear();
        us06.settingsFirstName.sendKeys(ConfigReader.getProperty("newUserFirstName") + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String expectedFirstName = ConfigReader.getProperty("newUserFirstName");
        String actualFirstName = us06.settingsFirstName.getAttribute("value");

        Assert.assertEquals(actualFirstName, expectedFirstName);

        us06.settingsFirstName.clear();
        us06.settingsFirstName.sendKeys(ConfigReader.getProperty("userFirstName") + Keys.ENTER);
    }

    @And("Last Name bilgisinin degistirilebildigini kontrol eder")
    public void lastNameBilgisininDegistirilebildiginiKontrolEder() {
        us06.settingsLastName.clear();
        us06.settingsLastName.sendKeys(ConfigReader.getProperty("newUserLastName") + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String expectedLastName = ConfigReader.getProperty("newUserLastName");
        String actualLastName = us06.settingsLastName.getAttribute("value");

        Assert.assertEquals(actualLastName, expectedLastName);

        us06.settingsLastName.clear();
        us06.settingsLastName.sendKeys(ConfigReader.getProperty("userLastName") + Keys.ENTER);
    }

    @And("Email bilgisinin degistirilebildigini kontrol eder")
    public void emailBilgisininDegistirilebildiginiKontrolEder() {
        us06.settingsEmail.clear();
        String expectedEmail = us06.settingsEmail.getAttribute("value");

        String newEmail = faker.internet().emailAddress();
        us06.settingsEmail.sendKeys(newEmail + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String actualEmail = us06.settingsEmail.getAttribute("value");

        Assert.assertNotEquals(actualEmail, expectedEmail);
    }
}
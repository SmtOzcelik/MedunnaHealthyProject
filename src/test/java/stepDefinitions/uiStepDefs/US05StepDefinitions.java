package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Abdullah;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;




public class US05StepDefinitions {

    Abdullah us5Page=new Abdullah();

    Faker faker = new Faker();
    Object obj=new Object();
    Actions action = new Actions(Driver.getDriver());
    @Given("Kullanici {string} adresine gider.")
    public void kullaniciAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
    }


    @Then("Kullanici Make an Appointment linkine tiklar")
    public void kullanici_make_an_appointment_linkine_tiklar() {
        ReusableMethods.waitFor(5);
        us5Page.AppointmentButton.click();
        // Write code here that turns the phrase above into concrete actions
    }
    @And("Kullanici First Name bos birakarak")
    public void kullaniciFirstNameBosBirakarak() {ReusableMethods.jsExecutorClick(us5Page.firstNameBox);
    }

    @And("{string} butonuna tiklar")
    public void butonunaTiklar(String arg0) {ReusableMethods.jsExecutorClick(us5Page.RegisterSubmitButton);
    }


    @Then("Kullanici Your FirstName is required. uyarisini dogrular")
    public void kullaniciYourFirstNameIsRequiredUyarisiniDogrular() {
        Assert.assertTrue("eşit degil",us5Page.InvalidFirstName.isDisplayed());
    }

    @And("Kullanici Last Name bos birakarak")
    public void kullaniciLastNameBosBirakarak() {ReusableMethods.jsExecutorClick(us5Page.AppointmentLastName);
    }

    @Then("Kullanici Your Last Name is required. uyarisini dogrular")
    public void kullaniciYourLastNameIsRequiredUyarisiniDogrular() {
        Assert.assertTrue(us5Page.InvalidLastName.isDisplayed());
    }

    @And("Kullanici SSN Numarasi bos birakarak")
    public void kullaniciSSNNumarasiBosBirakarak() {ReusableMethods.jsExecutorClick(us5Page.AppointmentSSN);
    }

    @Then("Kullanici Your SSN Numarasi is required. uyarisini dogrular")
    public void kullaniciYourSSNNumarasiIsRequiredUyarisiniDogrular() {Assert.assertTrue(us5Page.InvalidSSN.isDisplayed());
    }

    @And("Kullanici Phone Numarasi bos birakarak")
    public void kullaniciPhoneNumarasiBosBirakarak() {ReusableMethods.jsExecutorClick(us5Page.Appointmentphone);
    }

    @Then("Kullanici Your Phone Numarasi is required. uyarisini dogrular")
    public void kullaniciYourPhoneNumarasiIsRequiredUyarisiniDogrular() {Assert.assertTrue(us5Page.Invalidphone.isDisplayed());
    }

    @And("Kullanici Email bos birakarak")
    public void kullaniciEmailBosBirakarak() {ReusableMethods.jsExecutorClick(us5Page.Appointmentemail);
    }

    @Then("Kullanici Your Email is required. uyarisini dogrular")
    public void kullaniciYourEmailIsRequiredUyarisiniDogrular() {Assert.assertTrue(us5Page.Invalidemail.isDisplayed());
    }

    @And("Kullanici Gecerli bir First Name yazar")
    public void kullaniciGecerliBirFirstNameYazar() {
        us5Page.firstNameBox.sendKeys(faker.name().firstName());
    }

    @And("Kullanici Gecerli bir Last Name yazar")
    public void kullaniciGecerliBirLastNameYazar() {us5Page.AppointmentLastName.sendKeys(faker.name().lastName());
    }

    @And("Kullanici Gecerli bir SSN yazar")
    public void kullaniciGecerliBirSSNYazar() {us5Page.AppointmentSSN.sendKeys("885-55-1234");
    }

    @And("Kullanici Gecerli bir Email yazar")
    public void kullaniciGecerliBirEmailYazar() {us5Page.Appointmentemail.sendKeys(faker.internet().emailAddress());
    }

    @And("Kullanici Gecerli bir Phone yazar")
    public void kullaniciGecerliBirPhoneYazar() {us5Page.Appointmentphone.sendKeys(String.
            format(faker.phoneNumber().cellPhone(),(111)-111-1111));
    }

    @Then("Kullanici {string} yazisini dogrular")
    public void kullaniciYazisiniDogrular(String arg0) {

    }

    @Then("Kullanici ok ikonuna  tiklar")
    public void kullaniciOkIkonunaTiklar() {ReusableMethods.jsExecutorClick(us5Page.accountMenu);
    }

    @And("Kullanici Singin linkine tiklar")
    public void kullaniciSinginLinkineTiklar() {ReusableMethods.jsExecutorClick(us5Page.Singin);
    }

    @And("Kullanici Gecerli bir User Name yazar")
    public void kullaniciGecerliBirUserNameYazar() {us5Page.singinUserName.sendKeys("zeka1H");
    }

    @And("Kullanici Gecerli bir Password Name yazar")
    public void kullaniciGecerliBirPasswordNameYazar() {us5Page.singinUserPassword.sendKeys("zeka1H");
    }

    @And("Kullanici Gecerli bir Singin butona tıklar")
    public void kullaniciGecerliBirSinginButonaTıklar()
    {us5Page.singinButton.click();
    }

    @Then("Kullanici profilini dogrular")
    public void kullaniciProfiliniDogrular() {
        Assert.assertEquals(us5Page.profil.getText(),"zeka1H zeka1H");
    }

    @And("Kullanici sayfayi kapatır")
    public void kullaniciSayfayiKapatır() {
        Driver.closeDriver();
    }

}

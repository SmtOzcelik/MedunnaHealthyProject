package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.US07APage;

public class US07StepDefinition {

    US07APage sirin = new US07APage();

    @When("Kullanici MakeAnAppointment butonuna a tiklar.")
    public void kullanici_make_an_appointment_butonuna_a_tiklar() {
        sirin.makeAnAppointmentButton.click();
    }

    @And("Kullanici gecerlii bir tarih girer")
    public void kullaniciGecerliBirTarihGirer() {
        sirin.tarihKutusu.sendKeys("12.02.2023");
    }



    @And("Kullanici gecerli bir firstName girer")
    public void kullaniciGecerliBirFirstNameGirer() {
        sirin.firstNameBox.sendKeys("hasta21");
    }

    @And("Kullanici gecerli bir lastName girer")
    public void kullaniciGecerliBirLastNameGirer() {
        sirin.lastNameBox.sendKeys("yavuz21");

    }

    @And("Kullanici gecerli bir SSN i girer")
    public void kullaniciGecerliBirSSNIGirer() {
        sirin.SSNBox.sendKeys("583-14-7001");

    }

    @And("Kullanici gecerli bir Phone i girer")
    public void kullaniciGecerliBirPhoneIGirer() {
        sirin.phone.sendKeys("555-555-5555");

    }

    @And("Kullanici gecerli bir email i girer")
    public void kullaniciGecerliBirEmailIGirer() {
        sirin.email.sendKeys("hastayavuz21@gmail.com");
    }

    @And("Kullanici SendAnAppointmentRequest butonuna tiklar")
    public void kullaniciSendAnAppointmentRequestButonunaTiklar() {
        sirin.sendAnAppointmentRequestButton.click();
    }
}
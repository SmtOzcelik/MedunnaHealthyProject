package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.MedunnaPageF;
import utilities.Driver;

public class MedunnaMessageStepDefinitions {
    MedunnaPageF medunna = new MedunnaPageF();
    @Then("kullanici message butonuna tıklar")
    public void kullaniciMessageButonunaTıklar() {
        medunna.messageButton.click();
    }

    @And("kullanici message sayfasının görüntülendigini dogrular")
    public void kullaniciMessageSayfasınınGörüntülendiginiDogrular() {
        Assert.assertTrue(medunna.CreatemessageButton.isDisplayed());
    }


    @Then("kullanici create a new message butonuna tıklar")
    public void kullaniciCreateANewMessageButonunaTıklar() {
        medunna.CreatemessageButton.click();
    }

    @Then("kullanici create a new message name textboxa random bir isim gonderir")
    public void kullaniciCreateANewMessageNameTextboxaRandomBirIsimGonderir() {
        String randomName = Faker.instance().name().fullName();
        medunna.createNewMessageNameTextBox.clear();

        medunna.createNewMessageNameTextBox.sendKeys(randomName);
    }

    @Then("kullanici create a new message email textboxa random bir mail gonderir")
    public void kullaniciCreateANewMessageEmailTextboxaRandomBirMailGonderir() {
        String randomEmail = Faker.instance().internet().emailAddress();
        medunna.createNewMessageEmailTextBox.clear();
        medunna.createNewMessageEmailTextBox.sendKeys(randomEmail);
    }

    @Then("kullanici create a new message subject textboxa random bir subject gonderir")
    public void kullaniciCreateANewMessageSubjectTextboxaRandomBirSubjectGonderir() {
        String randomSubject = Faker.instance().medical().diseaseName();
        medunna.createNewMessageSubjectTextBox.clear();
        medunna.createNewMessageSubjectTextBox.sendKeys(randomSubject);
    }

    @Then("kullanici create a new message message textboxa random bir message gonderir")
    public void kullaniciCreateANewMessageMessageTextboxaRandomBirMessageGonderir() {

        String randomMessage = Faker.instance().medical().symptoms();
        medunna.createNewMessageMessageTextBox.clear();
        medunna.createNewMessageMessageTextBox.sendKeys(randomMessage);
    }

    @And("kullanici create a new message save botonuna tıklar")
    public void kullaniciCreateANewMessageSaveBotonunaTıklar() throws InterruptedException {
        Thread.sleep(2000);

        medunna.createNewMessageSaveButton.click();
        Thread.sleep(1500);

    }

    @And("kullanici  A new Message is created with identifier  mesajinin alindigini dogrular")
    public void kullaniciANewMessageIsCreatedWithIdentifierMesajininAlindiginiDogrular() {
        String expectedData="A new Message is created with identifier ";
        String actualData=medunna.createNewMessageSaveAllert.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }


    @Then("kullanici listeden editlemek istedigi herhangibir mesajin Edit butonuna tiklar")
    public void kullaniciListedenEditlemekIstedigiHerhangibirMesajinEditButonunaTiklar() {

        int randomSatir = Faker.instance().random().nextInt(1,39);
        WebElement randomEditButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Edit')])["+randomSatir+"]"));
        JSIntoViewAndClick(randomEditButton);


    }

    @And("kullanici a message is updated mesajinin gorundugunu dogrular")
    public void kullaniciAMessageIsUpdatedMesajininGorundugunuDogrular() {
        String expectedData="A Message is updated with identifier";
        String actualData=medunna.createNewMessageSaveAllert.getText();
        System.out.println("actualData = " + actualData);
        Assert.assertTrue(actualData.contains(expectedData));
    }



    public void JSIntoViewAndClick(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);

    }

    @Then("kullanici listeden silmek istedigi herhangibir mesajin Delete butonuna tiklar")
    public void kullaniciListedenSilmekIstedigiHerhangibirMesajinDeleteButonunaTiklar() {

        int randomSatir = Faker.instance().random().nextInt(1, 39);
        WebElement randomDeleteButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Delete')])["+randomSatir+"]"));
        JSIntoViewAndClick(randomDeleteButton);

    }

    @Then("kullanici mesaj silme islemini onaylar")
    public void kullaniciMesajSilmeIsleminiOnaylar() throws InterruptedException {
        Thread.sleep(1500);

        medunna.deleteConfirmMessageButton.click();
        Thread.sleep(1500);
    }

    @Then("kullanici A Message is deleted with identifier mesajinin gorundugunu dogrular")
    public void kullaniciAMessageIsDeletedWithIdentifierMesajininGorundugunuDogrular() {

        String expectedData="A Message is deleted with identifier";
        String actualData=medunna.createNewMessageSaveAllert.getText();
        System.out.println("actualData = " + actualData);
        Assert.assertTrue(actualData.contains(expectedData));
    }
}

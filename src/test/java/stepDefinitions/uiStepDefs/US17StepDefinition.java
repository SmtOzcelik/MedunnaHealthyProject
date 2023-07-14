package stepDefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Aysun;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US17StepDefinition {

    Aysun page = new Aysun();
    Actions actions = new Actions(Driver.getDriver());
    Random rand = new Random();
    Faker faker = new Faker();
    @Given("Admin Url adresine gider")
    public void admin_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));

    }
    @Then("Admin kullanici girisine tiklar")
    public void admin_kullanici_girisine_tiklar() {
        page.ilkButon.click();

    }
    @Then("Admin Login islemini gerceklestirir")
    public void admin_login_islemini_gerceklestirir() {
        page.ilkSignIn.click();
        ReusableMethods.waitFor(2);
        page.username.sendKeys(ConfigReader.getProperty("AdminUserName"));
        page.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
        page.signinButton.click();

    }
    @Then("Items-Titles butonuna tiklar")
    public void items_titles_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        page.itemsTitlesButton.click();

    }
    @Then("Test item secenegini secer")
    public void test_item_secenegini_secer() {
        ReusableMethods.waitFor(2);
        page.testItemsButton.click();

    }
    @Then("Create new item butonuna tiklar")
    public void create_new_item_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        page.createAnewTestItemButton.click();
    }
    @Then("Name ogesi olusturur")
    public void name_ogesi_olusturur() {
        ReusableMethods.waitFor(2);
        page.nameItemButton.sendKeys(faker.medical().diseaseName().toLowerCase());

    }
    @Then("Descripion ogesi oluturur")
    public void descripion_ogesi_oluturur() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.medical().medicineName()).perform();

    }
    @Then("Price ogesi olusturur")
    public void price_ogesi_olusturur() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();

    }
    @Then("Default Min Value ogesi olusturur")
    public void default_min_value_ogesi_olusturur() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();

    }
    @Then("Default Max Value ogesi olusturur")
    public void default_max_value_ogesi_olusturur() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();

    }
    @Then("Created Date ogesi olusturur")
    public void created_date_ogesi_olusturur() {
        actions.sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB).sendKeys("29").
                sendKeys(Keys.TAB).sendKeys("2022").sendKeys(Keys.TAB).sendKeys("13").
                sendKeys(Keys.TAB).sendKeys("30").sendKeys(Keys.TAB).sendKeys("PM").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB,Keys.ENTER).perform();
    }

    @Then("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        ReusableMethods.waitFor(2);
        page.editItemsButton.click();
    }

    @And("Name ogesini gunceller")
    public void nameOgesiniGunceller() {
        page.editId.click();
        actions.sendKeys(Keys.TAB).sendKeys(faker.medical().medicineName()).perform();
    }

    @And("Description ogesini gunceller")
    public void descriptionOgesiniGunceller() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.medical().medicineName()).perform();
    }

    @And("Price ogesini gunceller")
    public void priceOgesiniGunceller() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();
    }

    @And("Default Min Value ogesini gunceller")
    public void defaultMinValueOgesiniGunceller() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();
    }

    @And("Default Max Value ogesini gunceller")
    public void defaultMaxValueOgesiniGunceller() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();
    }

    @And("Created Date ogesini gunceller")
    public void createdDateOgesiniGunceller() {
        actions.sendKeys(Keys.TAB).sendKeys("11").sendKeys(Keys.TAB).sendKeys("29").
                sendKeys(Keys.TAB).sendKeys("2022").sendKeys(Keys.TAB).sendKeys("13").
                sendKeys(Keys.TAB).sendKeys("30").sendKeys(Keys.TAB).sendKeys("PM").perform();
    }

    @And("Guncellemeleri kaydeder")
    public void guncellemeleriKaydeder() {

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB,Keys.ENTER).perform();
    }

    @And("Test ogelerini goruntuler")
    public void testOgeleriniGoruntuler() {
        List<String> actualItems = new ArrayList<>(page.items2.size());
        for (WebElement w : page.items2) {
           actualItems.add(w.getText());
        }
        actualItems.forEach(System.out::println);
    }


    @And("Delete butonuna tiklar")
    public void deleteButonunaTiklar() {
        ReusableMethods.waitFor(2);
        page.delete1.click();
        ReusableMethods.waitFor(2);
        page.delete2.click();
    }

   @And("itemlari sildigini dogrular")
    public void itemlariSildiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(page.deleteNotification.isDisplayed());
    }


    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }



}

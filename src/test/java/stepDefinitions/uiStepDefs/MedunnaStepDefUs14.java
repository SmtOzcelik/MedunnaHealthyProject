package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.MedunnaPageS2;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MedunnaStepDefUs14 {
    MedunnaPageS2 page = new MedunnaPageS2();

    @When("rg doktor olarak login olur")
    public void rgdoktorOlarakLoginOlur() {
        page.accountMenu.click();
        page.signIn.click();
        page.usernameBox.sendKeys(ConfigReader.getProperty("physicianUsername"));
        page.passwordBox.sendKeys(ConfigReader.getProperty("physicianPassword"));
        page.signInButton.click();
    }

    @Then("rg doktor Mypages menusunden MyInpatient'e tiklar")
    public void rgdoktorMypagesMenusundenMyInpatientETiklar() {

        page.myPages.click();
        ReusableMethods.waitFor(3);
        page.myInpatients.click();
        ReusableMethods.waitFor(3);
    }

    @And("rg Doctor ID, start and end dates, description, created date appointment id, status, room and patient bilgilerini gorunur oldugunu dogrular")
    public void rgdoctorIDStartAndEndDatesDescriptionCreatedDateAppointmentIdStatusRoomAndPatientBilgileriniGorunurOldugunuDogrular() throws IOException {

        // List<WebElement> expected = page.patientTableTitles;

        for (WebElement w : page.patientTableTitles) {  // direkt page sayfasindan list'i aldik
            assertTrue(w.isDisplayed());
        }
        ReusableMethods.getScreenshotWebElement("PatientTable", page.patientTable);
    }

    @Then("rg doctor bilgilerini guncellemek istedigi hastaya edit yapar")
    public void rgdoctorBilgileriniGuncellemekIstedigiHastayaEditYapar() {

        ReusableMethods.waitForClickable(page.editButton, 20);
        ReusableMethods.waitForVisibility(page.editButton, 15);
        int index = ReusableMethods.random().nextInt(page.editButtons.size() - 1);
        ReusableMethods.jsScrollClick(page.editButtons.get(index));
    }

    @And("rg {int} saniye bekler")
    public void rgsaniyeBekler(int sn) {

        ReusableMethods.waitFor(sn);
    }

    @Then("doctor status bilgisi secer ve dogrular")
    public void doctorStatusBilgisiSecerVeDogrular() {


        List<WebElement> statusDDm = ReusableMethods.select(page.statusDdm).getOptions(); // 0 1 2 3
        int index = ReusableMethods.random().nextInt(statusDDm.size() - 1);
        ReusableMethods.select(page.statusDdm).selectByIndex(index);
        ReusableMethods.jsScrollClick(statusDDm.get(index));
        String selectedOption = ReusableMethods.select(page.statusDdm).getFirstSelectedOption().getText();
        System.out.println(selectedOption);
        try {
            ReusableMethods.getScreenshot("StatusMenu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        rgsaniyeBekler(3);
    }

    @And("doctor rezerve edilmis hasta odasini gunceller")
    public void doctorRezerveEdilmisHastaOdasiniGunceller() {

        List<WebElement> roomDDM = ReusableMethods.select(page.roomDdm).getOptions();
        int index = ReusableMethods.random().nextInt(roomDDM.size() - 1);
        ReusableMethods.select(page.roomDdm).selectByIndex(index);
        String selectedOption = ReusableMethods.select(page.roomDdm).getFirstSelectedOption().getText();
        System.out.println(selectedOption);
        try {
            ReusableMethods.getScreenshot("RoomMenu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("rg doctor save butonuna tiklar ve uyariyi dogrular")
    public void rgdoctorSaveButonunaTiklarVeUyariyiDogrular() throws IOException {

        ReusableMethods.jsScrollClick(page.saveButtonCreatePatient);
        String expectedData = "InPatient status can not be changed with this type of status";
        String expectedData2 = "The In Patient is updated with identifier";
        String expectedData3 = "The room already reserved";
        String expectedData4 = "Such a room not found";

        try {
            ReusableMethods.waitForClickable(page.inPatientSaveMassage, 15);
            ReusableMethods.waitForVisibility(page.inPatientSaveMassage, 15);

            if (expectedData.equals(page.inPatientSaveMassage.getText())) {

                assertEquals(expectedData, page.inPatientSaveMassage.getText());

            } else if (expectedData3.equals(page.inPatientSaveMassage.getText())) {

                assertEquals(expectedData3, page.inPatientSaveMassage.getText());

            } else if (page.inPatientSaveMassage.getText().equals(expectedData4)) {

                assertEquals(expectedData4, page.inPatientSaveMassage.getText());
            } else {

                assertTrue(page.inPatientSaveMassage.getText().contains(expectedData2));
            }
            ReusableMethods.getScreenshotWebElement("Save", page.inPatientSaveMassage);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}

package pages;


import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;
import utilities.Driver;

import java.util.List;

public class Fatih_Page {

    public Fatih_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInDropDown;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "(//*[text()='Staff'])[1]")
    public WebElement staffButton;

    @FindBy(xpath = "(//*[text()='Staff'])[2]")
    public WebElement staffText;

    @FindBy(xpath = "//*[text()='Create a new Staff']")
    public WebElement createANewStaffButton;

    @FindBy(xpath = "//*[@id='useSSNSearch']")
    public WebElement useSearchButton;

    @FindBy(xpath = "//*[@id='searchSSN']")
    public WebElement ssnEntrance;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement searchUserButton;

    @FindBy(xpath = "//*[@id='staff-firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='staff-lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='staff-birthDate']")
    public WebElement birthDay;

    @FindBy(xpath = "//*[@id='staff-phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='genderLabel']")
    public WebElement gender;


    @FindBy(xpath = "//*[@id='staff-bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//*[@id='staff-adress']")
    public WebElement adress;

    @FindBy(xpath = "//*[@id='staff-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='staff-country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='staff-cstate']")
    public WebElement state;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[1]")
    public WebElement selectStaffId;

    @FindBy(xpath = "//*[text()='personel']")
    public WebElement staffName;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='staff-lastName']")
    public WebElement editStaffName;

    @FindBy(xpath = "//*[text()='Fatih']")
    public WebElement newStaffName;

    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-staff']")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administrationButton;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagementButton;

    @FindBy(xpath = "(//*[text()='View'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//*[text()='Giusepped']")
    public WebElement userFirstName;

    @FindBy(xpath = "//*[text()='Reilly']")
    public WebElement userLastName;

    @FindBy(xpath = "//*[text()='anton.quigley@testmail.com']")
    public WebElement userEmail;

    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
    public WebElement deActivatedButton;

    @FindBy(xpath = "//*[@id='activated']")
    public WebElement activatedClick;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement administrationEditButton;

    @FindBy(xpath = "//*[@id='authorities']")
    public List<WebElement> authorities;

    @FindBy(xpath = "//*[@value='ROLE_ADMIN']")
    public WebElement profileDdmAdmin;

    @FindBy(xpath = "//*[@value='ROLE_USER']")
    public WebElement profileDDmUser;

    @FindBy(xpath = "//*[@value='ROLE_PATIENT']")
    public WebElement profileDDmPatient;

    @FindBy(xpath = "//*[@value='ROLE_STAFF']")
    public WebElement profileDDmStaff;

    @FindBy(xpath = "//*[@value='ROLE_PHYSICIAN']")
    public WebElement profileDDmPhysician;

    @FindBy(xpath = "//span[text()='Messages']")
    public WebElement messagesButton;

    @FindBy(xpath = "//span[text()='Name']")
    public WebElement messagerName;

    @FindBy(xpath = "//span[text()='Email']")
    public WebElement messagerEmail;

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageText;

    @FindBy(xpath = "//span[text()='Create a new Message']")
    public WebElement createMessageButton;

    @FindBy(xpath = "//*[@id='c-message-name']")
    public WebElement createNameForMessage;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[2]/span/span")
    public WebElement messageEditButton;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement messageEditText;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement messageEditSaveButton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[3]/span/span")
    public WebElement messageDeleteButton;

    @FindBy(xpath = "(//*[text()='Delete'])[41]")
    public WebElement messageDeleteConfirmButton;

    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryButton;

    @FindBy(xpath = "//span[text()='Create a new Country']")
    public WebElement createNewCountryButton;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement countryName;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveCountryButton;

    @FindBy(xpath = "//span[text()='State/City']")
    public WebElement stateCityButton;

    @FindBy(xpath = "//span[text()='Create a new State/City']")
    public WebElement createNewStateCity;

    @FindBy(xpath = "//input[@id='c-state-name']")
    public WebElement stateCityName;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButtonCity;

    @FindBy(xpath = "//a[@class=\"brand-logo navbar-brand active\"]")
    public WebElement createCityAlertMessage;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div/a[3]")
    public WebElement deleteCountryButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-country']")
    public WebElement deleteCountryConfirmButton;

    @FindBy (xpath = "//*[@class='Toastify__toast-body']")
    public WebElement deleteCountryAllertMessage;

    @FindBy(xpath = "//*[@id='c-message-subject']")
    public WebElement messageSubject;

    @FindBy (css = "[id='file_image']")
    public WebElement profilPhoto;


}
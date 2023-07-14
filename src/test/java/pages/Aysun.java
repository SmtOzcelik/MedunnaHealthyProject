package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

import java.util.List;


public class Aysun {

    public Aysun() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement ilkButon;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement ilkSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signinButton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatientButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSNbutton;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    public WebElement patientNotFoundText;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointmentsButton;

    @FindBy(xpath = "(//span[text()='Show Tests'])[2]")
    public WebElement showTestsButton;

    @FindBy(xpath = "//span[text()='View Results']")
    public WebElement viewResultButton;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editButton;

    @FindBy (xpath = "//input[@id='c-test-result-result']")
    public WebElement resultTextBox;

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy (xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement resultUpdateNotification;

    @FindBy (xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy (xpath = "//span[text()='Edit']")
    public WebElement drEditButton;

    @FindBy (xpath = "//a[text()='Show Test Results']")
    public WebElement showTestResultsButton;

    @FindBy (xpath = "//span[text()='View Results']")
    public WebElement viewResultsButton;

    @FindBy (xpath = "//thead//tr//th")
    public List<WebElement> items;

    @FindBy (xpath = "//button[text()='Request Inpatient']")
    public WebElement requestInpatientButton;

    @FindBy (xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitlesButton;

    @FindBy (xpath = "//span[text()='Test Item']")
    public WebElement testItemsButton;

    @FindBy (xpath = "//span[text()='Create a new Test Item']")
    public WebElement createAnewTestItemButton;

    @FindBy (xpath = "//input[@id='c-test-item-name']")
    public WebElement nameItemButton;

    @FindBy (xpath = "//div[contains(@text(),'A new Test Item')]")
    public WebElement createdTestItemNotification;

    @FindBy (xpath = "(//a[@class='page-link'])[9]")
    public WebElement endOfThePage;

    @FindBy (xpath = "(//span[text()='Edit'])[1]")
    public WebElement editItemsButton;

    @FindBy (xpath = "//input[@id='c-test-item-id']")
    public WebElement editId;

    @FindBy (xpath = "(//span[text()='Delete'])[1]")
    public WebElement delete1;

    @FindBy (xpath = "(//span[text()='Delete'])[21]")
    public WebElement delete2;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    public WebElement deleteNotification;

    @FindBy (xpath = "//thead//tr")
    public List<WebElement> items2;


}
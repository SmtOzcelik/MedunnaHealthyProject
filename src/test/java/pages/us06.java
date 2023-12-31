package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class us06 {

    public us06() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement anasayfaInsanIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anasayfaInsanIkonuSignInElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButonu;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement girisIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInTextElement;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makeAnAppointmentElement;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement makeAnAppointmentUserName;

    @FindBy(xpath = "//span[text()='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequest;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement makeAnAppointmentSsn;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredTextElement;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement makeAnAppointmentLastName;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement makeAnAppointmentPhone;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneNumberRequiredTextElement;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement makeAppointmentsElement;

    @FindBy(xpath = "//tbody//tr/td[6]")
    public List<WebElement> createdDateElements;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement settingsFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement settingsLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement settingsEmail;
}

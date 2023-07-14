package pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Abdullah {

    public Abdullah() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement firstPasswordBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordBox;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement AppointmentFirstName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement InvalidFirstName;


    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement AppointmentLastName;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement InvalidLastName;


    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement AppointmentSSN;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement InvalidSSN;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Appointmentemail;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement Invalidemail;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement Appointmentphone;

    ////a[@href="#appointment" and @class="btn-get-started scrollto"]   =>'])[2]")
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement Invalidphone;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement singinUserName;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement singinUserPassword;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement singinButton;

    @FindBy(xpath = "//*[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
    public WebElement profil;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement okikonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement Singin;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement AppointmentappoDate;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement AppointmentButton;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement RegisterSubmitButton;

    @FindBy(xpath = "//*[contains(text(), 'Appointment registration saved! We will call you as soon as possible.')]")
    public WebElement Allert;

    @FindBy(xpath = "/div[contains(text(),'Appointment registration saved!')]")
    public WebElement Allert2;

    @FindBy(xpath = "fill=\"currentColor\"")
    public WebElement profil2;

    @FindBy(xpath = "//*[@id=\"login-item\"]")
    public WebElement sing1;

    @FindBy(className = "is-touched is-pristine av-invalid is-invalid form-control")
    public WebElement userNameBox1;

    @FindBy(css = "[name=\"password\"]")
    public WebElement passwordNameBox1;

    @FindBy(className = "btn btn-primary")
    public WebElement singinButton1;

    @FindBy(xpath = "//*[@class=\"collapse navbar-collapse\"]")
    public WebElement makeAnText;

    @FindBy(id = "appoDate")
    public WebElement tarihbox;


    @FindBy(xpath = "//*[text()='Send an Appointment Request']")
    public WebElement sendAn;

    @FindBy(xpath = "//*[contains(text(),'as soon as')]")
    public WebElement willyoucan;

    @FindBy(xpath = "//*[text()='Remember me']")
    public WebElement rememberMe;



}
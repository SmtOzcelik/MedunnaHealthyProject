package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

import java.util.List;

public class Cuneyt {
    public Cuneyt() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement ilkButon;
    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signinGiris;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signinButtonKayit;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement myPages;
    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppointments;
    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement hastaListesi;
    @FindBy(xpath = "//*[@id='fromDate']")
    public WebElement zamanFrom;
    @FindBy(xpath = "//*[@id='toDate']")
    public WebElement zamanTo;
    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTime;
    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateTime;
    @FindBy(xpath = "//*[text()='Status']")
    public WebElement status;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editButonu;

    @FindBy (xpath = "//*[text()='Create or Edit an Appointment']")
    public WebElement createEditAppointmentText;

    @FindBy (xpath = "//*[@name='id']")
    public WebElement idTextBox;

    @FindBy (xpath = "//*[@name='startDate']")
    public WebElement startDateTimeTextBox;

    @FindBy (xpath = "//*[@name='endDate']")
    public WebElement endDateTimeTextBox;

    @FindBy (css = "#appointment-status")
    public List<WebElement> statusDropDown;
    @FindBy (css = "#appointment-status")
    public WebElement statusDropDown1;

    @FindBy (xpath = "//*[@name='physician.id']")
    public WebElement physicianDropDown;


    @FindBy (xpath = "//*[@id='save-entity']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement prescriptionTextBox;

    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement descriptionTextBox;
    @FindBy(xpath = "//thead//tr//th")
    public WebElement id;
    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patient;
    @FindBy(xpath = "//*[text()='Physician']")
    public WebElement physician;
    @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
    public WebElement anamnesisTextBoxDisplayed;
    @FindBy(xpath = "(//*[text()='This field is required.'])[2]")
    public WebElement treatmentTextBoxDisplayed;
    @FindBy(xpath = "(//*[text()='This field is required.'])[3]")
    public WebElement diagnosisTextBoxDisplayed;

    @FindBy(xpath = "//*[text()='PENDING']")
    public WebElement pendingtext;

    @FindBy(xpath = "//*[text()='COMPLETED']")
    public WebElement completedtext;

    @FindBy(xpath = "//*[text()='CANCELLED']")
    public WebElement cancelledtext;

    @FindBy(xpath = "//*[text()='UNAPPROVED']")
    public WebElement unapprovedtext;



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPageS2 {
    public MedunnaPageS2() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#account-menu>a")
    public WebElement accountMenu;
    @FindBy(id = "login-item")
    public WebElement signInId;
    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@name='username']") //css input[name=username]
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@name='password']") // css input[name=password]
    public WebElement passwordBox;
    @FindBy(css = ".btn.btn-primary") // xpath //*[@type='submit']
    public WebElement signInButton;
    // xpath  //div//a[@class='dropdown-item']//span[.='Password']
    @FindBy(css = ".dropdown-menu-right.show>:nth-child(2)>span")
    public WebElement passwordLink;
    @FindBy(xpath = "//*[@name='currentPassword']") // css input[name=currentPassword]
    public WebElement currentPasswordBox;
    @FindBy(css = "#newPassword")   // xpath //*[@id='newPassword']
    public WebElement newPasswordBox;
    @FindBy(css = "#confirmPassword") // xpath //*[@id='confirmPassword']
    public WebElement confirmPasswordBox;
    @FindBy(css = ".btn.btn-success>span") // xpath //button//span[.='Save']
    public WebElement saveButton;
    // @FindBy(xpath = "//*[contains(text(), 'Password changed')]")
    @FindBy(xpath = "//*[contains(text(), 'Password changed!')]")
    public WebElement passwordChangedMessage;
    @FindBy(css = "div.col-md-8")
    public WebElement passwordScreen;
    // Password Strength
    @FindBy(css = "#strengthBar")
    public WebElement strengthBar;
    @FindBy(css = "#strength")
    public WebElement strength;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']") // size = 1
    public List<WebElement> redStrength;  // css  #strengthBar>:nth-child(1)
    //@FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    //public WebElement orangeStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']") // size = 2
    public List<WebElement> orangeStrengthList;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']") // size = 3
    public List<WebElement> yellowStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']") // size = 4
    public List<WebElement> limeGreenStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']") // size = 5
    public List<WebElement> greenStrength;
    @FindBy(xpath = "//*[.='The password and its confirmation do not match!']")
    public WebElement notMatchTextMessage;  // css  .invalid-feedback


    // DOCTOR
    @FindBy(xpath = "//a//*[.='MY PAGES']")
    public WebElement myPages;
    //@FindBy(xpath = "//a//*[.='My Inpatients']")
    //public WebElement myInpatients;
    @FindBy(linkText = "My Inpatients")
    public WebElement myInpatients;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> patientTableTitles;
    @FindBy(xpath = "//span//*[.='Edit']")
    public List<WebElement> editButtons;
    @FindBy(xpath = "//span//*[.='Edit']")
    public WebElement editButton;
    @FindBy(css = "#in-patient-status")   //   xpath   //*[@id='in-patient-status']   css - select[name=status]
    public WebElement statusDdm;
    @FindBy(css = "#in-patient-room")  //   xpath   //*[@id='in-patient-room']
    public WebElement roomDdm;
    @FindBy(css = "table.table")  // xpath    //table[@class='table']
    public WebElement patientTable;
    @FindBy(css = "#in-patient-appointment")
    public WebElement appointmentDdm;
    @FindBy(css = "#save-entity>span")
    public WebElement saveButtonCreatePatient;


    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement inPatientSaveMassage;

    //*[contains(text(), 'The In Patient is updated with identifier')]
    //*[@class='Toastify__toast-body' and contains(text(), 'The In Patient is updated with identifier')]
    //*[contains(text(), 'The In Patient is updated with identifier')]
    //@FindBy(xpath = "//*[contains(text(), 'InPatient status can not be changed with this type of status')]")
    //public WebElement inPatientSaveMassage2;
    //@FindBy(xpath = "//*[contains(text(), 'The room already reserved')]")
    //public WebElement inPatientSaveMassage3;
    //@FindBy(xpath = "//*[contains(text(), 'The room already reserved')]")
    //public WebElement inPatientSaveMassage4;

    //  -> //a[starts-with(@id,'login')]
    //   -> //*[contains(text(), 'Authentication information not correct.')]
    //  ->   //div[text()='Authentication information not correct.']
    //  -> //a[@href='#appointment' and @class='btn-get-started scrollto']
    //  -> //*[@type='submit' and @id='register-submit']
    // -> li.nav-item>a[href*="tor"]
    // -> li.nav-item>a[href^="/depart"]
    // -> li.nav-item>a[href$="ct"]  sonu iceriyor
    // -> #entity-menu>div>a[href^='/st']  /st ile baslayan
    // ->  #entity-menu>div>a[href$='aff']  aff ile biten
    // -> div[class="collapse navbar-collapse"] a[href$='ut']
    // -> ul#header-tabs>:last-child


    // US015

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement signinIcon;
    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signinButton;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameBox15;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordBox15;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signinButton2;
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButton;
    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppointmentsButton;
    @FindBy(xpath = "//*[@href='/appointment-update/309647']")
    public WebElement editButton15;
    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultsButton;
    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResultsButton;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idVerification;
    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameVerification;
    @FindBy(xpath = "//*[text()='Result']")
    public WebElement resultVerification;
    @FindBy(xpath = "//*[text()='Default Min. Value']")
    public WebElement minValueVerification;
    @FindBy(xpath = "//*[text()='Default Max. Value']")
    public WebElement maxValueVerification;
    @FindBy(xpath = "//*[text()='Test']")
    public WebElement testVerification;
    @FindBy(xpath = "//*[text()='Description']")
    public WebElement descriptionVerification;
    @FindBy(xpath = "//*[text()='Date']")
    public WebElement dateVerification;
    @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatientButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement requestInpatientVerification;
    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientsButton;
    @FindBy(xpath = "//*[text()='Start Date']")
    public WebElement inPatientStartDateVerification;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement inPatientIdVerification;
    @FindBy(xpath = "//*[text()='End Date']")
    public WebElement inPatientEndDateVerification;
    @FindBy(xpath = "//*[text()='Status']")
    public WebElement inPatientStatusVerification;
    @FindBy(xpath = "//*[text()='Description']")
    public WebElement inPatientDescriptionVerification;
    @FindBy(xpath = "//*[text()='Created Date']")
    public WebElement inPatientCreatedDateVerification;
    @FindBy(xpath = "//*[text()='Room']")
    public WebElement inPatientRoomVerification;
    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement inPatientAppointmentVerification;
    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement inPatientPatientVerification;
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButton;
    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patientButton;
    @FindBy(xpath = "//*[text()='Create a new Patient']")
    public WebElement createNewPatientButton;
    @FindBy(xpath = "//*[text()='Create or edit a Patient']")
    public WebElement createNewPatientVerification;
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement staffMypagesButton;
    @FindBy(xpath = "//*[text()='Search Patient']")
    public WebElement searchPatientButton;
    @FindBy(xpath = "//*[text()='My Patients']")
    public WebElement myPatientButton;
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagePatientButton;
    @FindBy(xpath = "//*[text()='Make an Appointment']")
    public WebElement makeAppointmentButton;
    @FindBy(xpath = "//thead//tr//th//span[text()='ID']")
    public WebElement idAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='SSN']")
    public WebElement ssnAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='First Name']")
    public WebElement firstNameAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Last Name']")
    public WebElement lastNameAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Birth Date']")
    public WebElement birthDateAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Phone']")
    public WebElement phoneAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Email']")
    public WebElement emailAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Gender']")
    public WebElement genderAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Blood Group']")
    public WebElement bloodGrupAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Address']")
    public WebElement addressAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Description']")
    public WebElement descriptionAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='Created Date']")
    public WebElement createdDateAdminVerification;
    @FindBy(xpath = "//thead//tr//th//span[text()='User']")
    public WebElement userAdminVerification;
    @FindBy(xpath = "//thead/tr//th//span[text()='Country']")
    public WebElement countryAdminVerification;
    @FindBy(xpath = "//thead/tr//th//span[text()=' State/City']")
    public WebElement stateCityAdminVerification;
    @FindBy(xpath = "//tbody/tr[1]/td[16]/div[1]/a[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    public WebElement patientDeleteButton;








}

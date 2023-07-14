package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Cengizhan {

    public Cengizhan(){

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
    public WebElement itemTitleButon;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user-md fa-w-14 fa-fw ']")
    public WebElement physciansButon;

    @FindBy(xpath = "//*[@class='info jhi-item-count']")
    public WebElement physciansListText;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-plus fa-w-14 ']")
    public WebElement createPhysciansButton;

    @FindBy(xpath = "//*[@id='useSSNSearch']")
    public WebElement useSearchButon;

    @FindBy(xpath = "//*[@id='searchSSN']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement created;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[3]")
    public WebElement editButton;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[4]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@id='hospitalmsappfrontendApp.physician.delete.question']")
    public WebElement deleteAlert;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-physician']")
    public WebElement deleteButtonOnAlert;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement specialityBox;

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement chooseFileButton;

    @FindBy(xpath = "//input[@id='physician-examFee']")
    public WebElement examFeeButton;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userBox;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement physicianUpdatedText;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement staffMyPagesButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-search fa-w-16 fa-fw ']")
    public WebElement staffSearchPatientButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement staffSearchPatientSsnBox;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement staffViewButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement staffEditButton;

    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement staffShowButton;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement staffAppointmentStatusBox;

    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement staffAppointmentEditButton;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement staffAnamnesisBox;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement staffTreatmentBox;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement staffDiagnosisBox;

    @FindBy(xpath = "//select[@id='appointment-physician']")
    public WebElement staffphysicianBox;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement staffAppointmentSaveButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement staffAlertText;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement staffAppointmentShowTestButton;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement staffAppointmentViewTestResultButton;

    @FindBy(xpath = "//span[text()='Test Results']")
    public WebElement staffAppointmentTestResultText;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement staffAppointmentTestResultEdit;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement staffAppointmentTestResultEditSaveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement staffAppointmentTestResultUpdatedAlert;

    @FindBy(xpath = "//input[@id='c-test-result-id']")
    public WebElement staffAppointmentTestResultID;

    @FindBy(xpath = "//input[@id='c-test-result-date']")
    public WebElement staffAppointmentTestResultDate;

    @FindBy(xpath = "//input[@id='c-test-result-result']")
    public WebElement staffAppointmentTestResultResult;

    @FindBy(xpath = "//input[@id='c-test-result-description']")
    public WebElement staffAppointmentTestResultDescription;

    @FindBy(xpath = "//input[@id='c-test-result-createdDate']")
    public WebElement staffAppointmentTestResultCreatedDate;

    @FindBy(xpath = "//select[@id='c-test-result-cTestItem']")
    public WebElement staffAppointmentTestResultItem;

    @FindBy(xpath = "//select[@id='c-test-result-cTest']")
    public WebElement staffAppointmentTestResultTest;


}

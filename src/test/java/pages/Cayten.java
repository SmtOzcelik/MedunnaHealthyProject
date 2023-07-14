package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class Cayten {
    public Cayten(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement kullaniciGirisButton;

    @FindBy(xpath = "//*[text()='Sign in']")
    public  WebElement signInButton;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement myPages;

    @FindBy(xpath = "(//*[@data-icon='calendar-week'])[2]")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='email']")
   public WebElement email;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='appoDate']")
    public WebElement date;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement sendAnAppointmentRequest;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement create;

    @FindBy(xpath = "//*[@class='d-none d-md-inline']")
    public WebElement makeanAppointment;


    @FindBy(xpath = "//*[@class='svg-inline--fa fa-search fa-w-16 fa-fw '] ")
    public WebElement searchPatient;


    @FindBy(xpath = "//span[text()='Patients'] ")
    public WebElement hastaBaslik;


    @FindBy(xpath = "//input[@name='id']")
    public WebElement hastaBilgileriGuncellemeIdTextBoxElementi;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement hastaBilgileriGuncellemeFirstNameTextBoxElementi;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement hastaBilgileriGuncellemeLastNameTextBoxElementi;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement hastaBilgileriGuncellemeBirthDateTextBoxElementi;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement hastaBilgileriGuncellemeEmailTextBoxElementi;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement hastaBilgileriGuncellemePhoneTextBoxElementi;
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement hastaBilgileriGuncellemeGenderSelectMenuElementi;
    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement hastaBilgileriGuncellemeBloodGroupSelectMenuElementi;
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement hastaBilgileriGuncellemeAdressTextBoxElementi;
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement hastaBilgileriGuncellemeDescriptionTextBoxElementi;
    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement hastaBilgileriGuncellemeUserSelectMenuElementi;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement hastaBilgileriGuncellemeCountrySelectMenuElementi;
    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement hastaBilgileriGuncellemeStateSelectMenuElementi;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement hastaBilgileriGuncellemeSaveButonuElementi;
    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement patientsTableHastaEditElementi;

    @FindBy(xpath = "//*[text()='OTHER']")
    public WebElement otherElement;

    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement bilgilerGuncellendi;

    @FindBy(xpath ="//*[@data-icon='save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement hastaArama;

    @FindBy(css ="a[class='btn btn-info btn-sm")
    public WebElement viewButton;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[1]")
    public WebElement SSNBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[2]")
    public WebElement firstNameBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[3]")
    public WebElement lastNameBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[4]")
    public WebElement birthDateBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[5]")
    public WebElement emailBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[6]")
    public WebElement genderBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[7]")
    public WebElement bloodGroupBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[8]")
    public WebElement addressBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[9]")
    public WebElement descriptionBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[10]")
    public WebElement createdDateBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[11]")
    public WebElement userBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[12]")
    public WebElement countryBosmu;
    @FindBy(xpath ="(//dl[@class=\"jh-entity-details\"]/dd)[13]")
    public WebElement stateBosmu;
    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement edit;
    @FindBy(css = "#patient-description")
    public WebElement description;
}

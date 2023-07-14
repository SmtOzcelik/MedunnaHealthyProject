package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07APage {

    public US07APage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@class=\"appointment-btn scrollto\"]")
    public WebElement makeAnAppointmentButton;

    @FindBy (xpath = "//*[@name=\"appoDate\"]")
    public WebElement tarihKutusu;

    @FindBy (xpath = "//*[@type=\"submit\"]")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;


    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;









}



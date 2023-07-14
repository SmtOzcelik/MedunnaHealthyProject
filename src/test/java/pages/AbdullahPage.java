package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AbdullahPage {

    public AbdullahPage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement firstNameText ;

    @FindBy(xpath = "//header/div[1]/div[1]/div[4]/a[1]")
    public WebElement makeAnAppointmentButton ;


    @FindBy(css = "*[name='firstName']")
    public WebElement firstNameTextBox ;

    @FindBy(xpath = "//*[@class=\"invalid-feedback\"]")
    public List<WebElement> redIsRequiredTex ;

    @FindBy(css = "*[name=\"lastName\"]")
    public WebElement lastNameTextBox ;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement SendAnAppointmentRequestButton ;

    @FindBy(css ="[id=\"ssn\"]" )
    public WebElement SSNTestBox ;


    @FindBy(xpath = "(//*[@aria-haspopup=\"true\"])[3]")
    public WebElement profilDogrulama;


    @FindBy(xpath = "(id=\"phone\"")
    public WebElement IponeTextBox;












}

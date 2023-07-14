package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;


public class Ahmet {

    public Ahmet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class=\"svg-inline--fa fa-user fa-w-14 \"]")
    public WebElement registerButonAnaSayfa;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement SSN_button;

    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[1]")
    public WebElement SSN_uyari;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement firstNameUyari;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement lastNameUyari;

    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement userNameUyari;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[1]")
    public WebElement eMailUyari;

    @FindBy(xpath = "//*[@id=\"firstPassword\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@style=\"background-color: rgb(255, 0, 0);\"]")
    public WebElement renk;

    @FindBy(xpath = "(//*[@style=\"background-color: rgb(255, 153, 0);\"])[2]")
    public WebElement renk2;

    @FindBy(xpath = "(//*[@style=\"background-color: rgb(153, 255, 0);\"])[3]")
    public WebElement renk3;

    @FindBy(xpath = "(//*[@style=\"background-color: rgb(0, 255, 0);\"])[5]")
    public WebElement renk4;

    @FindBy(xpath = "//*[@name=\"secondPassword\"]")
    public WebElement secondPassword;
}

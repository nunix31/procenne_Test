package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProcennePage {
    public ProcennePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[text()='İletişim'])[1]")
    public WebElement contactButton; //iletişim butonu locate'i

    @FindBy (xpath = "//*[@name='first_name']")
    public WebElement name;

    @FindBy (xpath = "//*[@name='last_name']")
    public WebElement surName;

    @FindBy (xpath = "//*[@name='company']")
    public WebElement company;

    @FindBy (xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement messageBox;

    @FindBy (xpath = "(//*[@type='submit'])[1]")
    public WebElement sendButton;

    @FindBy (xpath = "(//*[@type='checkbox'])[1]")
    public WebElement checkBox1;

    @FindBy (xpath = "(//*[@class='mr-2'])[2]")
    public WebElement checkBox2;

    @FindBy (xpath = "//*[@type='button']")
    public WebElement readedButton;

    @FindBy (xpath = "//*[text()='Web Genel Aydınlatma Metni’ni ']")
    public WebElement lastOfPage1;

    @FindBy (xpath = "//*[text()='İlgili Kişi Başvuru Formunu ']")
    public WebElement lastOfPage2;



}
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ProcennePage;
import utilities.ConfigReader;
import utilities.Driver;

public class ProcenneStepdefs {
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    ProcennePage page = new ProcennePage();
    @Given("User goes to {string} website")
    public void userGoesToWebsite(String webSite) {
        Driver.getDriver().get(ConfigReader.getProperty(webSite));
    }

    @And("User waits {int} seconds.")
    public void userWaitsSeconds(int time) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User clicks the contact button")
    public void userClicksTheContactButton() {
        WebElement anladimButonu = Driver.getDriver().findElement(By.xpath("//*[@id='rcc-confirm-button']"));
        anladimButonu.click();
        page.contactButton.click();
    }

    @And("User enters contact information")
    public void userEntersContactInformation() {
        page.name.sendKeys("Nurullah");
        page.surName.sendKeys("Karaköse");
        page.company.sendKeys("free");
        page.email.sendKeys("karakosenurullah@gmail.com");
    }

    @And("User writes {string} in the message box")
    public void userWritesInTheMessageBox(String expectedClause) {
        page.messageBox.sendKeys(expectedClause);
    }

    @And("User clicks the checkbox one")
    public void userClicksTheCheckboxone() throws InterruptedException {
        js.executeScript("arguments[0].click();",page.checkBox1);
        Thread.sleep(2000);
        page.lastOfPage1.click();
        page.readedButton.click();
    }

    @And("User clicks the checkbox2")
    public void userClicksTheCheckbox2() {
        js.executeScript("arguments[0].click();",page.checkBox2);
        page.lastOfPage2.click();
        page.readedButton.click();
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        js.executeScript("arguments[0].click();",page.sendButton);
    }

    @And("User closes the driver.")
    public void userClosesTheDriver() {
        Driver.closeDriver();
    }



}

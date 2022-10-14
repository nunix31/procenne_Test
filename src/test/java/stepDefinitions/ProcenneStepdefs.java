package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ProcennePage;
import utilities.ConfigReader;
import utilities.Driver;

public class ProcenneStepdefs {
    Actions actions = new Actions(Driver.getDriver());
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
    public void userClicksTheCheckboxone() {
    page.checkBox1.click();
    page.lastOfPage1.click();
    page.readedButton.click();
    }

    @And("User clicks the checkbox2")
    public void userClicksTheCheckbox2() {
        page.checkBox2.click();
        page.lastOfPage2.click();
        page.readedButton.click();
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        page.sendButton.click();
    }

    @And("User closes the driver.")
    public void userClosesTheDriver() {
        Driver.closeDriver();
    }



}

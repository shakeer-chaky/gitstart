package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//import org.testng.Assert;
import pages.BasePage;
import pages.PatientsPage;


public class StepDefinitionIMPL extends BasePage {


    BasePage basePage;
    PatientsPage patientsPage;

    @Given("^the user landed on login page$")
    public void landedOnLoginPage() {
        basePage = new BasePage();
        basePage.launchApplication();
    }

    @Then("^the user verify that patient create success message displayed as (.+)$")
    public void theUserVerifyThatPatientCreateSuccessMessageDisplayedAs(String expectedMessage) {
      patientsPage = new PatientsPage();
        String actualSuccessMessage = patientsPage.getSuccessMessage();

     //   Assert.assertEquals(actualSuccessMessage, expectedMessage, "Success Message is not displayed as expected");

    }
}

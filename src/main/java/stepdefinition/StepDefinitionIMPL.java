package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.*;



public class StepDefinitionIMPL extends BasePage {


    PatientsPage patientsPage;
    public PatientSearchPage patientSearchPage;
    BasePage basePage;

    @Given("^the user landed on login page$")
    public void landedOnLoginPage() {
        basePage = new BasePage();
        basePage.launchApplication();
    }

    @Then("^the user verify that patient create success message displayed as (.+)$")
    public void theUserVerifyThatPatientCreateSuccessMessageDisplayedAs(String expectedMessage)
    {
        PatientsPage patientsPage=new PatientsPage();
        String actualSuccessMessage=patientsPage.getSuccessMessage();

        Assert.assertEquals(actualSuccessMessage,expectedMessage,"Success Message is not displayed as expected");

    }
}

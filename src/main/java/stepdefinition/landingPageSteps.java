package stepdefinition;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.LandingPage;

public class landingPageSteps {
    LandingPage landingPage;
    BasePage basePage;

    @Then("^the user click on home button on the landing screen$")
    public void theUserClickOnHomeButtonOnTheLandingScreen() {
        landingPage = new LandingPage();
        landingPage.clickHome();
    }


}

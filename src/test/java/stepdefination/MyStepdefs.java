package Cucumber.Stepdefination;

import io.cucumber.java.en.Then;
import pages.LandingPage;

public class MyStepdefs {
    @Then("the user click on home button on the landing screen")
    public void theUserClickOnHomeButtonOnTheLandingScreen()
    {

        LandingPage landingPage=new LandingPage();
        landingPage.clickHome();
    }
}

package stepdefinition;

import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.DashboardPage;

public class DashboardPageSteps extends BasePage {

    DashboardPage dashboardPage;

    @Then("^the user navigates to create page by selecting the left navigation menu$")
            public void the_user_select_navigation_menu(){
        dashboardPage = new DashboardPage();
        dashboardPage.clickToPatient();

    }

    @Then("^the user click to patients button on navigation screen$")
            public void user_click_patients_button(){
        dashboardPage.clickToPatients();
    }

    @Then("^the use click to plus button for add the details of patient$")
            public void user_click_plus_button(){
        dashboardPage.clickToDetails();

    }

}

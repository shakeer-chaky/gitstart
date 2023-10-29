package stepdefinition;

import io.cucumber.java.en.Then;
import pages.PatientInformationPage;

public class PatientInformationSteps {
    PatientInformationPage patientInformationPage;

    @Then("^the user set ID Number of patient$")
    public void user_set_IdNumber(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.setIdNumber("8888 0000 2222 3333");
    }

    @Then("^the user select Font size$")
    public void user_select_Font(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.clickFont();
    }

    @Then("^the user click for heading$")
    public void user_click_heading(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.clickHeading();
    }

    @Then("^the user set address of patient$")
    public void user_set_address(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.setAddress("savanoor,puttur,india.");
    }

    @Then("^the user click for country$")
    public void user_click_country(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.clickForCountry();

    }

    @Then("^the user select the country$")
    public void user_select_country(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.selectYourCountry("India");
    }

    @Then("^the user set the avatar of patient$")
    public void user_set_avatar(){
        patientInformationPage = new PatientInformationPage();
        patientInformationPage.setPhotosPath("C:\\Rasheed\\autofile\\Home.jpg");
    }

}

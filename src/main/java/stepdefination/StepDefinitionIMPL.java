package Cucumber.Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.*;

import java.io.IOException;


public class StepDefinitionIMPL extends BasePage {


    PatientsPage patientsPage;
    public PatientSearchPage patientSearchPage;


    @Given("the user landed on login page")
    public void I_landed_on_patientsPage() {
        BasePage basePage = new BasePage();
        basePage.launchApplication();
    }

    @Given("^Logged in  with username (.+) and password (.+)$")
    public void Logged_in_with_username_and_password(String email, String password) throws IOException {
        try {
            LoginPage loginPage = new LoginPage();
            loginPage.loginApplication(email, password);
        } catch (Exception exception) {
            System.out.println("exception");
        }
        return;
    }


    @Then("^the user fill in patient information in patient details page and click submit$")
    public void add_patientName_to_details() {
        patientsPage = new PatientsPage();
        patientsPage.clickToSalutation();
        patientsPage.selectToPatients();
        patientsPage.setFirstName("mahammad");
        patientsPage.setMiddleName("shakeer");
        patientsPage.setLastName("k");
        patientsPage.selectToGender();
        patientsPage.setDOB("01/22/2002");
        patientsPage.setPhoneNumber("9900758729");
        patientsPage.setEmailId("Shakirchaky9@gmail.com");


        PatientInformationPage patientInformationPage = new PatientInformationPage();
        patientInformationPage.setIdNumber("8888 0000 2222 3333");
        patientInformationPage.clickFont();
        patientInformationPage.clickHeading();
        patientInformationPage.setAddress("savanoor,puttur,india.");
        patientInformationPage.clickForCountry();
        patientInformationPage.selectYourCountry("India");
        patientInformationPage.setPhotosPath("C:\\Rasheed\\autofile\\Home.jpg");


        QuestionPage questionPage = new QuestionPage();
        questionPage.hospitalisedQuery();
        questionPage.hospitalised_Summary("yes,I have hospitalised before a year");
        questionPage.medicationQuery();
        questionPage.medication_Summary("yes Im under the medication ");
        questionPage.allergyQuery();
        questionPage.allergyFood();
        questionPage.diabeticQuery();
        questionPage.hypertensionQuery();
        questionPage.bleedingQuery();


        AddPatientsPage addPatientsPage = new AddPatientsPage();
        addPatientsPage.clickToAddPatient();

    }


    @And("Submit order")
    public void Submit_order() {
        AddPatientsPage addPatientsPage = new AddPatientsPage();
        addPatientsPage.clickToAddPatient();

    }

    @Then("^the user search Patient(.+) details in searchBox $")
    public void search_patient_name(String name) {
        patientSearchPage.setPatientName(name);
    }

    @Then("the user navigates to create page by selecting the left navigation menu")
    public void theUserNavigatesToCreatePageBySelectingTheLeftNavigationMenu() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickToPatient();
        dashboardPage.clickToPatients();
        dashboardPage.clickToDetails();
    }

    @Then("^the user verify that patient create success message displayed as (.+)$")
    public void theUserVerifyThatPatientCreateSuccessMessageDisplayedAs(String expectedMessage)
    {
        PatientsPage patientsPage=new PatientsPage();
        String actualSuccessMessage=patientsPage.getSuccessMessage();

        Assert.assertEquals(actualSuccessMessage,expectedMessage,"Success Message is not displayed as expected");

    }
}

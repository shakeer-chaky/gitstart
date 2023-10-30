package stepdefinition;

import io.cucumber.java.en.Then;
import pages.AddPatientsPage;
import pages.BasePage;
import pages.PatientSearchPage;

public class SubmitPatientSteps extends BasePage {
    public PatientSearchPage patientSearchPage;
    AddPatientsPage addPatientsPage;
    @Then("^the user click to submit button$")
    public void user_click_submit_button(){
        addPatientsPage = new AddPatientsPage();
        addPatientsPage.clickToAddPatient();
    }

    @Then("^the user search Patient(.+) details in searchBox$")
    public void search_patient_name(String name) {
        patientSearchPage = new PatientSearchPage();
        patientSearchPage.setPatientName(name);
    }
}

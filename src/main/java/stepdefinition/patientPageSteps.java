package stepdefinition;
import io.cucumber.java.en.Then;
import pages.PatientsPage;

public class patientPageSteps {
    PatientsPage patientsPage;
    @Then("^the user fill patient salutation$")
    public void user_fill_patient_salutation(){
        patientsPage = new PatientsPage();
        patientsPage.clickToSalutation();
    }
    @Then("^the user select the salutation of patient$")
    public void user_select_salutation(){
        patientsPage = new PatientsPage();
        patientsPage.selectToPatients();
    }

    @Then("^the user set firstname of patient$")
    public void user_set_firstname(){
        patientsPage = new PatientsPage();
        patientsPage.setFirstName("mahammad");
    }

    @Then("^the user set middlename of patient$")
    public void user_set_middlename(){
        patientsPage = new PatientsPage();
        patientsPage.setMiddleName("shakeer");
    }

    @Then("^the user set lastname of patient$")
    public void user_set_lastname(){
        patientsPage = new PatientsPage();
        patientsPage.setLastName("k");
    }

    @Then("^the user select gender of patient$")
    public void user_select_gender(){
        patientsPage = new PatientsPage();
        patientsPage.selectToGender();
    }

    @Then("^the user set the DOB of patient$")
    public void user_set_DOB() {
        patientsPage = new PatientsPage();
        patientsPage.setDOB("01/22/2002");
    }

    @Then("^the user set phone number of patient$")
    public void user_set_PhNo(){
        patientsPage = new PatientsPage();
        patientsPage.setPhoneNumber("9900758729");
    }

    @Then("^the user set the email of patient$")
    public void user_set_email(){
        patientsPage = new PatientsPage();
        patientsPage.setEmailId("Shakirchaky9@gmail.com");
    }
}




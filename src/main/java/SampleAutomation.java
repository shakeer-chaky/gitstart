import pages.*;

import java.io.IOException;

public class SampleAutomation {

    public static void main(String[] args) throws InterruptedException, IOException {

        try {

            BasePage basePage = new BasePage();
            basePage.launchApplication();


            LoginPage loginPage = new LoginPage();
            loginPage.capturePageScreenshot("LoginPage");
            loginPage.loginApplication("rasheed@riamsdental.com", "Riams@1988");


            LandingPage landingPage = new LandingPage();
            landingPage.clickHome();


            DashboardPage dashboardPage = new DashboardPage();

            loginPage.capturePageScreenshot("DashboardPage");
            dashboardPage.clickToPatient();
            dashboardPage.clickToPatients();
            dashboardPage.clickToDetails();


            PatientsPage patientsPage = new PatientsPage();
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

            // patientInformationPage.selectYourCountry();
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


            AddPatientsPage addPatients = new AddPatientsPage();
            addPatients.clickToAddPatient();


            PatientSearchPage patientSearchPage = new PatientSearchPage();
            patientSearchPage.setPatientName("mahammad shakeer k");

            patientSearchPage.capturePageScreenshot("PatientInformationPage");
            patientSearchPage.sleep(3);

            //  Runtime.getRuntime().exec("C:\\Rasheed\\autofile\\newfile.exe");

        }
        catch (Exception exception){

            System.out.println("Inside Exception block\n "+exception.getStackTrace());
        }

        finally {
            PatientSearchPage patientSearchPage=new PatientSearchPage();
            patientSearchPage.quitApplication();
        }




    }

}




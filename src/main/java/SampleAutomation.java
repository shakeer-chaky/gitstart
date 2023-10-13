import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.*;


import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SampleAutomation {

   public static   WebDriver driver = null;
    public SampleAutomation() {
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        String browserName = "chrome";


        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        }
        driver.get("http://127.0.0.1:8000/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginApplication("rasheed@riamsdental.com", "Riams@1988");


        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickHome();


        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickToPatient();
        dashboardPage.clickToPatients();
        dashboardPage.clickToDetails();


        PatientsPage patientsPage = new PatientsPage(driver);
        patientsPage.clickToSalutation();
        patientsPage.selectToPatients();
        patientsPage.enterFirstName("mahammad");
        patientsPage.enterMiddleName("shakeer");
        patientsPage.enterLastName("k");
        patientsPage.selectToGender();
        patientsPage.enterDob("01/22/2002");
        patientsPage.enterTelephone("9900758729");
        patientsPage.enterMail("Shakirchaky9@gmail.com");


        PatientInformationPage patientInformationPage = new PatientInformationPage(driver);
        patientInformationPage.enterIdNumber("8888 0000 2222 3333");
        patientInformationPage.selectFont();
        patientInformationPage.selectHeading();
        patientInformationPage.enterAddress("savanoor,puttur,india.");
        patientInformationPage.clickForCountry();
        patientInformationPage.selectCountry();
        // patientInformationPage.selectYourCountry();
        patientInformationPage.addPhoto("C:\\Rasheed\\autofile\\Home.jpg");


        QuestionPage questionPage = new QuestionPage(driver);
        questionPage.hospitalisedQuery();
        questionPage.hospitalised_Summary("yes,I have hospitalised before a year");
        questionPage.medicationQuery();
        questionPage.medication_Summary("yes Im under the medication ");
        questionPage.allergyQuery();
        questionPage.allergyFood();
        questionPage.diabeticQuery();
        questionPage.hypertensionQuery();
        questionPage.bleedingQuery();


        AddPatients addPatients = new AddPatients(driver);
        addPatients.clickToAddPatient();


        PatientSearchPage patientSearchPage = new PatientSearchPage(driver);
        patientSearchPage.typePatientName("mahammad shakeer k");


        Thread.sleep(1000);


        List<WebElement> countryList = driver.findElements(By.xpath("//li[contains(@id,'select2-nationality')]"));
        for (WebElement country : countryList) {
            if (country.getText().equalsIgnoreCase("India")) {
                country.click();
            }
        }

        //  Runtime.getRuntime().exec("C:\\Rasheed\\autofile\\newfile.exe");


    }
}




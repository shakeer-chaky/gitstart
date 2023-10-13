import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatients {
        WebDriver driver;


    public AddPatients(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[value='Add Patient']")
    WebElement AddPatient;



    public void clickToAddPatient(){
        AddPatient.click();
    }

    public static class PatientSearchPage {
        WebDriver driver;

        public PatientSearchPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        //Page factory

        @FindBy(css = "input[value='Add Patient']")
        WebElement searchBox;

        @FindBy(xpath ="//input[@class='form-control form-control-sm']" )
        WebElement patientName;



        public void clickToSearch(){
            searchBox.click();
        }

        public void searchPatientName(String txtPatientName){
            patientName.sendKeys(txtPatientName);
        }









        }
}




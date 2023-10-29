package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class AddPatientsPage extends BasePage {



    public AddPatientsPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[value='Add Patient']")
    WebElement AddPatient;



    public void clickToAddPatient(){
        AddPatient.click();
    }

    public  class PatientSearchPage {


        public PatientSearchPage() {

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




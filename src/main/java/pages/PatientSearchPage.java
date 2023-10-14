package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientSearchPage extends BasePage{


    public PatientSearchPage() {
        PageFactory.initElements(driver, this);

    }

    //PageFactory
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    WebElement patientName;


    public void setPatientName(String txtPatientName){
        patientName.sendKeys(txtPatientName);
    }


}


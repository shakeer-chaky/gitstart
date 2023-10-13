package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
git

public class PatientSearchPage {
    WebDriver driver;

    public PatientSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //PageFactory
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    WebElement patientName;


    public void  typePatientName(String txtPatientName){
        patientName.sendKeys(txtPatientName);
    }


}


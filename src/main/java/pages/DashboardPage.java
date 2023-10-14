package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends BasePage{


    public DashboardPage() {

        PageFactory.initElements(driver, this);

    }

  //PageFactory

    @FindBy(linkText = "Patients")
    WebElement patient;

    @FindBy(className = "fa-group")
    WebElement patients;

    @FindBy(className = "btn-xs")
    WebElement addToDetails;


    public void clickToPatient() {
        patient.click();

    }


    public void clickToPatients() {
        patients.click();
    }


    public void clickToDetails() {
        addToDetails.click();
    }
}




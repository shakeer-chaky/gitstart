package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;


public class DashboardPage extends BasePage{


    public DashboardPage() {

        PageFactory.initElements(driver, this);

    }

  //PageFactory
    @FindBy(className = "card-statistics")
    WebElement element;

    @FindBy(linkText = "Patients")
    WebElement patient;

    @FindBy(className = "fa-group")
    WebElement patients;

    @FindBy(className = "btn-xs")
    WebElement addToDetails;




    public void clickToPatient() {
        patient.click();

    }

    public void clickToPatients()
    {
        patients.click();
    }


    public void clickToDetails() {

        addToDetails.click();
    }
}




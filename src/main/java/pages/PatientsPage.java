package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class PatientsPage {
    WebDriver driver;

    public PatientsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


//PageFactory

    @FindBy(className = "selection")
    WebElement salutation;

    @FindBy(className = "select2-results__option--highlighted")
    WebElement selectSalutation;

    @FindBy(name = "firstname")
    WebElement firstName;

    @FindBy(name = "middlename")
    WebElement middleName;

    @FindBy(name = "lastname")
    WebElement lastName;

   @FindBy(css ="input[name='gender']")
   List<WebElement> genderChoose;

    @FindBy(name = "dob")
    WebElement dateOfBirth;

    @FindBy(id = "telephone")
    WebElement phNumber;

    @FindBy(name = "email")
    WebElement mailID;


    public void clickToSalutation()
    {
        salutation.click();
    }

    public void selectToPatients() {
        selectSalutation.click();
    }

    public void enterFirstName(String txtFirstname) {
        firstName.sendKeys(txtFirstname);
    }

    public void enterMiddleName(String txtMiddleName) {
        middleName.sendKeys(txtMiddleName);
    }

    public void enterLastName(String txtLastName) {
        lastName.sendKeys(txtLastName);
    }

    public void selectToGender() {
      genderChoose.get(0).click();
    }

    public void enterDob(String txtdob) {
        dateOfBirth.sendKeys(txtdob);
    }

    public void enterTelephone(String txtNumber) {
        phNumber.sendKeys(txtNumber);
    }

    public void enterMail(String txtEmail) {
        mailID.sendKeys(txtEmail);
    }





}

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class PatientInformationPage {
        WebDriver driver;

        public PatientInformationPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);

        }
//PageFactory

        @FindBy(name = "idnumber")
        WebElement id_Number;

        @FindBy(className = "ck-off")
        WebElement bold_font;

        @FindBy(className = "ck-heading_heading3")
        WebElement heading;

        @FindBy(className = "ck-focused")
        WebElement address;

        @FindBy(css = "span[title='Afghanistan']")
        WebElement country_list;

        @FindBy(css = "input[role='searchbox']")
        WebElement countries;

        // @FindBy(xpath = "//li[contains(@id,'select2-nationality')]")
        //       List<WebElement> chooseCountry;

        @FindBy(name = "photo_id")
        WebElement photo;



        public void enterIdNumber(String txtIdNumber) {
                id_Number.sendKeys(txtIdNumber);
        }

        public void selectFont() {
                bold_font.click();
        }

        public void selectHeading() {
                heading.click();
        }

        public void enterAddress(String txtAddress) {
                address.sendKeys(txtAddress);
        }

        public void clickForCountry() {
                country_list.click();
        }

        public void selectCountry() {
                countries.click();
        }

        //doubts
        // public void selectYourCountry() {
        //       chooseCountry.equals("india");


        public void addPhoto(String photoPath) {
                photo.sendKeys(photoPath);
        }



}





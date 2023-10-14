package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class PatientInformationPage extends BasePage{


        public PatientInformationPage() {

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

         @FindBy(xpath = "//li[contains(@id,'select2-nationality')]")
               List<WebElement> countryList;

        @FindBy(name = "photo_id")
        WebElement photo;



        public void setIdNumber(String txtIdNumber) {
                id_Number.sendKeys(txtIdNumber);
        }

        public void clickFont() {
                bold_font.click();
        }

        public void clickHeading() {
                heading.click();
        }

        public void setAddress(String txtAddress) {
                address.sendKeys(txtAddress);
        }

        public void clickForCountry() {
                country_list.click();
        }


        public void selectYourCountry(String countryToChoose) {
                 countries.click();
                 for (WebElement country : countryList) {
                         if (country.getText().equalsIgnoreCase(countryToChoose)) {
                                 country.click();
                                 break;
                         }
                 }
         }


        public void setPhotosPath(String photoPath) {
                photo.sendKeys(photoPath);
        }



}





package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{


    public LandingPage () {
        PageFactory.initElements(driver , this);
    }

    @FindBy(className = "top-right")
    WebElement HOME;



     public void clickHome(){
         HOME.click();
     }
    }




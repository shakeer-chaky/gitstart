package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //PageFactory

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(className = "btn-primary")
    WebElement submit;


    public void loginApplication(String s, String s1) {
        email.sendKeys("rasheed@riamsdental.com");
        password.sendKeys("Riams@1988");
        submit.click();
    }


    public void goTo() {
        driver.get("http://127.0.0.1:8000/login");
    }


}

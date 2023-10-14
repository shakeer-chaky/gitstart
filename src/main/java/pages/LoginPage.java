package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    //PageFactory

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(className = "btn-primary")
    WebElement submit;

    public void loginApplication(String txtUsername, String txtPassword) {
        email.sendKeys(txtUsername);
        password.sendKeys(txtPassword);
        submit.click();
    }



}

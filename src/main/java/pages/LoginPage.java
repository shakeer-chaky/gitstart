package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class LoginPage extends BasePage{

    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }


    //PageFactory

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(className = "btn-primary")
    WebElement submit;

    @FindBy(css = "img[alt='Riams Logo']")
    WebElement  name;

    public void loginApplication(String txtUsername, String txtPassword) {
        email.sendKeys(txtUsername);
        password.sendKeys(txtPassword);

        captureElementScreenshot(submit,"submitButton");
        submit.click();
    }

    //WebElement name =driver.findElement(By.cssSelector("img[alt='Riams Logo']"));

}














package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static class GUIMap{

        private static By txtUserName=By.name("email");
        private static By txtPassword=By.name("password");
        private static By btnLogin=By.className("btn-primary");

    }

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
       this.driver=driver;
    }



    public void enterUserName(String txtUserName)
    {
        driver.findElement(GUIMap.txtUserName).sendKeys(txtUserName);

    }
    public void enterPassword(String txtPassword)
    {
        driver.findElement(GUIMap.txtPassword).sendKeys(txtPassword);

    }
    public void clickLoginButton()
    {
        driver.findElement(GUIMap.btnLogin).click();

    }

}

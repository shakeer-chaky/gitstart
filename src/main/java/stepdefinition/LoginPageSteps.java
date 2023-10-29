package stepdefinition;
import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.LoginPage;

import java.io.IOException;


public class LoginPageSteps extends BasePage {

    LoginPage loginPage;
    @Given("^Logged in  with username (.+) and password (.+)$")
    public void Logged_in_with_username_and_password(String email, String password) throws IOException {
        loginPage = new LoginPage();
        loginPage.loginApplication(email, password);

     }
}



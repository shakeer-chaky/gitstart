package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuestionPage {
    WebDriver driver;

    public QuestionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//page factory

    @FindBy(xpath = "//input[@name='hospitalised_question']")
    List<WebElement> HospitalisedQuestion;

    @FindBy(xpath = "//input[@name='hospitalised_reason']")
    WebElement Hospitalised_Text;

    @FindBy(xpath = "//input[@name='medication_question']")
    List<WebElement> medicationQuestion;

    @FindBy(xpath = "//input[@name='medication_reason']")
    WebElement medication_Text;

    @FindBy(css = "input[name='allergic_medicine']")
    List<WebElement> allergy_question;

    @FindBy(css = "input[name='allergic_food']")
    List<WebElement> allergy_Food;

    @FindBy(css = "input[name='diabetic_question']")
    List<WebElement> diabetic;

    @FindBy(css = "input[name='hypertension_question']")
    List<WebElement> hypertension;

    @FindBy(css = "input[name='bleedingdisorder_question']")
    List<WebElement> bleeding;





    public void hospitalisedQuery() {
        HospitalisedQuestion.get(0).click();
    }

    public void hospitalised_Summary(String hospitalised_Answer) {
        Hospitalised_Text.sendKeys(hospitalised_Answer);
    }

    public void medicationQuery() {
        medicationQuestion.get(0).click();
    }

    public void medication_Summary(String medication_Answer) {
        medication_Text.sendKeys(medication_Answer);
    }

    public void allergyQuery() {
        allergy_question.get(1).click();
    }

    public void allergyFood() {
        allergy_Food.get(1).click();
    }

    public void diabeticQuery() {
        diabetic.get(1).click();
    }

    public void hypertensionQuery() {
        hypertension.get(0).click();
    }

    public void bleedingQuery() {
        bleeding.get(1).click();
    }





}
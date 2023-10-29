package stepdefinition;

import io.cucumber.java.en.Then;
import pages.QuestionPage;

public class QuestioningSteps {
    QuestionPage questionPage;
    @Then("^the user click for hospitalisedQuery$")
    public void user_click_hospitalised(){
        questionPage = new QuestionPage();
        questionPage.hospitalisedQuery();
    }

    @Then("^the user write answer for hospitalised question$")
    public void user_write_answer_hospitalised_question(){
        questionPage = new QuestionPage();
        questionPage.hospitalised_Summary("yes,I have hospitalised before a year");
    }

    @Then("^the user click for medication Query$")
    public void user_click_medication(){
        questionPage = new QuestionPage();
        questionPage.medicationQuery();
    }

    @Then("^the user write answer for medication question$")
    public void user_write_answer_medication_question(){
        questionPage = new QuestionPage();
        questionPage.medication_Summary("yes Im under the medication ");
    }

    @Then("^the user click for allergy query$")
    public void user_click_allergy_query(){
        questionPage = new QuestionPage();
        questionPage.allergyQuery();
    }

    @Then("^the user click for allergy food$")
    public void user_click_allergy_food(){
        questionPage = new QuestionPage();
        questionPage.allergyFood();
    }

    @Then("^the user click for diabetic query$")
    public void user_click_diabetic_query(){
        questionPage = new QuestionPage();
        questionPage.diabeticQuery();
    }
    @Then("^the user click for hypertension query$")
    public void user_click_for_hypertension_query(){
        questionPage = new QuestionPage();
        questionPage.hypertensionQuery();
    }

    @Then("^the user click for bleeding query$")
    public void user_click_for_bleeding_query(){
        questionPage = new QuestionPage();
        questionPage.bleedingQuery();
    }
}











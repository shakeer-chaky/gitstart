package Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/main/java/cucumber", glue ="Stepdefination", monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}

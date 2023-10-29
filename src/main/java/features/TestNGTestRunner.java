package features;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/main/java/features",glue= "stepdefinition",monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}

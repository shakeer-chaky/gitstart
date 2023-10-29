package features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features",glue= "stepdefinition",monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {


}

package pages.learning;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class ExtentReportDemo {
    ExtentReports  extent = new ExtentReports();
    @BeforeTest
    public void Config() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");


        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Shakeer");

    }

    @Test
    public void initial() {
       ExtentTest test = extent.createTest("initial");
        try {
            test.addScreenCaptureFromPath("C:\\Users\\Rasheed\\Documents\\Downloads\\PatientSearchPage_Screenshot");
        } catch (IOException e) {
            e.printStackTrace();
        }
        extent.flush();
       System.out.println("inside test");
    }

}

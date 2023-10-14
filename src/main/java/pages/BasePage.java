package pages;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage
{
    protected static WebDriver driver;
    private static Cache FileUtils;
  public void sleep(int timeOutInSeconds){
     try{
         Thread.sleep(timeOutInSeconds*1000);
     }catch (Exception exception){
         System.out.println(exception);
     }
  }

    public void capturePageScreenshot(String screenshotName){
        try {
            File screenshotAs= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotAs,new File("C:\\Users\\Rasheed\\Documents\\Downloads\\"+screenshotName+"_Screenshot.jpg"));
        } catch (IOException e) {
            System.out.println("Exception occurred while capturing the screenshot");
        }
    }

    public void launchApplication(){
        String browserName = "chrome";


        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        }
        driver.get("http://127.0.0.1:8000/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void quitApplication(){
      driver.quit();
    }
}


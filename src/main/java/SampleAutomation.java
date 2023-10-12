import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LandingPage;

import java.io.IOException;
import java.util.List;

public class SampleAutomation {

   public static   WebDriver driver = null;
    public SampleAutomation() {
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        String browserName="firefox";


        if(browserName.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
        }

        else if(browserName.equalsIgnoreCase("ie")){
            driver=new InternetExplorerDriver();
        }
        driver.get("http://127.0.0.1:8000/login");
        driver.manage().window().maximize();

        LandingPage landingPage=new LandingPage(driver);
        landingPage.goTo();
        landingPage.loginApplication("rasheed@riamsdental.com","Riams@1988");


       // DashboardPage dashboardPage = new DashboardPage(driver);
        driver.findElement(By.className("top-right")).click();


        driver.findElement(By.linkText("Patients")).click();
        driver.findElement(By.className("fa-group")).click();
        driver.findElement(By.className("btn-xs")).click();
        driver.findElement(By.className(".selection")).click();
        driver.findElement(By.className("select2-results__option--highlighted")).click();




        driver.findElement(By.name("firstname")).sendKeys("mahammad");
        driver.findElement(By.name("middlename")).sendKeys("shakeer");
        driver.findElement(By.name("lastname")).sendKeys("K");
        driver.findElement(By.cssSelector("input[value='0']")).click();
        driver.findElement(By.name("dob")).sendKeys("01/22/2002");
        driver.findElement(By.id("telephone")).sendKeys("9900758729");
        driver.findElement(By.name("email")).sendKeys("Shakirchaky9@gmail.com");

        /*/occupation
        driver.findElement(By.cssSelector("span[title='Not Specified']")).click();
        List<WebElement> jobList=driver.findElements(By.xpath("//li[contains(@id,'select2-occupation')]"));
        for(WebElement job:jobList){
            if(job.getText().equalsIgnoreCase("Engineer")){
                job.click();
            }
        }

       */ //blood group
       //driver.findElement(By.cssSelector("select[data-select2-id='7']")).click();


        driver.findElement(By.name("idnumber")).sendKeys("8888 0000 2222 3333");
        //address
        driver.findElement(By.cssSelector("path[d='M10.187 17H5.773c-.637 0-1.092-.138-1.364-.415-.273-.277-.409-.718-.409-1.323V4.738c0-.617.14-1.062.419-1.332.279-.27.73-.406 1.354-.406h4.68c.69 0 1.288.041 1.793.124.506.083.96.242 1.36.478.341.197.644.447.906.75a3.262 3.262 0 0 1 .808 2.162c0 1.401-.722 2.426-2.167 3.075C15.05 10.175 16 11.315 16 13.01a3.756 3.756 0 0 1-2.296 3.504 6.1 6.1 0 0 1-1.517.377c-.571.073-1.238.11-2 .11zm-.217-6.217H7v4.087h3.069c1.977 0 2.965-.69 2.965-2.072 0-.707-.256-1.22-.768-1.537-.512-.319-1.277-.478-2.296-.478zM7 5.13v3.619h2.606c.729 0 1.292-.067 1.69-.2a1.6 1.6 0 0 0 .91-.765c.165-.267.247-.566.247-.897 0-.707-.26-1.176-.778-1.409-.519-.232-1.31-.348-2.375-.348H7z']")).click();
        driver.findElement(By.className("ck-focused")).sendKeys("savanoor,puttur.");

        //nationality
        driver.findElement(By.cssSelector("span[title='Afghanistan']")).click();
        driver.findElement(By.cssSelector("input[role='searchbox']")).sendKeys("India");

       // driver.findElements(By.xpath("//li[contains(@id,'select2-nationality')]")).stream().filter(item->item.getText().equalsIgnoreCase("India")).findFirst().get().click();
        List<WebElement> countryList=driver.findElements(By.xpath("//li[contains(@id,'select2-nationality')]"));

        for(WebElement country:countryList){
            if(country.getText().equalsIgnoreCase("India")){
                country.click();
            }
        }

      //  driver.findElement(By.id("notes")).sendKeys("Test text area");

//        WebElement photo=driver.findElement(By.name("photo_id"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(photo).click().build().perform();

        Thread.sleep(1000);

       //  Runtime.getRuntime().exec("C:\\Rasheed\\autofile\\newfile.exe");


        driver.findElement(By.name("photo_id")).sendKeys("C:\\Rasheed\\autofile\\Home.jpg");

        handleRadioButton(By.xpath("//input[@name='hospitalised_question']"),"Yes");



        driver.findElement(By.xpath("//input[@name='hospitalised_reason']")).sendKeys("yes,I have hospitalised before a year");

        List<WebElement> medicationQuestion =driver.findElements(By.xpath("//input[@name='medication_question']"));
        medicationQuestion.get(0).click();

         driver.findElement(By.xpath("//input[@name='medication_reason']")).sendKeys("yes Im under the medication ");
        //driver.findElement(By.xpath("//li[contains(@id,'select2-nationality')]")).click();
        handleRadioButton(By.xpath("//input[@name='diabetic_question']"),"No");
        driver.findElement(By.cssSelector("input[value='Add Patient']")).click();
        driver.findElement(By.xpath("//input[@class='form-control form-control-sm']")).sendKeys("mahammad shakeer k");

        Thread.sleep(3000);




    }
    public static void handleRadioButton(By by,String optionToChoose){

        List<WebElement> radioButtons=driver.findElements(by);
        if(optionToChoose.equalsIgnoreCase("Yes")){
            radioButtons.get(0).click();
        }
        else{
            radioButtons.get(1).click();
        }
    }

}

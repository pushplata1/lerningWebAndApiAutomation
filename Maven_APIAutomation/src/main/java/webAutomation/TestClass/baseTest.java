package webAutomation.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class baseTest {
    WebDriver driver ;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C://Users//prave//IdeaProjects//Maven_APIAutomation//chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void browserClose(){
        driver.close();
    }


}

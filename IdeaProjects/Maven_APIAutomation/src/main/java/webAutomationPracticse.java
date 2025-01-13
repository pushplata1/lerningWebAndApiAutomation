import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class webAutomationPracticse {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver;
        WebDriverWait exilicit;
        System.setProperty("webdriver.chrome.driver","C://Users//prave//IdeaProjects//Maven_APIAutomation//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement home=driver.findElement(By.xpath("//button [text()='Home']"));

        home.click();
       Thread.sleep(3000);

       driver.navigate().back();
        exilicit = new WebDriverWait(driver,10);
        exilicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button [text()='Home']")));

      //  JavascriptExecutor js = (JavascriptExecutor) driver;
     //  js.executeScript("arguments[0].scrollIntoView();", el);
        WebElement ho= driver.findElement(By.xpath("//button[@id='mousehover']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",ho);
        Thread.sleep(2000);
        Actions as= new Actions(driver);
        as.moveToElement(ho).build().perform();
        Thread.sleep(2000);


        ///  using the select class if the dropdown have the select tag
//        WebElement kh =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//        Select sel =new Select( kh);
//        sel.selectByIndex(2);
//        Thread.sleep(1000);
//        sel.selectByValue("option1");
//        Thread.sleep(1000);
//        sel.selectByVisibleText("Option3");
//        Thread.sleep(1000);



//

//
//        for(WebElement el:optionslist){
//            if(el.getText().contains(seleValue)){
//                el.click();
//            }
//        }

//
//
//        WebElement kh =driver.findElement(By.xpath("//label[@for='radio2']/input"));
//kh.click();
//         Thread.sleep(1000);
//        String parentwin =driver.getWindowHandle();
//        WebElement win =driver.findElement(By.xpath("//button[@id='openwindow']"));
//
//        win.click();
//        Set<String> Windows =driver.getWindowHandles();
//        for(String w:Windows){
//            if(!(w.contains(parentwin))){
//
//                driver.switchTo().window(w);
//                Thread.sleep(2000);
//                driver.close();
//                break;
//            }
//        }
//WebElement art=driver.findElement(By.xpath("//input [@id='alertbtn']"));
//art.click();
//
//        exilicit.until(ExpectedConditions.alertIsPresent());
//        Alert artdriver=driver.switchTo().alert();
//        artdriver.dismiss();
//
//        System.out.println();

        ///  frame handling

//
//       WebElement el = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", el);
//
//
//
//       driver.switchTo().frame(el);
//
/////  take screenshot in seklenium
//       TakesScreenshot ts= ((TakesScreenshot)driver);
//       File scrFile=ts.getScreenshotAs(OutputType.FILE);
//
//       File destinationFile= new File("C://Users//prave//Downloads//SeleniumScreenshot//screenshot.jpeg");
//        FileUtils.copyFile(scrFile,destinationFile);
//
//
//       WebElement joinElement=driver.findElement(By.xpath("(//a[text()='JOIN NOW'])[1]"));
//        js.executeScript("arguments[0].scrollIntoView();", joinElement);
//
//       joinElement.click();
//        Thread.sleep(2000);
//       driver.navigate().back();
//
//
//        Actions a= new Actions(driver);




       driver.switchTo().defaultContent();


        driver.close();


    }

}

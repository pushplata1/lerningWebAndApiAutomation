package webAutomation.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestClass extends baseTest{


    @Test
    public void clickHomeButton() throws InterruptedException {
//        //Hard Assesrstion
      String titile1= driver.getTitle();
        Assert.assertEquals(titile1,"Practice");


        //softAssertiom
        String titile= driver.getTitle();
        System.out.println(titile);
        SoftAssert as= new SoftAssert();
     //   as.assertEquals(titile,"Practice");


        WebElement home=driver.findElement(By.xpath("//button [text()='Home']"));
        home.click();
        Thread.sleep(3000);

    }


    @Test
    public void dropdownHandling()  {
        try {
            WebElement kh = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
            Select sel = new Select(kh);
            sel.selectByIndex(2);
            Thread.sleep(1000);
            sel.selectByValue("option1");
            Thread.sleep(1000);
            sel.selectByVisibleText("Option3");
            Thread.sleep(1000);

            SoftAssert softAssert = new SoftAssert();

        } catch (Exception e) {

        }

    }

}

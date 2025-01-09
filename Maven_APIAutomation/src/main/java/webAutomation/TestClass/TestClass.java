package webAutomation.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass extends baseTest{

    @Test
    public void clickHomeButton() throws InterruptedException {
        WebElement home=driver.findElement(By.xpath("//button [text()='Home']"));
        home.click();
        Thread.sleep(3000);

    }


    @Test
    public void dropdownHandling() throws InterruptedException {
        WebElement kh =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select sel =new Select( kh);
        sel.selectByIndex(2);
        Thread.sleep(1000);
        sel.selectByValue("option1");
        Thread.sleep(1000);
        sel.selectByVisibleText("Option3");
        Thread.sleep(1000);


    }

}

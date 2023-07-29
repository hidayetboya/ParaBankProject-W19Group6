package TestCases;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;

public class HidayetTestCase5 extends BaseDriver {
    /**
     Test Case 5:
     ❖ Go to the site
     ❖ Enter username and password and click login
     ❖ Click Request Loan
     ❖ Fill the required fields and click Apply Now
     */
    @Test
    public  void Test5(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("hidayet");
        MyMethods.myWait(1);
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("sifre123");
        MyMethods.myWait(1);
        WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
        login.click();

        MyMethods.myWait(1);

        WebElement loan = driver.findElement(By.xpath("  //a[text()='Request Loan']"));
        loan.click();

        WebElement amount= driver.findElement(By.id("amount"));
        amount.sendKeys("5000");

        MyMethods.myWait(2);

        WebElement downPayment= driver.findElement(By.id("downPayment"));
        downPayment.sendKeys("4000");

        MyMethods.myWait(2);

        WebElement apply = driver.findElement(By.xpath("//input[@value='Apply Now']"));
        apply.click();




    }
}
package TestCases;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTestCase extends BaseDriver {
    /**Go to https://parabank.parasoft.com/parabank/index.htm
     ❖ Click Register
     ❖ Fill the form on Signing up easy! page
     ❖ Assert that you have registered successfully
     ❖ Logout from the application. **/
    @Test
    public void testBaseTestCase(){
        //Go to https://parabank.parasoft.com/parabank/index.htm
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //Click Register

        WebElement register = driver.findElement(By.xpath("//a[.='Register']"));
        register.click();

       WebElement firtsname= driver.findElement(By.id("customer.firstName"));
       firtsname.sendKeys("Techno");

        WebElement lastsname= driver.findElement(By.id("customer.lastName"));
        lastsname.sendKeys("Study");

        WebElement adress= driver.findElement(By.id("customer.address.street"));
        adress.sendKeys("Meadow Forest 12");

        WebElement city = driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Alpharetta");

        WebElement state = driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Georgia");

        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("30004");

        WebElement phone = driver.findElement(By.id("customer.phoneNumber"));
        phone.sendKeys("4015454452");

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123456789");

        WebElement username = driver.findElement(By.id("customer.username"));
        username.sendKeys("techngossttudy19999");

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("technostudy321");

        WebElement confirm = driver.findElement(By.id("repeatedPassword"));
        confirm.sendKeys("technostudy321");

        WebElement submit = driver.findElement(By.xpath("//input[@value='Register']"));
        submit.click();

        MyMethods.myWait(1);

        WebElement successfullyRegistered = driver.findElement(By.xpath("//p[.='Your account was created successfully. You are now logged in.']"));
        Assert.assertTrue("Test Failed", successfullyRegistered.getText().contains("Your account was created successfully. You are now logged in."));

        MyMethods.myWait(1);

        WebElement logOut  = driver.findElement(By.xpath("//a[.='Log Out']"));
        logOut.click();

        MyMethods.myWait(1);
    }
}

package TestCases;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LubaTestCase2 extends BaseDriver {
    /*
    Test Case 2:
❖ Go to the site
❖ Enter username and password and click login
❖ Click Transfer Funds
❖ Enter Amount, make your selections and click Transfer
❖ Assert that your transfer is succesful
     */

    //couldn't login with our credentials, created my own and tested with them
    //9876543Maria password
    // Maria username

    @Test
    public void transferFundsTest(){

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("technostudy19999");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("technostudy321");


        WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
        login.click();

        WebElement transferFunds = driver.findElement(By.xpath("//a[text()='Transfer Funds']"));
        transferFunds.click();

        WebElement amount = driver.findElement(By.id("amount"));
        amount.sendKeys("200");

        WebElement transferButton = driver.findElement(By.xpath("//input[@value='Transfer']"));
        transferButton.click();
        MyMethods.myWait(2);

        WebElement transferComplete = driver.findElement(By.xpath("//h1[text()='Transfer Complete!']"));

        Assert.assertTrue("Test failed", transferComplete.getText().contains("Transfer Complete!"));

        waitAndQuit();





    }

}

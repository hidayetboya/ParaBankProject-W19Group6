package TestCases;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElviraTestCase1 extends BaseDriver {
    @Test
    public void testBaseTestCase(){
        //Go to https://parabank.parasoft.com/parabank/index.htm
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //Click Register

        WebElement username = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
        username.sendKeys("techngossttudy19999");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
        password.sendKeys("technostudy321");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        login.click();

        WebElement openNewAccount = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
        openNewAccount.click();

        WebElement openNewAccountBtn = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input"));
        openNewAccountBtn.click();

        MyMethods.myWait(2);


        WebElement cong = driver.findElement(By.xpath("//p[.='Congratulations, your account is now open.']"));
        Assert.assertTrue("Test Faild", cong.getText().contains("Congratulations, "));
        waitAndQuit();

    }
}

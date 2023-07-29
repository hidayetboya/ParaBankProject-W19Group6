package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;

public class NurevsanTestCase4 extends BaseDriver {
    /*Go to the site
❖ Enter username and password and click login
❖ Click Update Contact Info
❖ Update required fields and click Update Profile
❖ Assert that you have updated your contact information successfully*/
@Test
    public void testContactInfo() {

    driver.get("https://parabank.parasoft.com/parabank/index.htm");

    WebElement username = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
    username.sendKeys("technostudy19999");

    WebElement password= driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
    password.sendKeys("technostudy321");

    WebElement login = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
    login.click();

    WebElement updateContactInfoLink = driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]"));
    updateContactInfoLink.click();

    WebElement addressField = driver.findElement(By.id("address"));
    addressField.clear();
    addressField.sendKeys("New Address");

    WebElement cityField = driver.findElement(By.id("city"));
    cityField.clear();
    cityField.sendKeys("Atlanta");

    WebElement stateField = driver.findElement(By.id("state"));
    stateField.clear();
    stateField.sendKeys("Georgia");

    WebElement zipCodeField = driver.findElement(By.id("zipCode"));
    zipCodeField.clear();
    zipCodeField.sendKeys("44044");

    WebElement updateProfileButton = driver.findElement(By.xpath("//input[@value='Update Profile']"));
    updateProfileButton.click();

    MyMethods.myWait(1);


    WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Profile Updated')]"));
    Assert.assertTrue("Updating Contact Information Failed", successMessage.isDisplayed());

    MyMethods.myWait(1);

    }
}


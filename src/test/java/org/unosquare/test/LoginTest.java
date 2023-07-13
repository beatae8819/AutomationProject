package org.unosquare.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.unosquare.pages.LoginPage;

public class LoginTest   {

    private WebDriver driver;

    LoginPage su;

    @BeforeTest
    public void openURL(){
       driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://magento.softwaretestingboard.com/");


    }
    @Test
    public void SignPage() {
        su = new LoginPage(driver);
       su.SignButton();
       su.EmailField();
       su.PasswordField();
       su.SignInBtn();
         String actualString = driver.findElement(By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")).getText();
        //assert.assertTrue(actualString.contains("Incorrect CAPTCHA"));
        Assert.assertTrue(actualString.contains("Incorrect CAPTCHA"));
        System.out.println("Failed");
    }
}

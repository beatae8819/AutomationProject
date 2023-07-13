package org.unosquare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public final class LoginPage {

    private WebDriver driver;




    public LoginPage(WebDriver driver) {
       this.driver = driver;
    }
    By SignButton = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    By emailField = By.id("email");
    By passField = By.id("pass");

    By incorrectCaptcha = By.cssSelector("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By signInButton = By.id("send2");
    public void SignButton() {
        driver.findElement(SignButton).click();
    }

    public void EmailField(){
        driver.findElement(emailField).sendKeys("roni_cost@example.com");
    }
    public void PasswordField(){
        driver.findElement(passField).sendKeys("roni_cost@example.com");
    }
    public void SignInBtn(){
        driver.findElement(signInButton).click();
    }
    public void Incorrect(){
        driver.findElement(incorrectCaptcha).getText();

    }

}

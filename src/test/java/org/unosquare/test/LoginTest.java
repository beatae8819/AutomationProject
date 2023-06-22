package org.unosquare.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class LoginTest   {

    public WebDriver driver;

    @BeforeTest
    public void startDriver() throws IOException {
        driver = this.driver;
       // w = initializeWait();
        driver.manage().window().maximize();
    }
    
}

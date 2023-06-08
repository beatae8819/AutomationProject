package org.unosquare.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumBase {
    private WebDriver driver;

    private SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }


}

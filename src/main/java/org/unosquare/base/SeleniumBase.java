package org.unosquare.base;

import com.beust.jcommander.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.unosquare.com/");


    }


}

package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualTitle =  driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle) ) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed!!!");
        }
    }
}
package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_WarmUp_Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String actualTitle =  driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification Passed!!!");
        } else {
            System.out.println("Title verification Failed!!!");
        }




    }
}

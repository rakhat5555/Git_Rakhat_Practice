package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //open a chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.google.com
        driver.get("https://www.google.com");

        //3. verify title:
        // expected : Google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle) ) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }
    }
}

package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PC2_ZeroBank {
    public static void main(String[] args) {

//        TC #2: Zero Bank link text verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//        3. Verify link text from top left:
//        Expected: “Zero Bank”
        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();
        if(actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification Passed!");
        } else {
            System.out.println("Link text verification Failed!");
        }
//        4. Verify link href attribute value contains:
//        Expected: “index.html”
        String expectedInHref = "index.html";
        String actualHrefValue = zeroBankLinkTopLeft.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref) ) {
            System.out.println("Href value verification Passed!");
        } else {
            System.out.println("Href value verification Failed!");
        }



    }
}

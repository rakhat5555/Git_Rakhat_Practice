package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // 1 - set up the web driver

        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of the chrome driver

        WebDriver driver =  new ChromeDriver(); //this line opens a window
        driver.manage().window().maximize();
        // 3 - test if driver is working
        driver.get("https://www.google.com");
      String title =  driver.getTitle();
        System.out.println("The title of this page is: " + title);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);

        driver.quit();

    }
}

package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_Facebook_IncorrectLogin {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("sfghuytre");
        driver.findElement(By.name("pass")).sendKeys("123456" + Keys.ENTER);
//        driver.findElement(By.name("login")).click();


        String expectedTitle= "Log into Facebook | Facebook";
        String actualTitle =  driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equalsIgnoreCase(expectedTitle) ) {
            System.out.println("Title verification pass!!!");
        } else {
            System.out.println("Title verification Failed!!!");
        }


    }
}

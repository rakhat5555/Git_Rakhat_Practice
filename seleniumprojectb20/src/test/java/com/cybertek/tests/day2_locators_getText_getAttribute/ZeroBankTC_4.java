package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC_4 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password" + Keys.ENTER);
        driver.findElement(By.id("account_activity_tab")).click();

        String actualTitle =  driver.getTitle();
        String expectedTitle = "Zero - Account Activity";

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Activity Title Verification Passed!!!");
        } else {
            System.out.println("Activity Title Verification Failed!!!");
        }
        driver.findElement(By.id("transfer_funds_tab")).click();
        String actualFundsTitle =  driver.getTitle();
        String expectedFundsTitle = "Zero - Transfer Funds";
        if(actualFundsTitle.equals(expectedFundsTitle)) {
            System.out.println("Transfer Funds Title Verification Passed!!!");
        } else {
            System.out.println("Transfer Funds Title Verification Failed!!!");
        }

        driver.findElement(By.id("pay_bills_tab")).click();
        String billActualTitle = driver.getTitle();
        String billExpectedTitle = "Zero - Pay Bills";
        if(billActualTitle.equals(billExpectedTitle)) {
            System.out.println("Pay bills title verification Passed!!!");
        } else {
            System.out.println("Pay bills title verification Failed!!!");
        }

        driver.findElement(By.id("money_map_tab")).click();
        String actualMoneyTitle =  driver.getTitle();
        String expectedMoneyTitle = "Zero - My Money Map";
        if(actualFundsTitle.equals(expectedFundsTitle)) {
            System.out.println("My Money Map Title verification Passed!!!");
        } else {
            System.out.println("My Money Map Title verification Failed!!!");
        }

        driver.findElement(By.id("online_statements_tab")).click();
        String actualOnlineStatementTitle = driver.getTitle();
        String expectedOnlineStatementTitle = "Zero - Online Statements";
        if (actualFundsTitle.equals(expectedFundsTitle)) {
            System.out.println("Online Statements link verification Passed!!!");
        } else {
            System.out.println("Online Statements link verification Failed!!!");
        }

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {

        }

        driver.close();
    }
}

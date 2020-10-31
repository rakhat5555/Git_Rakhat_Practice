package com.cybertek.tests.day13;
//TC#40: Dynamically Loaded Page Elements 7
// 1.Go tohttp://practice.cybertekschool.com/dynamic_loading/7
// 2.Wait until title is “Dynamic Title”
// 3.Assert : Message “Done” is displayed.
// 4.Assert : Image is displayed.
// Note: Follow POM
import com.cybertek.pages.Loading7page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Synchronization_Practices {
    @Test
    public void p40_dynamic_title_test() {
        String url = "http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);

        Loading7page loading7page = new Loading7page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // we need to use the object wait to setup our expected condition

        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        // assert that mesage is displayed
        Assert.assertTrue((loading7page.doneMessage.isDisplayed()));

    }
}

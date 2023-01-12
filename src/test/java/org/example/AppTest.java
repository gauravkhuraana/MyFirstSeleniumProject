package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Assert.assertTrue(true);
    }


    @Test
    public void myfirstTest() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://google.com");
        Assert.assertTrue(true);
        driver.quit();
    }

    @Test
    public void myfirstTestInFirefox() {
        WebDriver driver = WebDriverManager.firefoxdriver().create();
        driver.get("https://google.com");
        Assert.assertTrue(true);
        driver.quit();
    }

    @Test
    public void myfirstTestInEdge() {
        WebDriver driver = WebDriverManager.edgedriver().create();
        driver.get("https://google.com");
        Assert.assertTrue(true);
        driver.quit();
    }
}

package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;



public class Driver {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:/src/edge driver/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @After
    public void exit() {
        driver.close();
    }

    public static void navigate(String url) {
        driver.get(url);
    }

    public static WebElement getElement(By selector) {
        return driver.findElement(selector);
    }

}
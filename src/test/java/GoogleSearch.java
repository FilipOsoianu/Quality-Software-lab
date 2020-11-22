import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.edge.driver", "C:/src/edge driver/msedgedriver.exe");
        driver = new EdgeDriver();
        String baseUrl = "http://www.google.com/";
        driver.get(baseUrl);
    }

    @Test
    public void googleSearch() {
        WebElement input = driver.findElement(By.cssSelector("input.gLFyf"));
        input.sendKeys("computer");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).submit();
        boolean displayed = driver.findElement(By.xpath("//*[@id=\"logo\"]/img")).isDisplayed();
        Assert.assertTrue(displayed);
    }

    @AfterTest
    public static void exit() {
        driver.close();
    }

}

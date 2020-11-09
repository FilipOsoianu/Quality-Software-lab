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
    public void Test1() {
        WebElement input = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        input.sendKeys("computer");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
        boolean displayed = driver.findElement(By.xpath("/html/body/div[4]/form/div[2]/div[1]/div[1]/a/img")).isDisplayed();
        Assert.assertTrue(displayed);
    }

    @AfterTest
    public static void exit() {
        driver.close();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/src/edge driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://adoring-pasteur-3ae17d.netlify.app/mens.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a")).click();
    }


}

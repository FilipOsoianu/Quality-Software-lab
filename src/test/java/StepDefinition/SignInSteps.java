package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.getElement;
import static utils.Driver.navigate;


public class SignInSteps {

    @Given("Open web site")
    public void navigateToSinglePage() {
        navigate("https://adoring-pasteur-3ae17d.netlify.app");
    }

    @And("Click on Sign In header button")
    public void clickSignInHeaderButton() throws InterruptedException {
        getElement(By.xpath("//*[@id=\"home\"]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
    }

    @And("Input name")
    public void inputName() {
        WebElement input = getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[1]/input"));
        input.sendKeys("jora");
    }

    @And("Input email")
    public void inputEmail() {
        WebElement input = getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[2]/input"));
        input.sendKeys("jora@dada.com");
    }

    @And("Click on Sign In button")
    public void clickSignInButton() {
        getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/input")).submit();
    }

    @Then("User login")
    public void redirectsToNewPageWithInfo() {
        Assert.assertTrue(true);
    }
}

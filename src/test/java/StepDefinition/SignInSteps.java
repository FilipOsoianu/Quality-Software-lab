package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.*;
import static utils.Driver.getCurrentUrl;


public class SignInSteps {

    @Given("Open web site {string}")
    public void navigateToSinglePage(String url) {
        navigate(url);
    }

    @And("Click on Sign In header button")
    public void clickSignInHeaderButton() throws InterruptedException {
        getElement(By.xpath("//*[@id=\"home\"]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
    }

    @And("Input {string} {string}")
    public void inputName(String name, String email) {
        WebElement nameInput = getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[1]/input"));
        nameInput.sendKeys(name);
        WebElement emailInput = getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[2]/input"));
        emailInput.sendKeys(email);
    }

    @And("Click on Sign In button")
    public void clickSignInButton() {
        getElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/input")).submit();
    }

    @Then("User login {string}")
    public void redirectsToNewPageWithInfo(String initialUrl) {
        getCurrentUrl();
        Assert.assertNotEquals(initialUrl, getCurrentUrl());
    }
}

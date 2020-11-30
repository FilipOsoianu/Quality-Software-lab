package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.*;
import static utils.Driver.getCurrentUrl;


public class SignUpSteps {

    @Given("Open web {string}")
    public void navigateToSinglePage(String url) {
        navigate(url);
    }

    @And("Click on Sign Un header button")
    public void clickSignInHeaderButton() throws InterruptedException {
        getElement(By.xpath("//*[@id=\"home\"]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
    }

    @And("Input {string} {string} {string} {string}")
    public void inputName(String name, String email, String password, String confirmPassword) {
        WebElement nameInput = getElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[1]/input"));
        nameInput.sendKeys(name);
        WebElement emailInput = getElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[2]/input"));
        emailInput.sendKeys(email);
        WebElement passwordInput = getElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[3]/input"));
        passwordInput.sendKeys(password);
        WebElement confirmPasswordInput = getElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[4]/input"));
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    @And("Click on Sign Un button")
    public void clickSignInButton() {
        getElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/input")).submit();
    }

    @Then("User register {string}")
    public void redirectsToNewPageWithInfo(String initialUrl) {
        getCurrentUrl();
        Assert.assertNotEquals(initialUrl, getCurrentUrl());
    }

}

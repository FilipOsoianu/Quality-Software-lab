package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.*;


public class ContactFormSteps {

    @Given("Open site {string}")
    public void navigateToSinglePage(String url) {
        navigate(url);
    }

    @And("Click on contact")
    public void clickSignInHeaderButton() throws InterruptedException {
        getElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
        Thread.sleep(3000);
    }

    @And("Input value in form {string} {string} {string} {string}")
    public void inputName(String name, String email, String password, String confirmPassword) {
        WebElement nameInput = getElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[1]/input"));
        nameInput.sendKeys(name);
        WebElement emailInput = getElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input"));
        emailInput.sendKeys(email);
        WebElement passwordInput = getElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[3]/input"));
        passwordInput.sendKeys(password);
        WebElement confirmPasswordInput = getElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[4]/textarea"));
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    @And("Click on send")
    public void clickSignInButton() {
        getElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/input")).submit();
    }

    @Then("SendForm {string}")
    public void redirectsToNewPageWithInfo(String initialUrl) {
        getCurrentUrl();
        Assert.assertNotEquals(initialUrl, getCurrentUrl());
    }

}

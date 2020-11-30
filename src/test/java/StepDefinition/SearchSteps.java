package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.*;

public class SearchSteps {
    @Given("Open webpage {string}")
    public void navigateToSinglePage(String url) {
        navigate(url);
    }

    @And("Input {string}")
    public void inputName(String searchValue) throws InterruptedException {
        Thread.sleep(2000);
        WebElement input = getElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[1]"));
        input.sendKeys(searchValue);
    }

    @Then("search {string}")
    public void redirectsToNewPageWithInfo(String initialUrl) {
        getCurrentUrl();
        Assert.assertNotEquals(initialUrl, getCurrentUrl());
    }

}

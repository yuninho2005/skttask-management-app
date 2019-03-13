package com.sdevelopment.skt.management.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class CreateProductSteps {
    private WebDriver webDriver;

    @Before
    public void beforeStep() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        //webDriver = new ChromeDriver();
        webDriver = new RemoteWebDriver(new URL("http://localhost:8080"), DesiredCapabilities.chrome());

    }

    @After
    public void afterStep() {
        webDriver.quit();
    }

    @Given("I am in the page to create a new product")
    public void i_am_in_the_page_to_create_a_new_product() {
        String createProductUrl = "http://localhost:8080/products/create-product.jsp";
        String expectedTitle = "Create Product";
        String actualTitle = "";

        webDriver.get(createProductUrl);

        actualTitle = webDriver.getTitle();

        assertEquals(actualTitle, expectedTitle);
    }

    @When("I click the Create button")
    public void i_click_the_Create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("all the fields are empty")
    public void all_the_fields_are_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the page shouldn't let me continue")
    public void the_page_shouldn_t_let_me_continue() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("show an error {string}")
    public void show_an_error(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}

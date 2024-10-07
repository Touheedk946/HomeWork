package com.example.stepdefs;

import com.example.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignInSteps {
    private WebDriver driver;
    private SignInPage signInPage;

    public SignInSteps() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Adjust path accordingly
        this.driver = new ChromeDriver();
    }

    @Given("I am on the sign-in page")
    public void iAmOnTheSignInPage() {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        signInPage = new SignInPage(driver);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        signInPage.enterCredentials("test@example.com", "securepassword");
    }

    @When("I submit the sign-in form")
    public void iSubmitTheSignInForm() {
       

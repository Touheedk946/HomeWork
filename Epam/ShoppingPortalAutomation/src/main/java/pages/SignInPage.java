package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

    // Locators
    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By errorMessage = By.cssSelector(".alert-danger");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to sign-in page
    public void goTo() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    // Enter valid login credentials
    public void enterValidCredentials() {
        driver.findElement(emailInput).sendKeys("validEmail@example.com");
        driver.findElement(passwordInput).sendKeys("validPassword");
    }

    // Enter invalid login credentials
    public void enterInvalidCredentials() {
        driver.findElement(emailInput).sendKeys("invalidEmail@example.com");
        driver.findElement(passwordInput).sendKeys("invalidPassword");
    }

    // Submit the login form
    public void submit() {
        driver.findElement(signInButton).click();
    }

    // Check if login error is displayed
    public boolean isLoginErrorDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    // Perform login action for a valid account
    public void login() {
        goTo();
        enterValidCredentials();
        submit();
    }
}

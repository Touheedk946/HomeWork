package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    // Locators
    private By emailInput = By.id("email_create");
    private By registerButton = By.id("SubmitCreate");
    private By confirmationMessage = By.cssSelector(".confirmation-message"); // Assuming locator for confirmation
    private By emailErrorMessage = By.cssSelector(".email-error-message"); // Assuming locator for email error
    private By invalidFieldsErrorMessage = By.cssSelector(".invalid-fields-error"); // Assuming locator for invalid fields error

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to registration page
    public void goTo() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    // Fill in valid registration details
    public void fillInValidDetails() {
        driver.findElement(emailInput).sendKeys("newuser@example.com");
        // Add more fields for registration
    }

    // Fill in details with already registered email
    public void fillInWithUsedEmail() {
        driver.findElement(emailInput).sendKeys("existinguser@example.com");
        // Add more fields for registration
    }

    // Fill in invalid registration details
    public void fillInInvalidDetails() {
        driver.findElement(emailInput).sendKeys("invalidEmail");
        // Add more fields for registration
    }

    // Submit registration form
    public void submit() {
        driver.findElement(registerButton).click();
    }

    // Check if confirmation message is displayed
    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    // Check if email error message is displayed
    public boolean isEmailErrorMessageDisplayed() {
        return driver.findElement(emailErrorMessage).isDisplayed();
    }

    // Check if invalid fields error message is displayed
    public boolean isInvalidFieldsErrorDisplayed() {
        return driver.findElement(invalidFieldsErrorMessage).isDisplayed();
    }
}

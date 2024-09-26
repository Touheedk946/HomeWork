package SignletonDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // WebDriver instance
    private WebDriver driver;

    // Locating elements using @FindBy annotation
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    // Constructor to initialize the page elements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Initialize elements with PageFactory
        PageFactory.initElements(driver, this);
    }

    // Method to log in to the application
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}


package SignletonDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Open the login page
        driver.get("https://example.com/login");

        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        // Use the loginPage object to perform the login action
        loginPage.login("testuser", "password123");

        // Add assertions here to verify the login success
        // e.g., check for a specific URL or element on the landing page
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}


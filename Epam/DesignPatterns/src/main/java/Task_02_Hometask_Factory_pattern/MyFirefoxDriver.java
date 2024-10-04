package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        // Set the path for the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "src/main/geckodriver");

        // Configure Firefox options
        FirefoxOptions options = new FirefoxOptions();

        // Initialize the actual FirefoxDriver
        driver = new FirefoxDriver(options);
        System.out.println("Firefox browser initialized");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Firefox browser closed");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


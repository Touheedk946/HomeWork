package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Initialize the actual ChromeDriver
        driver = new ChromeDriver(options);
        System.out.println("Chrome browser initialized");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Chrome browser closed");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


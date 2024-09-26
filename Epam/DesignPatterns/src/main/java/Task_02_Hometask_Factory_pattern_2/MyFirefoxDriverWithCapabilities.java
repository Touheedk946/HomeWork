package Task_02_Hometask_Factory_pattern_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilities implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);
        options.addArguments("--private");

        driver = new FirefoxDriver(options);
        System.out.println("Firefox browser initialized with custom capabilities");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Firefox browser closed with custom capabilities");
        }
    }
}


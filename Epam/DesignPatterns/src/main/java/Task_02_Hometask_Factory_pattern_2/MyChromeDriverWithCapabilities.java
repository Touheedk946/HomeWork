package Task_02_Hometask_Factory_pattern_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        System.out.println("Chrome browser initialized with custom capabilities");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Chrome browser closed with custom capabilities");
        }
    }
}

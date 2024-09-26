package Task_02_Hometask_Factory_pattern_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver1 implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Firefox browser initialized with basic configuration");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Firefox browser closed");
        }
    }
}


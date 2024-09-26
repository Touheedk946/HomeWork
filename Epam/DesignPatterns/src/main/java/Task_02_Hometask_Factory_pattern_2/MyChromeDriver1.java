package Task_02_Hometask_Factory_pattern_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver1 implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Chrome browser initialized with basic configuration");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("Chrome browser closed");
        }
    }
}

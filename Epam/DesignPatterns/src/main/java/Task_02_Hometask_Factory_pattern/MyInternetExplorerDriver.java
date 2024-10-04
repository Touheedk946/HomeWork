package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyInternetExplorerDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {
        // Set the path for the IEDriverServer executable
        System.setProperty("webdriver.ie.driver", "src/main/IEDriverServer");

        // Configure IE options
        InternetExplorerOptions options = new InternetExplorerOptions();

        // Initialize the actual InternetExplorerDriver
        driver = new InternetExplorerDriver(options);
        System.out.println("IE browser initialized");
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
            System.out.println("IE browser closed");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class DependencyInjection {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

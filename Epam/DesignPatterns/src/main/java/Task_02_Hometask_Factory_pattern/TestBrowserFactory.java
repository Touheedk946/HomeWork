package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;

public class TestBrowserFactory {
    public static void main(String[] args) {
        // Get a Chrome browser instance
        Browser chromeBrowser = BrowserFactory.getBrowser("chrome");
        chromeBrowser.initialize();
        // Perform test operations using chromeBrowser.getDriver()
        chromeBrowser.quit();

        // Get a Firefox browser instance
        Browser firefoxBrowser = BrowserFactory.getBrowser("firefox");
        firefoxBrowser.initialize();
        // Perform test operations using firefoxBrowser.getDriver()
        firefoxBrowser.quit();
    }
}

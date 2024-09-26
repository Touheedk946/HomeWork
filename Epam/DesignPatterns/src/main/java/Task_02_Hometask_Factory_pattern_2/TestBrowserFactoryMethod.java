package Task_02_Hometask_Factory_pattern_2;

import Task_02_Hometask_Factory_pattern.BrowserFactory;

public class TestBrowserFactoryMethod {
    public static void main(String[] args) {
        // Using basic Chrome browser
        BrowserFactory basicChromeFactory = new ChromeBrowserFactory();
        Browser basicChrome = basicChromeFactory.createBrowser();
        basicChrome.initialize();
        basicChrome.quit();

        // Using Chrome browser with custom capabilities
        BrowserFactory customChromeFactory = new ChromeBrowserWithCapabilitiesFactory();
        Browser customChrome = customChromeFactory.createBrowser();
        customChrome.initialize();
        customChrome.quit();

        // Using basic Firefox browser
        BrowserFactory basicFirefoxFactory = new FirefoxBrowserFactory();
        Browser basicFirefox = basicFirefoxFactory.createBrowser();
        basicFirefox.initialize();
        basicFirefox.quit();

        // Using Firefox browser with custom capabilities
        BrowserFactory customFirefoxFactory = new FirefoxBrowserWithCapabilitiesFactory();
        Browser customFirefox = customFirefoxFactory.createBrowser();
        customFirefox.initialize();
        customFirefox.quit();
    }
}



/*
Explanation:
Browser Interface: Provides a common contract for all browser classes.
Concrete Browser Classes: Implement the Browser interface, with some having basic initialization and others custom capabilities.
Abstract Factory Class: Declares the createBrowser() method, which concrete factory subclasses implement.
Concrete Factory Classes: Implement the factory method to return specific browser instances, either basic or with custom capabilities.
Client Code: Demonstrates using the factory classes to obtain browser instances without directly instantiating them.
This approach follows the Factory Method pattern by allowing subclasses (factory classes) to decide which concrete class to instantiate.
 */

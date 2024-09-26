package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;

public abstract class BrowserFactory {
    public static Browser getBrowser(String browserType) {
        if (browserType == null) {
            throw new IllegalArgumentException("Browser type cannot be null");
        }

        switch (browserType.toLowerCase()) {
            case "chrome":
                return new MyChromeDriver();
            case "firefox":
                return new MyFirefoxDriver();
            case "ie":
            case "internet explorer":
                return new MyInternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Invalid browser type: " + browserType);
        }
    }

    public abstract Browser createBrowser();
}

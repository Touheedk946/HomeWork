package Task_02_Hometask_Factory_pattern_2;

import Task_02_Hometask_Factory_pattern.BrowserFactory;
import Task_02_Hometask_Factory_pattern.MyFirefoxDriver;

public class FirefoxBrowserFactory1 extends BrowserFactory {

    public Browser createBrowser() {
        return new MyFirefoxDriver();
    }
}

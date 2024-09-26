package Task_02_Hometask_Factory_pattern_2;

import Task_02_Hometask_Factory_pattern.BrowserFactory;
import Task_02_Hometask_Factory_pattern.MyChromeDriver;

public class ChromeBrowserFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriver();
    }
}


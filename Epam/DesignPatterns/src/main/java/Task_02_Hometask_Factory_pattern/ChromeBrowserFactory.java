package Task_02_Hometask_Factory_pattern;

import Task_02_Hometask_Factory_pattern_2.Browser;

public class ChromeBrowserFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriver();
    }
}


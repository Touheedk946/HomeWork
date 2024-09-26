package Task_02_Hometask_Factory_pattern_2;

import Task_02_Hometask_Factory_pattern.BrowserFactory;

public class ChromeBrowserWithCapabilitiesFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriverWithCapabilities();
    }
}


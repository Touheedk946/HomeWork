package Task_04_Hometask_Decorator_pattern;

// AdsWidgetDecorator.java
public class AdsWidgetDecorator extends WebPageDecorator {
    public AdsWidgetDecorator(WebPage page) {
        super(page);
    }

    @Override
    public int getRank() {
        return page.getRank() + 3; // Ads widget adds a rank of 3
    }

    @Override
    public String getDescription() {
        return page.getDescription() + " with Ads Widget";
    }
}

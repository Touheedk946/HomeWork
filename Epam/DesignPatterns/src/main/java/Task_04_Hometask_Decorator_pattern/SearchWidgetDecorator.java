package Task_04_Hometask_Decorator_pattern;

// SearchWidgetDecorator.java
public class SearchWidgetDecorator extends WebPageDecorator {
    public SearchWidgetDecorator(WebPage page) {
        super(page);
    }

    @Override
    public int getRank() {
        return page.getRank() + 7; // Search widget adds a rank of 7
    }

    @Override
    public String getDescription() {
        return page.getDescription() + " with Search Widget";
    }
}

package Task_04_Hometask_Decorator_pattern;

// ChatWidgetDecorator.java
public class ChatWidgetDecorator extends WebPageDecorator {
    public ChatWidgetDecorator(WebPage page) {
        super(page);
    }

    @Override
    public int getRank() {
        return page.getRank() + 5; // Chat widget adds a rank of 5
    }

    @Override
    public String getDescription() {
        return page.getDescription() + " with Chat Widget";
    }
}

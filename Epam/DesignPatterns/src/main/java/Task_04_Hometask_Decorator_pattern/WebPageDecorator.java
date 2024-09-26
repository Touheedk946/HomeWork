package Task_04_Hometask_Decorator_pattern;

// WebPageDecorator.java
public abstract class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public int getRank() {
        return page.getRank();
    }

    @Override
    public String getDescription() {
        return page.getDescription();
    }
}


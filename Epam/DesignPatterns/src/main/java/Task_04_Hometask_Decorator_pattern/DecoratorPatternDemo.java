package Task_04_Hometask_Decorator_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a basic mobile page
        WebPage mobilePage = new MobilePage();
        System.out.println(mobilePage.getDescription() + " with rank: " + mobilePage.getRank());

        // Add Chat widget to mobile page
        mobilePage = new ChatWidgetDecorator(mobilePage);
        System.out.println(mobilePage.getDescription() + " with rank: " + mobilePage.getRank());

        // Add Ads widget to mobile page
        mobilePage = new AdsWidgetDecorator(mobilePage);
        System.out.println(mobilePage.getDescription() + " with rank: " + mobilePage.getRank());

        // Create a basic desktop page
        WebPage desktopPage = new DesktopPage();
        System.out.println(desktopPage.getDescription() + " with rank: " + desktopPage.getRank());

        // Add Search widget to desktop page
        desktopPage = new SearchWidgetDecorator(desktopPage);
        System.out.println(desktopPage.getDescription() + " with rank: " + desktopPage.getRank());

        // Add Chat widget to desktop page
        desktopPage = new ChatWidgetDecorator(desktopPage);
        System.out.println(desktopPage.getDescription() + " with rank: " + desktopPage.getRank());
    }
}



/*

The Decorator Pattern is useful when we want to add responsibilities to objects dynamically and flexibly. In this task, we need to build a model representing a webpage that can have different formats and can be enhanced with different widgets. Each format and widget has a rank associated with it, and the total rank of the page should reflect the cumulative rank of the format and added widgets.


Component Interface (WebPage): Defines the methods to get the rank and description of a page.
Concrete Components (DesktopPage, MobilePage): Represent different base formats of the webpage with their own ranks.
Decorator Base Class (WebPageDecorator): Holds a reference to a WebPage object and forwards requests to it. This is the base class for all widget decorators.
Concrete Decorators (ChatWidgetDecorator, AdsWidgetDecorator, SearchWidgetDecorator): Each decorator adds its own rank to the existing page rank and appends its description.
Client Code: Demonstrates adding different widgets to different page formats and calculates the cumulative rank.
The advantage of using the decorator pattern is that it allows us to dynamically add functionality (widgets) to objects (web pages) in a flexible manner, without altering the original class definitions.


 */

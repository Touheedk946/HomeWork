package Task_04_Hometask_Decorator_pattern;

// DesktopPage.java
public class DesktopPage implements WebPage {
    @Override
    public int getRank() {
        return 10; // Assume base rank for desktop version
    }

    @Override
    public String getDescription() {
        return "Desktop Version";
    }
}

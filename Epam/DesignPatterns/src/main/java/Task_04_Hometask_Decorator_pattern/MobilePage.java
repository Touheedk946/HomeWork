package Task_04_Hometask_Decorator_pattern;

// MobilePage.java
public class MobilePage implements WebPage {
    @Override
    public int getRank() {
        return 8; // Assume base rank for mobile version
    }

    @Override
    public String getDescription() {
        return "Mobile Version";
    }
}

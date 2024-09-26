package Task_03_Hometask_Strategy_pattern;

// TextSharingStrategy.java
public class TextSharingStrategy implements SharingStrategy {
    @Override
    public void share() {
        System.out.println("Sharing the photo via Text Message.");
    }
}


package Task_03_Hometask_Strategy_pattern;

// EmailSharingStrategy.java
public class EmailSharingStrategy implements SharingStrategy {
    @Override
    public void share() {
        System.out.println("Sharing the photo via Email.");
    }
}

package Task_03_Hometask_Strategy_pattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create an instance of the basic camera app
        PhoneCameraApp basicApp = new BasicCameraApp();

        // Use basic functionalities
        basicApp.takePhoto();
        basicApp.editPhoto();
        basicApp.savePhoto();

        // Set a sharing strategy
        basicApp.setSharingStrategy(new TextSharingStrategy());
        basicApp.sharePhoto();

        // Change the sharing strategy at runtime
        basicApp.setSharingStrategy(new EmailSharingStrategy());
        basicApp.sharePhoto();

        // Create an instance of the CameraPlus app
        PhoneCameraApp plusApp = new CameraPlusApp();

        // Use plus functionalities
        plusApp.takePhoto();
        plusApp.editPhoto();
        plusApp.savePhoto();

        // Set a different sharing strategy
        plusApp.setSharingStrategy(new SocialMediaSharingStrategy());
        plusApp.sharePhoto();
    }
}

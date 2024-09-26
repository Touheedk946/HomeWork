package Task_03_Hometask_Strategy_pattern;

// PhoneCameraApp.java
public abstract class PhoneCameraApp {
    private SharingStrategy sharingStrategy;

    public void setSharingStrategy(SharingStrategy sharingStrategy) {
        this.sharingStrategy = sharingStrategy;
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public abstract void editPhoto();

    public void savePhoto() {
        System.out.println("Saving the photo...");
    }

    public void sharePhoto() {
        if (sharingStrategy != null) {
            sharingStrategy.share();
        } else {
            System.out.println("No sharing strategy selected.");
        }
    }
}


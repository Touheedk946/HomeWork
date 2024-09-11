package appliance;

public class Fan extends Appliance {

    public Fan() {
        super("Fan", 5);
    }

    public void switchOn() {
        System.out.println("Fan is switched on, consuming " + getPowerConsumption() + " unit of power.");
    }
}

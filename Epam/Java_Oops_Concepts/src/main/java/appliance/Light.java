package appliance;

public class Light extends Appliance {

    public Light() {
        super("Light", 2);
    }


    public void switchOn() {
        System.out.println("Light is switched on, consuming " + getPowerConsumption() + " units of power.");
    }
}

package appliance;

public class Home {
    private Appliance[] appliances;
    private int count;

    public Home(int size) {
        appliances = new Appliance[size];
        count = 0;
    }

    public void addAppliance(Appliance appliance) {
        if (count < appliances.length) {
            appliances[count++] = appliance;
        } else {
            System.out.println("As we Assign the size of Appliances initially No more space to add appliances.");
        }
    }

    public int calculateCurrentLoad() {
        int totalLoad = 0;
        // We Knew the count is 5
        for (int i = 0; i < count; i++) {
            // As per the appliances PowerConsumptions which is set with respective applience we are getting values
            totalLoad += appliances[i].getPowerConsumption();
        }
        return totalLoad;
    }

    /*
    In this sortAppliancesByPowerConsumption Function we are using two for loops, one for pick the first index.
    second for iterating and comparing the index values with next index array of appliances.

    Using If condidtion to compare and storing appliances in temp variable if its greater then next index value.
     */
    public void sortAppliancesByPowerConsumption() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                //checking the condition of appliances index with next index  is it greater or not
                if (appliances[j].getPowerConsumption() > appliances[j + 1].getPowerConsumption()) {
                    // Swap appliances[j] and appliances[j + 1]
                    Appliance temp = appliances[j];
                    appliances[j] = appliances[j + 1];
                    appliances[j + 1] = temp;
                }
            }
        }
    }

    /*
    We already declare a function in abstract class
     And implementation we are doing in sub classes , TV, Fan, Light, Laptop.

     */
    public void switchOnAllAppliances() {
        for (int i = 0; i < count; i++) {
            appliances[i].switchOn();
        }
    }


    public void showAppliances() {
        for (int i = 0; i < count; i++) {
            // As we save all appliances in Array by Index we are iterating them.
            System.out.println(appliances[i]);
        }
    }
}

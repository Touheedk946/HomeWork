package epam.system.Bank;

public class CashSlot {
    private int dispensedCash;

    public void dispense(int amount) {
        this.dispensedCash = amount;
    }

    public int getDispensedCash() {
        return dispensedCash;
    }
}

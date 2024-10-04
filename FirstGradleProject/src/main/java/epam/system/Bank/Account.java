package epam.system.Bank;


public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, CashSlot cashSlot) {
        if (amount <= balance) {
            balance -= amount;
            cashSlot.dispense(amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

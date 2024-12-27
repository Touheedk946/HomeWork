package tests.example.models;

public class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public double requestCash(double amount) {
        return account.withdraw(amount);
    }
}

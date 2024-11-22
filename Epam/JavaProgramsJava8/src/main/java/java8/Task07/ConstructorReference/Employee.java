package java8.Task07.ConstructorReference;

public class Employee {
    private final String name;
    private final String accountNumber;
    private final double salary;

    public Employee(String name, String accountNumber, double salary) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getSalary() {
        return salary;
    }
}

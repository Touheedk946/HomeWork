package java8.Task07.ConstructorReference;

import java.util.function.Supplier;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        EmployeeFactory factory = Employee::new;
        Employee employee = factory.create("Dravid", "456123", 55000);

        Supplier<String> getName = employee::getName;
        Supplier<String> getAccountNumber = employee::getAccountNumber;
        Supplier<Double> getSalary = employee::getSalary;

        System.out.println("Employee Name: " + getName.get());
        System.out.println("Employee Account Number: " + getAccountNumber.get());
        System.out.println("Employee Salary: $" + getSalary.get());
    }
}

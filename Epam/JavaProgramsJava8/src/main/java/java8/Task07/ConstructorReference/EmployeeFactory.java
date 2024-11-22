package java8.Task07.ConstructorReference;

@FunctionalInterface
public interface EmployeeFactory {
    Employee create(String name, String accountNumber, double salary);
}

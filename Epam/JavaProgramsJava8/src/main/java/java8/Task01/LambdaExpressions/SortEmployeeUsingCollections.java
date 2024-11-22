package java8.Task01.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeUsingCollections {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Touheed", 30));
        employees.add(new Employee("Khan", 30));
        employees.add(new Employee("Sahab", 33));
        employees.add(new Employee("Kumar", 30));
        employees.add(new Employee("Surya", 40));

        Collections.sort(employees, new EmployeeNameComparator());

        System.out.println("Employees sorted by name in descending order: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

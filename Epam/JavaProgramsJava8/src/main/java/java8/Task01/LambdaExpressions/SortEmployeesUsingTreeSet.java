package java8.Task01.LambdaExpressions;

import java.util.Comparator;
import java.util.TreeSet;

public class SortEmployeesUsingTreeSet {

    public static void main(String[] args) {

        Comparator<Employee> orderByName = (a,b) -> a.getName().compareTo(b.getName());

        TreeSet<Employee> employees = new TreeSet<>(orderByName);
        employees.add(new Employee("Touheed", 30));
        employees.add(new Employee("Dhoni", 40));
        employees.add(new Employee("Rohit", 35));
        employees.add(new Employee("Virat", 33));
        employees.add(new Employee("Bhumrah", 32));

        System.out.println("Employees sorted by names: " );
        for(Employee employee: employees){
            System.out.println(employee);
        }

    }
}

package java8.Task01.LambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Touheed", 30));
        employees.add(new Employee("Khan", 25));
        employees.add(new Employee("Dhoni", 40));
        employees.add(new Employee("Kholi", 33));
        employees.add(new Employee("Rohit", 35));

       Comparator<Employee> nameOrder =  (a, b) -> a.getName().compareTo(b.getName());

       employees.sort(nameOrder);

        System.out.println("Sorted List of employees in alphabetical order");
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}

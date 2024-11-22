package java8.Task01.LambdaExpressions;

import java.util.Comparator;
import java.util.TreeMap;

public class SortEmployeeUsingTreeMap {
    public static void main(String[] args) {

        Comparator<Employee> nameOrder = (a, b) -> a.getName().compareTo(b.getName());

        TreeMap<Employee, String> employeeTreeMap = new TreeMap<>(nameOrder.reversed());
        employeeTreeMap.put(new Employee("Touheed", 30), "501");
        employeeTreeMap.put(new Employee("Khan", 50), "503");
        employeeTreeMap.put(new Employee("Dravid", 55), "502");
        employeeTreeMap.put(new Employee("Laxman", 45), "504");
        employeeTreeMap.put(new Employee("Ganguly", 54), "506");
        employeeTreeMap.put(new Employee("Tendulkar", 53), "505");

        System.out.println("TreeMap with Employees sorted in descending order of their names: " + employeeTreeMap);

    }
}

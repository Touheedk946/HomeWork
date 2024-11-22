package java8.Task01.LambdaExpressions;

public class Employee {
    private final String name;
    private final int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}


package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise1 {

    public static void main(String[] args) {
        //1.Argument list, 2.arrow token, 3.body to run
        //Compiler knows runnable interface only has 1 method (run) which has no parameter
//        new Thread(() -> {
//            System.out.println("Printing From Runnable");
//            System.out.println("line 2");
//            System.out.format("line 3");
//        }).start();
//
//
//        new Thread(() -> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();
//
//        new Thread(() -> {
//            System.out.println("q1qweqw");
//        });

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Employee employee1 = new Employee("sdas", 44);
//        Employee employee2 = new Employee("sdas", 44);
        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
        System.out.println(employees);
//
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
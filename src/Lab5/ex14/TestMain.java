package ex14;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee);

        employee.setSalary(999);
        System.out.println(employee);

        System.out.println("Id is: " + employee.getId());
        System.out.println("First name is: " + employee.getFirstName());
        System.out.println("Last name is: " + employee.getLastName());
        System.out.println("Salary is: " + employee.getSalary());

        System.out.println("Name is " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Annual salary is " + employee.getAnnualSalary());

        // To raise salary
        employee.raiseSalary(10);
        System.out.println("After raising salary by 10%");
        System.out.println(employee);

    }

}


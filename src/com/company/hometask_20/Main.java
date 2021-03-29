package com.company.hometask_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Max", 3774, 1550.67);
        String currentDir = System.getProperty("user.dir");

        Methods.serialize(employee,currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");
        System.out.println(Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt"));

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee));
        employees.add(new Employee("Den", 5612, 999.99));
        employees.add(new Employee("Hanna", 777, 1867.4));
        employees.add(new Employee("Mary", 9262, 1290.87));

        Methods.serialize(employees, currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");
        List<Employee> employeesDeserialized = (List<Employee>) Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");

        System.out.println(employeesDeserialized);
    }
}

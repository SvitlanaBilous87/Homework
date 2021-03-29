package com.company.hometask_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Max", 3774, new Salary(1550.67));
        String currentDir = System.getProperty("user.dir");

        Methods.serialize(employee,currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");
        System.out.println(Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt"));

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee));
        employees.add(new Employee("Den", 5612, new Salary(999.99)));
        employees.add(new Employee("Hanna", 777, new Salary(1867)));
        employees.add(new Employee("Mary", 9262, new Salary(1290)));

        Methods.serialize(employees, currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");
        List<Employee> employeesDeserialized = (List<Employee>) Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");

        System.out.println(employeesDeserialized);

        List<Salary> salaries = new ArrayList<>();

        for (Employee e : employees){
            salaries.add(e.getSalary());
        }

        Methods.serialize(salaries, currentDir+"\\src\\com\\company\\hometask_20\\salaryOut.txt");
        List<Salary> salariesDeserialized = (List<Salary>) Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\salaryOut.txt");

        for (Employee e : employees){
            System.out.println(e.getName()+"'s salary is "+ salariesDeserialized.get(employees.indexOf(e)).getSum());
        }
    }
}

package com.company.hometask_20;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Max", 3774, 1550.67);
        String currentDir = System.getProperty("user.dir");

        Methods.serialize(employee,currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt");
        System.out.println(Methods.deserialize(currentDir+"\\src\\com\\company\\hometask_20\\employeeOut.txt"));

    }
}

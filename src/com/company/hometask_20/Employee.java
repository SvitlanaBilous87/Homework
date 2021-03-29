package com.company.hometask_20;

import java.io.Serializable;

public class Employee implements Serializable {

    private final long serialVersionUID = 1L;
    private String name;
    private int id;
    private transient Salary salary;

    public Employee(String name, int id, Salary salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

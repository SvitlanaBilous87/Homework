package com.company.hometask_07;

public class CoffeRobot extends Robot {
    private String name;

    public CoffeRobot(String name) {
        super(name);
        this.name = "Coffe" + name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("Я " + name + " - я варю каву");
    }
}
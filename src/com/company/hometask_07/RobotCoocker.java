package com.company.hometask_07;

public class RobotCoocker extends Robot {
    private String name;

    public RobotCoocker(String name) {
        super(name);
        this.name = name + "Cooker";
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
        System.out.println("Я " + name + " - я просто готую");
    }
}
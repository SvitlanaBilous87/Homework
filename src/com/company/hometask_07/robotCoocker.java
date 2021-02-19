package com.company.hometask_07;

public class robotCoocker extends robot {
    private String name;

    public robotCoocker(String name) {
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
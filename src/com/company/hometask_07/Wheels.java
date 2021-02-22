package com.company.hometask_07;

public class Wheels {
    private int diameter;
    private int width;
    private String model;
    Wheels(int diameter, int width, String model) {
        this.diameter=diameter;
        this.width=width;
        this.model=model;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Wheels {" +
                "diameter " + diameter +
                " sm, width " + width +
                " sm, model " + model +
                '}';
    }
    public void tuningWheels(int increaseD, int increaseW, String model){
        this.diameter=diameter*increaseD;
        this.width=width*increaseW;
        this.model=model;
    }
}

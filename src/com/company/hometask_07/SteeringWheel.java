package com.company.hometask_07;

public class SteeringWheel {
    private int diameter;
    private String material;
    private String color;
    SteeringWheel(int diameter, String material, String color) {
        this.diameter=diameter;
        this.material=material;
        this.color=color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SteeringWheel {" +
                "diameter " + diameter +
                " sm, material " + material +
                ", color " + color +
                '}';
    }

    public void tuningSteeringWheel(int k, String color){
        this.diameter=diameter*k;
        this.color=color;
    }
}

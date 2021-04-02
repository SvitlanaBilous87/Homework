package com.company.hometask_22.annotation_task;

public class Car{

    @MyAnnotation(value = "very important")
    private String model;
    @MyAnnotation(value = "important")
    private int year;
    private String color;
    private int mileage;

    public Car(String model, int year, String color, int mileage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

package com.company.hometask_15;

import java.util.Scanner;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    Scanner scan = new Scanner(System.in);

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car() {
        System.out.println("Enter car model:");
        this.model = scan.next();
        System.out.println("Enter year of manufacture:");
        this.year = scan.nextInt();
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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.year > o.getYear()){
            return 1;
        }
        else if (this.year < o.getYear()){
            return -1;
        }
        else {
            return this.model.compareTo(o.getModel());
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && model.equals(car.model);
    }
}

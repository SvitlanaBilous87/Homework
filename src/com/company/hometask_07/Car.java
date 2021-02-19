package com.company.hometask_07;

public class Car {
    private String model;
    private int year;
    private String fuel;
    private int fuelCapacity;
    private steeringWheel steeringWheel;
    private wheels wheels;
    private body body;

    public Car(String model, int year, String fuel, int fuelCapacity, com.company.hometask_07.steeringWheel steeringWheel, com.company.hometask_07.wheels wheels, com.company.hometask_07.body body) {
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
        this.body = body;
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

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public com.company.hometask_07.steeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(com.company.hometask_07.steeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public com.company.hometask_07.wheels getWheels() {
        return wheels;
    }

    public void setWheels(com.company.hometask_07.wheels wheels) {
        this.wheels = wheels;
    }

    public com.company.hometask_07.body getBody() {
        return body;
    }

    public void setBody(com.company.hometask_07.body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model " + model +
                ", year " + year +
                ", fuel " + fuel +
                ", fuelCapacity " + fuelCapacity +
                ", " + steeringWheel +
                ", " + wheels +
                ", " + body +
                '}';
    }

    public void longRide(){
        if (fuelCapacity == 0) {
            System.out.println("Need to refuel.");
            fuelCapacity = 50;
        }
            else {
            System.out.println("We are riding far far away...");
            fuelCapacity = 0;
        }
        }
    }

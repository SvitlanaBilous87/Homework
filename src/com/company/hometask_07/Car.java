package com.company.hometask_07;

public class Car {
    private String model;
    private int year;
    private String fuel;
    private int fuelCapacity;
    private SteeringWheel steeringWheel;
    private Wheels wheels;
    private Body body;

    public Car(String model, int year, String fuel, int fuelCapacity, SteeringWheel steeringWheel, Wheels wheels, Body body) {
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

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model " + model +
                ", year " + year +
                ", fuel " + fuel +
                ", fuelCapacity " + fuelCapacity +
                " l, " + steeringWheel +
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

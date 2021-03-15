package com.company.hometask_15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Car> carsHash = new HashSet<>();
        carsHash.add(new Car("Toyota", 2013));
        carsHash.add(new Car("Honda", 2015));
        carsHash.add(new Car("Mazda", 2006));
        carsHash.add(new Car("Fiat", 2013));
        carsHash.add(new Car("Tesla", 2018));

        System.out.println("Non-sorted cars: ");
        for (Car car : carsHash) {
            System.out.println(car);
        }
        System.out.println();

        List<Car> cars = new ArrayList<>(carsHash);
        Collections.sort(cars);

        Set<Car> carsLink = new LinkedHashSet<>(cars);

        System.out.println("Sorted cars: ");
        for (Car car : carsLink) {
            System.out.println(car);
        }
        System.out.println();

        Set<Car> carsTree = new TreeSet<>(carsHash);
        carsTree.add(new Car());

        System.out.println("Sorted in tree cars: ");
        for (Car car : carsTree) {
            System.out.println(car);
        }
    }
}
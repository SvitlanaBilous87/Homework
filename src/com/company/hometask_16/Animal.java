package com.company.hometask_16;

import java.util.Objects;
import java.util.Scanner;

public class Animal {

    private String type;
    private String name;
    Scanner scan = new Scanner(System.in);

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal() {
        System.out.println("Enter animal's type:");
        this.type = scan.next();
        System.out.println("Enter animal's name:");
        this.name = scan.next();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return type.equals(animal.type) && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }
}

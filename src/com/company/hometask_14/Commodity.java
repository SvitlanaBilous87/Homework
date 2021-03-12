package com.company.hometask_14;

import java.util.Comparator;
import java.util.Scanner;

public class Commodity {

        private String name;
        private Integer length;
        private Integer width;
        private Double weight;

    public Commodity(String name, Integer length, Integer width, Double weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Commodity() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = scan.next();
        System.out.println("Enter length:");
        try {
            if (scan.hasNextInt()) {
                length = scan.nextInt();
                if (length > 0) {
                    this.length = length;
                    System.out.println("Enter width:");
                    if (scan.hasNextInt()) {
                        width = scan.nextInt();
                        if (width > 0) {
                            this.width = width;
                            System.out.println("Enter weight:");
                            if (scan.hasNextDouble()) {
                                weight = scan.nextDouble();
                                if (weight > 0) {
                                    this.weight = weight;
                                } else {
                                    throw new IllegalArgumentException("Weight must be >0.");
                                }
                            } else {
                                throw new IllegalArgumentException("Weight must be number.");
                            }
                        } else {
                            throw new IllegalArgumentException("Width must be >0.");
                        }
                    } else {
                        throw new IllegalArgumentException("Width must be integer number.");
                    }
                } else {
                    throw new IllegalArgumentException("Length must be >0.");
                }
            }
             else {
                throw new IllegalArgumentException("Length must be integer number.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name +
                "', length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

}

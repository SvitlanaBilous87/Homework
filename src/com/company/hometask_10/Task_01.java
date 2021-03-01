package com.company.hometask_10;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        First task: checking integer number. Is it even or odd.
         */
        System.out.println("Enter integer number: ");
        double x = scan.nextDouble();
        try {
            if (x != (int) x) {
                throw new NotIntegerException("Number is not integer.");
            } else {
                if (x % 2 == 0) {
                    System.out.println((int)x + " is even number.");
                } else {
                    System.out.println((int)x + " is odd number.");
                }
            }
        } catch (NotIntegerException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Number is checked.");
        }
    }
}



package com.company.hometask_10;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Second task: checking integer numbers. Their sum calculation.
         */
        System.out.println("Enter two integer numbers: ");
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        try {
            if (x1 != (int) x1 || x2 != (int) x2) {
                throw new NotIntegerException("Incorrect input. Both numbers should be integer.");
            } else {
                System.out.println("Sum of your numbers equals "+(int)(x1+x2)+".");
            }
        } catch (NotIntegerException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Numbers are checked.");
        }
    }
}



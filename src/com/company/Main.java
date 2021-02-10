package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привіт! Давайте розв'яжемо квадратне рівняння ax²+bx+c=0 :)");
        rozvKvR();
    }
    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        }
        else {
            System.out.println("Помилка введення даних! Потрібно ввести числове значення: ");
            return getNumber();
        }
    }
    public static void rozvKvR() {
        System.out.println("Введіть коефіцієнт a:");
        double a = getNumber();
        System.out.println("Введіть коефіцієнт b:");
        double b = getNumber();
        System.out.println("Введіть коефіцієнт c:");
        double c = getNumber();
        if (a == 0) {
            double x = -c / b;
            System.out.println("Рівняння має один розв'язок x=" + roundTo(x));
        } else if (b == 0) {
            double y = -c / a;
            if (y >= 0) {
                double x = Math.sqrt(y);
                System.out.println("Рівняння має один розв'язок x=" + roundTo(x));
            } else {
                System.out.println("Рівняння не має розв'язку :(");
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Рівняння має два розв'язки: x1=" + roundTo(x1) + "; та x2=" +
                        roundTo(x2));
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("Рівняння має один розв'язок x=" + roundTo(x));
            } else {
                System.out.println("Рівняння не має розв'язку :(");
            }
        }
    }
    public static String roundTo(double val)
    {
        return String.format("%.2f", val);
    }
}

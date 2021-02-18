package com.company.hometask_06;

import java.util.Scanner;

public class Circle {
    double r;
    double d;

    Circle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вкажіть радіус та діаметр кола:");
        r = scan.nextDouble();
        d = scan.nextDouble();
        boolean a=false;
        while (a==false) {
            if (r <= 0 || d <= 0) {
                System.out.println("Некоректні дані. Обидва значення мають бути > 0. Спробуйте ще раз: ");
                r = scan.nextDouble();
                d = scan.nextDouble();
            }
            else {
                a = true;
            }
        }
        while (a==true) {
            if (r*2 != d){
                System.out.println("Некоректні дані. Діаметр повинен дорівнювати 2*радіус. Спробуйте ще раз: ");
                r = scan.nextDouble();
                d = scan.nextDouble();
            }
            else {
                a = false;
            }
        }
    }
    Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double length() {
        return 2 * 3.14 * r;
    }

    public double square() {
        return 3.14 * Math.pow((d / 2), 2);
    }
}
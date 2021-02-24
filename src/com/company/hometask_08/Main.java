package com.company.hometask_08;

import com.company.hometask_08.second.MyCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть два числа: ");
        MyCalculator m1 = new MyCalculator(scan.nextDouble(), scan.nextDouble());
        System.out.println("a+b="+m1.addition()+";"+"\n"+"a-b="+m1.subtraction()+";"+"\n"+
                "a*b="+m1.multiplication()+";"+"\n"+"a/b="+m1.division()+".");
    }
}

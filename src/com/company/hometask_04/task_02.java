package com.company.hometask_04;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        int ar[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Ведіть " + (i + 1) + "-ий елемент масиву: ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Ось що ми отримали: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        System.out.println("І тепер в зворотньому порядку: ");
        for (int i = ar.length-1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }
}
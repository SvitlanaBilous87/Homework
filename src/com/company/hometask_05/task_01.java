package com.company.hometask_05;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.println("Введіть суму, яку ви готові покласти на депозит: ");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        System.out.println("Введіть бажаний відсоток річних: ");
        double n = sc.nextInt();
        System.out.println("Введіть термін депозиту (кількість років): ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            double anualP = (m * (n/100));
            m = m + anualP;
        }
        System.out.println("Через " + k + " років ви заберете з банку: " + m);
    }
}
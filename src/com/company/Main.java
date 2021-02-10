package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ЗАВДАННЯ №2");
        days();
        System.out.println("");
        System.out.println("ЗАВДАННЯ №3");
        print55el();
        System.out.println("");
        System.out.println("ЗАВДАННЯ №4");
        printfrom90();
        System.out.println("");
        System.out.println("ЗАВДАННЯ №5");
        compare10();
    }

    public static void days() {
            System.out.println("Привіт! Давай перевірим, що на сьогодні заплановано :)");
            System.out.println("Який сьогодні день тижня? Напишіть українською мовою:");
            Scanner sc = new Scanner(System.in);
            String day = sc.nextLine();
            switch (day) {
                case "понеділок": {
                    System.out.println("ГІПЕРважливих справ сьогодні нема, головне зібратися духом, відійти" +
                            " від вихідних та настроїтися на роботу.");
                    break;
                }
                case "вівторок": {
                    System.out.println("Після роботи не забудь про тренування!");
                    break;
                }
                case "середа": {
                    System.out.println("Тримайся, сьогодні здача звіту. А ввечері подзвонити тату.");
                    break;
                }
                case "четвер": {
                    System.out.println("Четвер - це маленька п'ятниця :) але ввечері тренування!");
                    break;
                }
                case "п'ятниця": {
                    System.out.println("Ммммм.... ось і ВОНА! Найкращий день тижня :) Завершити усі робочі" +
                            " питання.");
                    break;
                }
                case "субота": {
                    System.out.println("Прибирання, магазини, приготування...");
                    break;
                }
                case "неділя": {
                    System.out.println("А тут вільна програма :) чудової неділі!");
                    break;
                }
                default: {
                    System.out.println("Некоректно введені дані :(");
                    break;
                }
            }
        }
    public static void print55el() {
        int j = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(j);
            j = j + 2;
        }
    }
    public static void printfrom90() {
        int j=90;
        do {
            System.out.println(j);
            j = j-5;
        } while (j>=0);
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
    public static void compare10() {
        System.out.println("Порівняємо 2 числа і визначимо, яке з них ближче до 10.");
        System.out.println("Введіть число 1: ");
        double a1 = getNumber();
        System.out.println("Введіть число 2: ");
        double a2 = getNumber();
        if (a1 == a2) {
            System.out.println("Немає розв'язку, бо числа рівні.");
        } else if (a1 == 10 || a2 == 10) {
            System.out.println("Немає розв'язку, бо одне з чисел і є 10.");
        } else if (a1 == 10 && a2 == 10) {
            System.out.println("Немає розв'язку, бо обидва числа і є 10.");
        } else {
            if (a1 > 10 && a2 > 10) {
                if ((a1 - 10) > (a2 - 10)) {
                    System.out.println("Число " + a2 + " ближче до 10, ніж " + a1);
                } else if ((a1 - 10) < (a2 - 10)) {
                    System.out.println("Число " + a1 + " ближче до 10, ніж " + a2);
                }
            } else if (a1 < 10 && a2 < 10) {
                if ((10 - a1) > (10 - a2)) {
                    System.out.println("Число " + a2 + " ближче до 10, ніж " + a1);
                } else if ((10 - a1) < (10 - a2)) {
                    System.out.println("Число " + a1 + " ближче до 10, ніж " + a2);
                }
            } else {
                if (Math.abs(a1 - 10) > Math.abs(a2 - 10)) {
                    System.out.println("Число " + a2 + " ближче до 10, ніж " + a1);
                } else {
                    System.out.println("Число " + a1 + " ближче до 10, ніж " + a2);
                }
            }
        }
    }
}


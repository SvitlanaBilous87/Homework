package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ЗАВДАННЯ №2");
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
}

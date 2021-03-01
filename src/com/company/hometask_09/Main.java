package com.company.hometask_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the month: ");
        String someMonth = scan.nextLine();
        if (Month.checkMonth(someMonth)){
            Month month1 = Month.valueOf(someMonth.toUpperCase());
            Month.checkSeason(month1);
            Month.checkDays(month1);
            Month.closeSeason(month1);
            Month.evenOrOddCheckDays(month1);
        }

    }
}
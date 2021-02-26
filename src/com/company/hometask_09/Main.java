package com.company.hometask_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the month: ");
        String someMonth = scan.nextLine();
        boolean b = true;
        while (b) {
            for (Month month1 : Month.values()) {
                if (someMonth.equalsIgnoreCase(month1.name())) {
                    System.out.println("Such month exists! It is in " +
                            month1.getSeason().name() + ". Also " + month1.getSeason().name() +
                            "'s months are:");
                    for (Month month2 : Month.values()) {
                        if (month2.getSeason().equals(month1.getSeason()) && month2 != month1) {
                            System.out.println(month2.name());
                        }
                    }
                    if (month1 == Month.FEBRUARY) {
                        System.out.println(month1.name() + " consists of " + month1.getDays() +
                                " days.There is no month with the same number of days.");
                    } else {
                        System.out.println(month1.name() + " consists of " + month1.getDays() + " days. Same number of days also have:");
                        for (Month month2 : Month.values()) {
                            if (month2.getDays() == month1.getDays() && month2 != month1) {
                                System.out.println(month2.name());
                            }
                        }
                    }
                    if (month1 == Month.FEBRUARY) {
                        System.out.println(month1.name() + " has the least number of days.");
                    } else {
                        System.out.println("Months with lower number of days:");
                        for (Month month2 : Month.values()) {
                            if (month2.getDays() < month1.getDays()) {
                                System.out.println(month2.name());
                            }
                        }
                    }
                    if (month1.getDays() == 31) {
                        System.out.println(month1.name() + " has the highest number of days.");
                    } else {
                        System.out.println("Months with higher number of days:");
                        for (Month month2 : Month.values()) {
                            if (month2.getDays() > month1.getDays()) {
                                System.out.println(month2.name());
                            }
                        }
                    }
                    Season[] seasons = Season.values();

                    if (month1.getSeason().ordinal() == (seasons.length - 1)) {
                        System.out.println("Next season is " + seasons[0].name() + ".");
                    } else {
                        System.out.println("Next season is " + seasons[month1.getSeason().ordinal() + 1].name() + ".");
                    }
                    if (month1.getSeason().ordinal() == 0) {
                        System.out.println("Previous season is " + seasons[seasons.length - 1].name() + ".");
                    } else {
                        System.out.println("Previous season is " + seasons[month1.getSeason().ordinal() - 1].name() + ".");
                    }
                    b = false;
                }
            }
            if (b) {
                System.out.println("Such month doesn't exist ((");
                b = false;
            }
        }
        System.out.println("Months with even number of days: ");
        for (Month month : Month.values()) {
            if (month.getDays() % 2 == 0) {
                System.out.println(month.name());
            }
        }
        System.out.println("Months with odd number of days: ");
        for (Month month : Month.values()) {
            if (month.getDays() % 2 != 0) {
                System.out.println(month.name());
            }
        }
        for (Month month : Month.values()) {
            if (someMonth.equalsIgnoreCase(month.name())){
                if (month.getDays() % 2 == 0) {
                    System.out.println(month.name()+" has even number of days.");
                }
                else {
                    System.out.println(month.name()+" has odd number of days.");
                }
            }
        }
    }
}
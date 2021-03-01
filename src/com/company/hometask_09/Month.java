package com.company.hometask_09;

public enum Month {
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER);
    private int days;
    private Season season;

    Month(int days, Season season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    public static boolean checkMonth(String someText) {
        boolean b = true;
        for (Month month1 : Month.values()) {
            if (someText.equalsIgnoreCase(month1.name())) {
                b = false;
                break;
            }
            }
        if (!b) {
            System.out.println("Such month exists!");
            return true;
            }
        else {
            System.out.println("Such month doesn't exist ((");
            return false;
        }
    }
        public static void checkSeason(Month someMonth) {
            System.out.println("It is in " + someMonth.getSeason().name() + ". Also " +
                    someMonth.getSeason().name() + "'s months are:");
            for (Month month1 : Month.values()) {
                if (month1.getSeason().equals(someMonth.getSeason()) && month1 != someMonth) {
                    System.out.println(month1.name());
                }
            }
        }
        public static void checkDays(Month someMonth) {
            if (someMonth == Month.FEBRUARY) {
                System.out.println(someMonth.name() + " consists of " + someMonth.getDays() +
                        " days.There is no month with the same number of days.");
            } else {
                System.out.println(someMonth.name() + " consists of " + someMonth.getDays() + " days. Same number of days also have:");
                for (Month month1 : Month.values()) {
                    if (month1.getDays() == someMonth.getDays() && month1 != someMonth) {
                        System.out.println(month1.name());
                    }
                }
            }
            if (someMonth == Month.FEBRUARY) {
                System.out.println(someMonth.name() + " has the least number of days.");
            } else {
                System.out.println("Months with lower number of days:");
                for (Month month1 : Month.values()) {
                    if (month1.getDays() < someMonth.getDays()) {
                        System.out.println(month1.name());
                    }
                }
            }
            if (someMonth.getDays() == 31) {
                System.out.println(someMonth.name() + " has the highest number of days.");
            } else {
                System.out.println("Months with higher number of days:");
                for (Month month1 : Month.values()) {
                    if (month1.getDays() > someMonth.getDays()) {
                        System.out.println(month1.name());
                    }
                }
            }
        }
        public static void closeSeason(Month someMonth){
                Season[] seasons = Season.values();
                if (someMonth.getSeason().ordinal() == (seasons.length - 1)) {
                    System.out.println("Next season is " + seasons[0].name() + ".");
                } else {
                    System.out.println("Next season is " + seasons[someMonth.getSeason().ordinal() + 1].name() + ".");
                }
                if (someMonth.getSeason().ordinal() == 0) {
                    System.out.println("Previous season is " + seasons[seasons.length - 1].name() + ".");
                } else {
                    System.out.println("Previous season is " + seasons[someMonth.getSeason().ordinal() - 1].name() + ".");
                }
            }
    public static void evenOrOddCheckDays(Month someMonth){
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
            if (someMonth.getDays() % 2 == 0) {
                System.out.println(someMonth.name()+" has even number of days.");
            }
            else {
                System.out.println(someMonth.name()+" has odd number of days.");
            }
        }
    }

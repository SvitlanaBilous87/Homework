package com.company.core_task;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        Scanner scan = new Scanner(System.in);

        try {
            List<Device> devices = Methods.devicesFromFile(currentDir + "\\src\\com\\company\\Core_task\\Devices.txt");

            Methods.printMenu();

            do {
                if (scan.hasNextInt()) {
                    int act = scan.nextInt();

                    switch (act) {
                        case 1 -> {devices.forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 2 -> System.out.println(Methods.findBySerialNumber(devices)
                                    +"\nNext action? If you want to print menu again press 7");

                        case 3 -> {Methods.sortByBrand(devices).forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 4 -> {Methods.higherPrice(devices, 400).forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 5 -> {Methods.serialContainAndLowerPrice(devices, "0", 800)
                                .forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 6 -> System.out.println(Methods.maxPrice(devices)
                                + "\nNext action? If you want to print menu again press 7");

                        case 7 -> Methods.printMenu();

                        case 8 -> System.exit(0);

                        default -> System.out.println("Sorry, there is no such option. Try again. " +
                                "If you want to print menu again press 7");
                    }
                } else {
                    throw new InputMismatchException("Incorrect input.");
                }
            } while (true);
        } catch(IOException | InputMismatchException | MyException e){
            System.out.println(e.getMessage());
        }
    }
}
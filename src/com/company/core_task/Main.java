package com.company.core_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");

        try {
            List<Device> devices = devicesFromFile(currentDir + "\\src\\com\\company\\Core_task\\Devices.txt");
            Scanner scan = new Scanner(System.in);
            printMenu();

            do {
                if (scan.hasNextInt()) {
                    int act = scan.nextInt();

                    switch (act) {

                        case 1 -> {devices.forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 2 -> {deviceBySerialNumber(devices);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 3 -> {devices.stream()
                                .sorted(Comparator.comparing(Device::getBrand))
                                .forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 4 -> {devices.stream()
                                .filter(d -> d.getPrice() > 400)
                                .forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 5 -> {devices.stream()
                                .filter(d -> d.getSerialNumber().toString().contains("0") && d.getPrice() < 800)
                                .forEach(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 6 -> {devices.stream()
                                .max(Comparator.comparing(Device::getPrice))
                                .ifPresent(System.out::println);
                            System.out.println("\nNext action? If you want to print menu again press 7");}

                        case 7 -> printMenu();

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

    public static List<Device> devicesFromFile(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .map(data -> data.split(","))
                .map(elem -> new Device(Long.parseLong(elem[0].trim()), elem[1].trim(), elem[2].trim()
                        , Integer.parseInt(elem[3].trim())))
                .collect(Collectors.toList());
    }

    public static void printMenu() {
        System.out.println("""
                Choose an action:
                1 - print all devices with their properties
                2 - find device with it's serial number
                3 - print devices sorted by brand names
                4 - print devices with prices higher than 400
                5 - print devices with serial numbers contains 0(ZERO) and prices lower than 800
                6 - print the most expensive device
                7 - print menu
                8 - exit""");
    }

    public static void deviceBySerialNumber(List<Device> devices) throws InputMismatchException, MyException{
        System.out.println("Enter serial number of device:");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextLong()) {
            Long serialNumber = scan.nextLong();
            System.out.println(devices.stream()
                    .filter(d -> d.getSerialNumber().equals(serialNumber))
                    .findAny()
                    .orElseThrow(() -> new MyException("Device with serial number " + serialNumber + " was not found.")));
        }
        else {
            throw new InputMismatchException("Incorrect format of serial number.");
        }
    }
}
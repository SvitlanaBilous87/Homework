package com.company.core_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Methods {

    // метод для створення ліста об'єктів Device поля якого зчитуються з файлу
    public static List<Device> devicesFromFile(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .map(data -> data.split(","))
                .map(elem -> new Device(Long.parseLong(elem[0].trim()), elem[1].trim(), elem[2].trim()
                        , Integer.parseInt(elem[3].trim())))
                .collect(Collectors.toList());
    }

    // метод для друку меню
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

    // метод для пошуку Device по серійному номеру
    public static Device findBySerialNumber(List<Device> devices) throws MyException{
        System.out.println("Enter serial number of device:");
        Scanner scan = new Scanner(System.in);
        String serialNumber = scan.next();

            return devices.stream()
                    .filter(d -> d.getSerialNumber().toString().equals(serialNumber))
                    .findAny()
                    .orElseThrow(() -> new MyException("Device with serial number " + serialNumber + " was not found."));
    }

    // метод для сортування списку по бренду
    public static List<Device> sortByBrand (List<Device> devices) {
       return devices.stream()
                .sorted(Comparator.comparing(Device::getBrand))
                .collect(Collectors.toList());
    }

    // метод для пошуку девайсів дорожчих за задану ціну
    public static List<Device> higherPrice (List<Device> devices, int price){
        return devices.stream()
                .filter(d -> d.getPrice() > price)
                .collect(Collectors.toList());
    }

    // метод для пошуку девайсів в серійному номері яких є заданий символ або число і які дорожчі за задану ціну
    public static List<Device> serialContainAndLowerPrice (List<Device> devices, String s, int price) {
        return devices.stream()
                .filter(d -> d.getSerialNumber().toString().contains(s) && d.getPrice() < price)
                .collect(Collectors.toList());
    }

    // метод для пошуку найдорожчого Device
    public static Device maxPrice (List<Device> devices) throws MyException{
        return devices.stream()
                .max(Comparator.comparing(Device::getPrice))
                .orElseThrow(NullPointerException::new);
    }
}

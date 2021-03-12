package com.company.hometask_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        List<Commodity> commodities = new ArrayList<>();
        commodities.add(new Commodity("TV", 80, 50, 10.0));
        commodities.add(new Commodity("Refrigerator", 50, 150, 50.0));
        commodities.add(new Commodity("Phone", 6, 10, 0.1));
        commodities.add(new Commodity("Microwave owen", 60, 40, 15.0));

        Scanner scan = new Scanner(System.in);

        for (Commodity commodity : commodities) {
            System.out.println((commodities.indexOf(commodity) + 1) + " - " + commodity);
        }

        System.out.println("Choose what do you want to do with list:\n1 - add an item\n2 - delete an item" +
                "\n3 - replace an item");

        if (scan.hasNextInt()) {
            int act = scan.nextInt();

            if (act>0 && act <= 3) {

                switch (act) {
                    case 1:
                        Commodity commodity = new Commodity();
                        if (commodity.getLength() != null && commodity.getWidth() != null && commodity.getWeight() != null) {
                            commodities.add(commodity);
                        } else {
                            System.out.println("You can't add this commodity.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter number of commodity you want to delete:");
                        commodities.remove(scan.nextInt() - 1);
                        break;
                    case 3:
                        System.out.println("Enter number of commodity you want to replace:");
                        int i = scan.nextInt();
                        System.out.println("And parameters of new commodity:");
                        Commodity commodity1 = new Commodity();
                        if (commodity1.getLength() != null && commodity1.getWidth() != null && commodity1.getWeight() != null) {
                            commodities.set((i - 1), commodity1);
                        }
                        else{
                            System.out.println("You can't replace with this commodity.");
                        }
                }
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }

        System.out.println("Choose how do you want to sort commodities:" +
                "\n1 - by name\n2 - by length\n3 - by width\n4 - by weight");

        if (scan.hasNextInt()) {
            int sortBy = scan.nextInt();

            if (sortBy>0 && sortBy<=4) {

                switch (sortBy) {
                    case 1:
                        Collections.sort(commodities, new CommodityNameComparator());
                        break;
                    case 2:
                        Collections.sort(commodities, new CommodityLengthComparator());
                        break;
                    case 3:
                        Collections.sort(commodities, new CommodityWidthComparator());
                        break;
                    case 4:
                        Collections.sort(commodities, new CommodityWeightComparator());
                        break;
                }
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }

        for (Commodity commodity : commodities) {
            System.out.println((commodities.indexOf(commodity) + 1) + " - " + commodity);
        }

        System.out.println("Enter number of commodity:");

        if (scan.hasNextInt()) {
            int i = scan.nextInt();

            if (i > 0 && i <= commodities.size()) {
                System.out.println((i) + " - " + commodities.get(i - 1));
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }
}
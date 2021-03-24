package com.company.hometask_19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyEntry<String, Integer> myEntry = new MyEntry<>();
        Map<String, Integer> map = new LinkedHashMap<>();

        // додавання нових об'єктів
        myEntry.addNewElement(map, new MyEntry<>("account1", 567));
        myEntry.addNewElement(map, new MyEntry<>("account2", 98));
        myEntry.addNewElement(map, new MyEntry<>("account3", 1));
        myEntry.addNewElement(map, new MyEntry<>("account4", 333));
        System.out.println("Enter new user's account and password: ");
        myEntry.addNewElement(map, new MyEntry<>(scan.next(), scan.nextInt()));

        // виведення ключів
        myEntry.printUserAccounts(map);

        // виведення значень
        myEntry.printUserPasswords(map);

        // виведення всієї мапи
        myEntry.printAllElements(map);

        // видалення об'єкту за ключем
        System.out.println("Enter user's account that will be deleted: ");
        myEntry.removeElementByKey(map, scan.next());

        // видалення об'єкту за значенням
        System.out.println("Enter password of account that will be deleted: ");
        myEntry.removeElementByValue(map, scan.nextInt());

        System.out.println("Let's see what elements are left:");
        myEntry.printAllElements(map);
    }
}

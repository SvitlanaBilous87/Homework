package com.company.hometask_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        List <String> words = fillList();

        try {
            if (words.isEmpty()){
                throw new NullPointerException("Your list is empty.");
            }

            printAll(words);
            printAllStartWithS(words);
            printAllLonger5(words);
            checkFor5(words);
        }

        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Thanks for attention.");
        }
    }

    private static List<String> fillList(){
        List <String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean a = true;

        while (a){
            System.out.println("Enter some word: ");
            String word = scan.next();

            if (word.equalsIgnoreCase("break")) {
                a=false;
            }

            else {
                words.add(word);
            }
        }

        return words;
    }

    private static void printAll(List<String> list) {
        System.out.println("You've entered: ");

        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void printAllStartWithS(List<String> list) {
        int i = 0;
        System.out.println("Words starting with 's': ");

        for (String str : list) {

            if (str.toLowerCase().startsWith("s")) {
                System.out.print(str + " ");
                i++;
            }
        }

        if (i==0){
            System.out.println("None.");
        }

        else {
            System.out.println();
        }
    }

    private static void printAllLonger5(List<String> list) {
        int i = 0;
        System.out.println("Words containing more than 5 letters: ");

        for (String str : list) {

            if (str.length()>5) {
                System.out.print(str + " ");
                i++;
            }
        }

        if (i==0){
            System.out.println("None.");
        }

        else {
            System.out.println();
        }
    }

    private static void checkFor5(List<String> list) {

        if (list.size() <= 5) {
            System.out.println("You've entered only " + list.size() + " words. So we have nothing to delete.");
        }

        else {
            list.removeAll(list.subList(5, list.size()));
            System.out.println("New list contains 5 words: ");

            for (String str : list) {
                System.out.print(str + " ");
            }

            System.out.println();
        }
    }

}

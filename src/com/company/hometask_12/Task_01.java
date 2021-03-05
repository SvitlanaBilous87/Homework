package com.company.hometask_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words beginning with 'a' do you want to find?");

        try {
            if (!scan.hasNextInt()) {
                throw new IllegalArgumentException("Incorrect input. Quantity can be only " +
                        "integer number.");
            }
            else {
                int n = scan.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException("Incorrect input. Quantity can " +
                            "be only > 0");
                }
                else {

                    String[] s = fillArray(n);

                    System.out.println("Your words are: ");
                    for (String s1 : s) {
                        System.out.println(s1);
                    }
                }
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for attention :)");
        }
    }
        public static String[] fillArray (int n){
            Scanner scan = new Scanner(System.in);
            String[] s = new String[n];
            Pattern pattern = Pattern.compile("^a");
            int i = 0;

            while (i < n) {
                System.out.println("Enter some word: ");
                String word = scan.next();
                Matcher matcher = pattern.matcher(word.toLowerCase());
                if (matcher.find()) {
                    s[i] = word;
                    i++;
                }
            }
            return s;
        }
}
package com.company.hometask_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many gmail emails do you want to get?");

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

                    System.out.println("Here are your emails: ");
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
        Pattern pattern = Pattern.compile("@gmail.com$");
        int i = 0;

        while (i < n) {
            System.out.println("Enter an email: ");
            String email = scan.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                s[i] = email;
                i++;
            }
        }
        return s;
    }
}

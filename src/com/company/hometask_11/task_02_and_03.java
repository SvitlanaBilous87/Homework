package com.company.hometask_11;

import java.util.Scanner;

public class task_02_and_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of words: ");

        try {
            if (!scan.hasNextInt()) {
                throw new IllegalArgumentException("Incorrect input. Quantity can be only " +
                        "integer number.");
            }

            else{
                int n = scan.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException("Incorrect input. Quantity can " +
                            "be only > 0");
                }

                else{
                    String[] s = fillArray(n);

                    maxAndMin(s);

                    int i = 0;
                    System.out.println("Words that begin with 'a' and have even number of letters: ");
                    for (String s1 : s) {
                        if (s1.toLowerCase().startsWith("a") && (s1.length() % 2 == 0)) {
                            System.out.println(s1);
                            i++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("None. You didn't enter such words.");
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
/*
This method returns array with string values.
 */
        public static String[] fillArray (int n){
            Scanner scan = new Scanner(System.in);
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + (i + 1) + " word: ");
                s[i] = scan.next();
            }
            return s;
        }
/*
This method searches and prints longest and shortest words of array.
 */
        public static void maxAndMin (String[] s) {
        String maxWord= s[0];
        int maxWordInd=0;
        String minWord=s[0];
        int minWordInd=0;
            for (int i = 1; i < s.length; i++) {
                if (s[i].length()>maxWord.length()) {
                    maxWord = s[i];
                    maxWordInd = i;
                }
                else if (s[i].length()<minWord.length()){
                    minWord= s[i];
                    minWordInd=i;
                }
                }
            System.out.println("Longest word is "+maxWord+" its number is "+(maxWordInd+1)+".\n"+
                    "Shortest word is "+minWord+" its number is "+(minWordInd+1)+".");
            }

}



package com.company.hometask_11;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
    String[] s = fillArray();
    maxAndMin(s);
    }
        public static String[] fillArray () {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter quantity of words: ");
            int n = scan.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + (i + 1) + " word:");
                s[i] = scan.next();
            }
            return s;
        }
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

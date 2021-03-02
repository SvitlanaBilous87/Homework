package com.company.hometask_11;

import static com.company.hometask_11.task_02.fillArray;

public class task_03 {
    public static void main(String[] args) {

        String[] s = fillArray();

        System.out.println("Words that begin with 'a' and have even number of letters: ");

        for (String s1:s) {
            if ((s1.toLowerCase().startsWith("a")) && (s1.length()%2 == 0)){
                System.out.println(s1);
            }
        }

    }
}

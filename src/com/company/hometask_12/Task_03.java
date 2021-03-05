package com.company.hometask_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_03 {

    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.find());
        System.out.println(matcher.replaceFirst("C#"));
        System.out.println(matcher.replaceAll("C#"));
    }
}

package com.company.hometask_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_additional {
    public static void main(String[] args) {

        String str = "I love Java more than my friend. Java is so beautiful. I'm using jdk 1.8," +
                " because jdk11 and jdk15 make some troubles on my laptop.";
        Pattern pattern = Pattern.compile("jdk[\\s]*[\\S]*");
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.replaceAll("[removed]"));
    }
}
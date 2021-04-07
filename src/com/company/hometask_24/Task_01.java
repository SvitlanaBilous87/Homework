package com.company.hometask_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_01 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        // Повертаєм кількість входжень об'єкта "One"
        long count = list.stream()
                .filter(str -> str.equals("One"))
                .count();
        System.out.println(count);

        // Повертаєм перший елемент колекції або 0, якщо колекція порожня
        String firstElement = list.stream()
                .findFirst()
                .orElse("0");
        System.out.println(firstElement);

        // Повертаєм останній елемент колекції або "empty", якщо колекція порожня
        String lastElement2 = list.stream()
                .skip(list.size()-1)
                .findFirst()
                .orElse("Empty");
        System.out.println(lastElement2);
        list.stream()
                .reduce((a1, a2) -> a2) // останній елемент ще можна дістати цим способом
                .orElse("Empty");

        // Знаходимо елемент в колекції рівний «Three» або кидаєм помилку
        try {
            String isThree = list.stream()
                    .filter(str -> str.equals("Three"))
                    .findAny()
                    .orElseThrow(() -> new NullPointerException("No such element."));
            System.out.println(isThree);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Повертаєм третій елемент колекції по порядку або кидаєм помилку
        try {
            String thirdElement = list.stream()
                    .skip(2)
                    .findFirst()
                    .orElseThrow(() -> new NullPointerException("No such element."));
            System.out.println(thirdElement);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Повертаєм два елементи починаючи з другого або кидаєм помилку
        try{
            String twoElements = list.stream()
                    .limit(3)
                    .skip(1)
                    .reduce((a1, a2) -> a1 + " " + a2)
                    .orElseThrow(() -> new NullPointerException("No such element."));
            System.out.println(twoElements);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Вибираєм всі елементи в яких є більше ніж 3 букви у слові
        List<String> moreThanThree = list.stream()
                .filter(str -> str.length()>3)
                .collect(Collectors.toList());
        moreThanThree.forEach(str -> System.out.print(str+" "));
        System.out.println("");

        // Повертаєм колекцію без дублікатів
        List<String> uniqueElements = list.stream()
                .distinct()
                .collect(Collectors.toList());
        uniqueElements.forEach(str -> System.out.print(str+" "));

        // Шукаємо чи є хоч один "One" елемент в колекції
        System.out.println("\n"+list.stream()
                .anyMatch(str ->str.equals("One")));

        // Шукаємо чи є символ «o» у всіх елементів колекції
        System.out.println(list.stream()
                .allMatch(str ->str.contains("o")));

        // Додємо "_1" до кожного елементу колекції
        list.stream()
                .map(str -> str+"_1")
                .forEach(str -> System.out.print(str+" "));
        System.out.println("");

        // Сортуємо колекцію рядків за алфавітом і прибираєм дублікати
        list.stream()
                .sorted()
                .distinct()
                .forEach(str -> System.out.print(str+" "));
    }
}

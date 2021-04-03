package com.company.hometask_23.optional_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 18));
        people.add(new Person("Tom", 20));
        people.add(new Person(null, 11));
        people.add(new Person("Kate", 33));
        people.add(new Person("Nadya", null));
        people.add(new Person(null, null));
        people.add(null);
        System.out.println(people);
        List<Person> peopleNotNull = new ArrayList<>();

        people.forEach(person -> {
            Optional<Person> optionalPerson = Optional.ofNullable(person);

            // Виводимо імена персон з ліста. Якщо ім'я є null, то використовуємо дефолтне значення 'Joe'
            System.out.print(optionalPerson.map(name -> optionalPerson.get().getName()).orElse("Joe")+" ");

            // Зберігаємо не null об'єкти персон в новий ліст, замість null-об'єктів створюємо нову персону 'Joe'
            peopleNotNull.add(checkName(optionalPerson).orElse(new Person("Joe")));
        });
        System.out.println("\n"+peopleNotNull);
    }

    // метод для перевірки імені optionalPerson, якщо значення - null замінюємо на дефолтне значення 'Joe'
    public static Optional<Person> checkName(Optional<Person> optionalPerson) {
        optionalPerson.ifPresent(name -> {
            Optional<String> optionalName =
                    Optional.ofNullable(optionalPerson.get().getName());
            if (optionalName.isEmpty()) {
                optionalPerson.get().setName("Joe");
            }
        });
        return optionalPerson;
    }
}
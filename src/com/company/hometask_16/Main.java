package com.company.hometask_16;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jake", 43);
        Person p2 = new Person("Nadya", 25);
        Person p3 = new Person("Mike", 50);

        Animal dog1 = new Animal("dog", "Maori");
        Animal dog2 = new Animal("dog", "Baron");
        Animal cat1 = new Animal("cat", "Fluffy");
        Animal cat2 = new Animal("cat", "Kiss");
        Animal fish1 = new Animal("fish", "Ronaldo");
        Animal fish2 = new Animal("fish", "Shark");

        Map<Person, List<Animal>> zooClub = new HashMap<>();

        zooClub.put(p1, Arrays.asList(dog1, fish1));
        zooClub.put(p2, Arrays.asList(dog2, cat1));
        zooClub.put(p3, Arrays.asList(cat2, fish2));

        System.out.println("Zooclub consists of: ");
        printMap(zooClub);

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an action:\n" +
                "1 - add new person to zooclub\n" +
                "2 - add new animal to person\n" +
                "3 - take away an animal from person\n" +
                "4 - exclude person from zooclub\n" +
                "5 - print entire zooclub\n" +
                "6 - exit");

        do {
                int act = scan.nextInt();
                if (act >= 1 && act <= 6) {

                    switch (act) {
                        case 1:
                            zooClub.put(new Person(), new ArrayList<>());
                            System.out.println("Choose next action:");
                            break;
                        case 2:
                            addNewAnimalToPerson(zooClub);
                            System.out.println("Choose next action:");
                            break;
                        case 3:
                            removeAnimalFromPerson(zooClub);
                            System.out.println("Choose next action:");
                            break;
                        case 4:
                            removePerson(zooClub);
                            System.out.println("Choose next action:");
                            break;
                        case 5:
                            printMap(zooClub);
                            System.out.println("Choose next action:");
                            break;
                        case 6:
                            System.exit(0);
                    }

                } else {
                    System.out.println("Incorrect choice. Try again.");
                }
            } while (true);
        }

    private static Person checkPerson(Map<Person, List<Animal>> zooClub){

        Person person = new Person();

        if (!zooClub.containsKey(person)){
            System.out.println("There is no such member in zooclub.");
        }
        return person;
    }

    private static Map<Person, List<Animal>> addNewAnimalToPerson(Map<Person, List<Animal>> zooClub){

        Person person = checkPerson(zooClub);

        if (zooClub.containsKey(person)){
            List<Animal> animals = new ArrayList<>(zooClub.get(person));
            animals.add(new Animal());
            zooClub.put(person, animals);
        }
        return zooClub;
    }

    private static Map<Person, List<Animal>> removeAnimalFromPerson(Map<Person, List<Animal>> zooClub){

        Person person = checkPerson(zooClub);

        if (zooClub.containsKey(person)){
            List<Animal> animals = new ArrayList<>(zooClub.get(person));
            System.out.println("Enter number of animal that should be taken away from "+person.getName()+":");

            for (Animal animal : animals) {
                System.out.println((animals.indexOf(animal) + 1) + " - " + animal);
            }

            Scanner scan = new Scanner(System.in);
            boolean a = true;

            while (a){
                int i = scan.nextInt();

                if (i <= 0 || i > animals.size()){
                System.out.println("Incorrect input. Try again:");
            }

                else {
                    animals.remove(i-1);
                    zooClub.put(person, animals);
                a = false;
                }
            }
        }
        return zooClub;
    }

    private static Map<Person, List<Animal>> removePerson(Map<Person, List<Animal>> zooClub){

        Person person = checkPerson(zooClub);

        if (zooClub.containsKey(person)){
            zooClub.remove(person);
        }
        return zooClub;
    }

    private static void printMap(Map<Person, List<Animal>> zooClub) {
        for (Map.Entry<Person, List<Animal>> member : zooClub.entrySet()) {
            System.out.println(member.getKey() + " has = " + member.getValue());
        }
    }
}

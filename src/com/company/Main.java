package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Adress adress1 = new Adress("London", "Baker.st", 10);
        Adress adress2 = new Adress("London", "Baker.st", 11);
        Adress adress3 = new Adress("London", "Baker.st", 12);

        Person person1 = new Person("James", "Bond", adress1);
        Person person2 = new Person("Sherlock ", "Holmes", adress1);
        Person person3 = new Person("Hans", "Landa", adress2);
        Person person4 = new Person(null, "Zero", adress2);
        Person person5 = new Person("Phantom", null, adress3);
        Person person6 = new Person("Paulo", "Di Canio", null);

        List<Person> list1 = new ArrayList<Person>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);
        list1.add(person6);



        List<String> modified = list1
                .stream()
                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAdress() != null)
                .sorted(Comparator.comparingInt(x -> x.getAdress().getHouseNumber()))
                .map(Person::toString)
                .collect(Collectors.toList());
        modified.forEach(System.out::println);

    }
}

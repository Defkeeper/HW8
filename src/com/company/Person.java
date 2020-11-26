package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private Adress adress;

    public Person(String firstName, String lastName, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adres='" + adress + '\'' +
                '}';
    }
}

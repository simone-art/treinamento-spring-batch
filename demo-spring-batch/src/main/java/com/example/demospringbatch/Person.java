package com.example.demospringbatch;

public class Person {
    private String firstName;
    private String lastName;

    //Constructor vazio
    public Person() {
    }

    //Constructor com todos os parámetros
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [Name=" + firstName + ", lastName=" + lastName +"]";
    }

}

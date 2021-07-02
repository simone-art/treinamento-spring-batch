package com.example.demospringbatch;

public class Person {
    private String name;
    private String lastName;

    //Constructor vazio
    public Person() {
    }

    //Constructor com todos os parámetros
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", lastName=" + lastName +"]";
    }

}

package com.kitcenter.app.classwork.lesson12;

public class Person {
    protected String name;
    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void welcomePerson () {
        System.out.println("Hello, "+name);
    }
    public final void printName () {
        System.out.println(this.name);
    }
}

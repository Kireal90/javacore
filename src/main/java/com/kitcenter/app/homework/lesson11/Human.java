package com.kitcenter.app.homework.lesson11;

public class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1 && age <120) {
            this.age = age;
            System.out.println("New age setted");
        } else {
            System.out.println("Age invalid");
        }
    }

    public String getName() {
        return name;
    }
    public Human (int age, String name) {

    }
}

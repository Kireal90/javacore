package com.kitcenter.app.classwork.lesson12;

public class Student extends Person {
    private String name;
    private int age;
    private String university;

    public void setAge (int age) {
        this.age = age;
    }
    public int getAge (){
        return age;
    }

    public Student (String name, String university) {
        super(name);
        this.university = university;
    }
}

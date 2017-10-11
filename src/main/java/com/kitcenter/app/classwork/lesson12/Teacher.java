package com.kitcenter.app.classwork.lesson12;

public class Teacher extends Person {

    public Teacher (String name) {
        super(name);
        printName();
    }
    public final String getTeacherName () {
        System.out.println(this.name);
        return this.name;
    }

}

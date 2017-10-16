package com.kitcenter.app.classwork.lesson13;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "Do not forget to make a homework";
    }
    @Override
    public String getGreetings (String greets) {
        return "Good morning "+greets;
    }
    @Override
    public void methodAbs() {
        System.out.println("this teacher's method was abstract");
    }
}

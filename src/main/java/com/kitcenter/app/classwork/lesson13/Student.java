package com.kitcenter.app.classwork.lesson13;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void show(){
    }

    @Override
    public String getResponse(String question) {
        return "Eh, What is a question";
    }

    @Override
    public String toString() {
        return "Student " + "name=" + name;
    }
    @Override
    public String getGreetings (String greets) {
        return "Hi "+greets;
    }
    @Override
    public void methodAbs() {
        System.out.println("this student's method was abstract");
    }
}

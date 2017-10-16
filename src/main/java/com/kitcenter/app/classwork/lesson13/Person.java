package com.kitcenter.app.classwork.lesson13;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }
    public String getGreetings (String greet) {
        return "Hello "+greet;
    }
    public abstract void  methodAbs ();

}

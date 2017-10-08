package com.kitcenter.app.classwork.lesson10;


public class Lesson10 {
    public String getFilePath (String name) {
        return getClass().getClassLoader().getResource(name).getPath();
    }
}
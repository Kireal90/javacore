package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.Mentor;

public class ClassworkLesson14TeacherRunner {
    public static void main(String[] args) {
    Mentor ment = new Mentor();
    Mentor ment1 = new Mentor();
        System.out.println(ment.equals(ment1));
        System.out.println(ment.hashCode() == ment1.hashCode());
    }
}

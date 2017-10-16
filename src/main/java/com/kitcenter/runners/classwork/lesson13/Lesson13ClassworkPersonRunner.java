package com.kitcenter.runners.classwork.lesson13;

import com.kitcenter.app.classwork.lesson13.Person;
import com.kitcenter.app.classwork.lesson13.Student;
import com.kitcenter.app.classwork.lesson13.Teacher;

public class Lesson13ClassworkPersonRunner {
    public static void main(String[] args) {
        Person student = new Student("Sergii");

        Person teacher = new Teacher("Teacher");


        response(student, "student", "pal");
        response(teacher, "teacher", "mister");

    }

    public static void response ( Person person , String questionResponse, String greet ) {
        System.out.println(person.getResponse(questionResponse));
        System.out.println(person.getGreetings(greet));
    }
}

package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.Bicycle;
import com.kitcenter.app.classwork.lesson12.Person;
import com.kitcenter.app.classwork.lesson12.Student;
import com.kitcenter.app.classwork.lesson12.Teacher;

public class Lesson12ClassworkRunner {
    public static void main(String[] args) {

        new Bicycle (5,"blue", 60, "Comanche");

        new Bicycle(6, "red", "Aist");

        Student stud = new Student("Gena", "MIT");
        stud.setName("Gennadiy");
        stud.welcomePerson();
        Teacher teacher = new Teacher("Mr.Black");
        teacher.getTeacherName();

    }
}


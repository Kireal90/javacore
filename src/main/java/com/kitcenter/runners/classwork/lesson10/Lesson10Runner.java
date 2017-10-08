package com.kitcenter.runners.classwork.lesson10;

import com.kitcenter.app.classwork.lesson10.Lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson10Runner {
    String names = "Sergii,Kate,Kostya";
    String[] splitNames = names.split(",");

    public static void main(String[] args) {
        BufferedReader reader = null;
        Lesson10 getPath = new Lesson10();
        String filePath = getPath.getFilePath("inputClasswork.txt");
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

}
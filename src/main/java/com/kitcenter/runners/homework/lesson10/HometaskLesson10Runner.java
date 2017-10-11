package com.kitcenter.runners.homework.lesson10;

import com.kitcenter.app.homework.lesson10.Lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class HometaskLesson10Runner {
    public static void main(String[] args) {
        Lesson10 les10 = new Lesson10();
        System.out.println("Choose method:\n" +
                "1: readWriteFile\n" +
                "2: readAndCheckPolin\n" +
                "3: userTypesStringToFile\n");
        Scanner chooseMethod = new Scanner(System.in);
        int methodNumber = chooseMethod.nextInt();
        try {
            switch (methodNumber) {
                case 1:
                    Lesson10.readWriteFile();
                    break;
                case 2:
                    les10.readAndCheckPolin();
                    break;
                case 3:
                    les10.userTypesStringToFIle();
                    break;
            }
        }catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
}
}
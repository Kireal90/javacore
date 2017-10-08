package com.kitcenter.app.classwork.lesson11;

import java.io.*;

public class Lesson11 {
    public static void writeToFile() {
        String firstline = "The first";
        String filename = "E:\\outputStringLesson11Classwork.txt";
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory, filename);
        BufferedWriter bf = null;
        try {
             bf = new BufferedWriter
                    (new OutputStreamWriter(new FileOutputStream("E:\\outputStringLesson11Classwork.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            bf.append(firstline);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bf.close();
        } catch (IOException e) {
        }
    }
    public static void getDir () {
        String currentDir = System.getProperty("user.dir");
        String linuxStyle = "dir/text.txt";
        String windowsStyle = "dir\\text.txt";
        File file = new File (currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());

        File file2 = new File (currentDir, windowsStyle);
        System.out.println(file2.getAbsolutePath());
    }
}
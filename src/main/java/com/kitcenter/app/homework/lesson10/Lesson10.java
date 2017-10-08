package com.kitcenter.app.homework.lesson10;


import com.kitcenter.app.classwork.lesson7.Array;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson10  {

    String [] massToWrite = new String [4];
    public static String ifIsPolinTrue (boolean isPolin) {
        if (isPolin) {
            return "Value is polindrome";
        } else {
            return "Value is NOT polindrome";
        }

    }
    public static String isPalindromBool (String stringToTest)
    {
        String polindrome = stringToTest;
        boolean isPolin = true;
        for (int i=0; i<polindrome.length()/2; i++  ) {
            isPolin = isPolin && (polindrome.charAt(i) == polindrome.charAt (polindrome.length() - i - 1));
        }
        return Lesson10.ifIsPolinTrue(isPolin);

    }
    public static void readWriteFile()
            throws  NullPointerException, IOException {
        System.out.println("Lesson10Runner");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String[] array = new String[4];
        Integer[] strr = {};
            reader = new BufferedReader(new FileReader("E:\\input.txt"));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                array[i] = line;
                i++;
            }
            String numbers = array[0];
            String[] numb = numbers.split(",");
            Integer[] intarray = new Integer[numb.length];
            int in = 0;
            for (String str : numb) {
                intarray[in] = Integer.parseInt(str);
                in++;
            }
            Arrays.sort(intarray);
            strr = intarray;
            reader.close();
        String filename = "E:\\output.txt";
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory, filename);
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
        for (int inn = 0; inn < strr.length; inn++) {
                writer.write(Integer.toString(strr[inn]));
                writer.newLine();
        }
            writer.close();
        }


    public void readAndCheckPolin()
    throws NullPointerException, IOException {
        System.out.println("Lesson10Runner");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String[] array2 = new String[4];
            reader = new BufferedReader(new FileReader("E:\\inputPolin.txt"));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                array2[i] = line;
                i++;
            }
        int index = 0;
            for (String str : array2) {

                String temp = str+" - ";
                String result = Lesson10.isPalindromBool(str);
                massToWrite[index] = (temp + result);
                index++;
            }
            String currentFile = System.getProperty("dir");
            String fileOutput = "E:\\outputHomeworkLesson10.txt";
            File fileOut = new File(currentFile, fileOutput);
            BufferedWriter bf = null;
                bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOut)));
                for (int in = 0; in < massToWrite.length; in++) {
                    bf.write( massToWrite[in]+"");
                    bf.flush();
                    bf.newLine();
                }
            bf.close();
            }


    public void userTypesStringToFIle () throws  IOException {
    String fileName = null;
        System.out.println("Enter fileName:");
    Scanner sc = new Scanner (System.in);
    fileName = sc.nextLine();
    String currentFile = System.getProperty("dir.user");
        String fileNameTask3 = "E:\\"+fileName+".txt";
        File flTask3 = new File(currentFile, fileNameTask3);
    BufferedWriter bufWr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(flTask3)));
        boolean exitWasNotEntered = true;
        System.out.println("Enter words to file and press \"Enter\"\nEnter \"exit\" to exit:");
        while (exitWasNotEntered) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                exitWasNotEntered = false;
                break;
            }
            bufWr.write(str);
            bufWr.flush();
            bufWr.newLine();
        }
        bufWr.close();
    }


}
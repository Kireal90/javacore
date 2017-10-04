package com.kitcenter.runners.homework.lesson10;

import java.io.*;
import java.util.Arrays;

public class Lesson10Runner {
    public static void main(String[] args) {
        System.out.println("Lesson10Runner");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String[] array = new String[4];
        Integer [] strr = {};
        try {
            reader = new BufferedReader(new FileReader("E:\\input.txt"));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null) {
                array[i] = line;
                i++;
            }
//            System.out.println(Arrays.toString(array));
            String numbers = array[0];
            String[]numb = numbers.split(",");
//            System.out.println(Arrays.toString(numb));
            Integer[] intarray=new Integer[numb.length];
            int in =0;
            for(String str : numb) {
                intarray[in] = Integer.parseInt(str);
                in++;
            }
                Arrays.sort(intarray);
//                System.out.println(Arrays.toString(intarray));
            strr = intarray;
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    String filename = "E:\\output.txt";
    String workingDirectory = System.getProperty("user.dir");
    File file = new File(workingDirectory, filename);
    try {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\output.txt")));
    }catch (FileNotFoundException e) {
    }
        for (int inn = 0; inn < strr.length; inn++) {
        try {
            writer.write(Integer.toString(strr[inn]));
            writer.newLine();
        }catch (IOException e) {
        }
    }
    try {
        writer.close();
    }catch (IOException e ) {
    }
}
}
package com.kitcenter.runners.classwork.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassworkLesson16ArraylistRunner {
    public static void main(String[] args) {
//        ArrayList <String> arList = new ArrayList<>();
//        arList.add("First");
//        arList.add("Second");
//        arList.add("Third");
//        int size = arList.size();
//        System.out.println(size);
//        arList.remove("Second");
//        System.out.println(arList.toString());
//        System.out.println(arList.contains("First"));
//        System.out.println(arList.indexOf("Third"));
//        System.out.println(arList.get(1));
//        System.out.println(arList.isEmpty());

        Scanner sc = new Scanner(System.in);
        boolean tr = true;
        ArrayList<String> arrList = new ArrayList<>();
        while (tr) {
            String val = sc.nextLine();
            if (val.equalsIgnoreCase("exit")) {
                tr = false;
                break;
            }
            arrList.add(val);
        }
        System.out.println(arrList.toString());
        System.out.println("exit");
    }
}
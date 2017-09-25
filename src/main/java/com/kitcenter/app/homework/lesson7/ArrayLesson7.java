package com.kitcenter.app.homework.lesson7;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayLesson7 {
    public void evenNumbersPrintGorizontally() {
        int[] mass = new int[20 / 2];
        for (int i = 0, j = 2; i < mass.length; i++, j += 2) {
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }
    }
    public void evenNumbersPrintVertically() {
        int[] mass = new int[20 / 2];
        for (int i = 0; i < mass.length; i++) {
            System.out.print("\n" + mass[i]);
        }
    }
    public void oddPrint1to99() {
        int[] mass = new int[100 / 2];
        for (int i = 0, j = 1; i < mass.length; i++, j += 2) {
            mass[i] = j;
            System.out.println(mass[i] + " ");
        }
        for (int counter = mass.length - 1; counter >= 0; counter--) {
            System.out.println(mass[counter]);
        }
    }
    public void random0to9inMass15() {
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mass));
    }
    public void random0to999inMass15() {
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            int max = mass[i];
        }
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Max number: " + max);
        int min = 999;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Min number: " + min);
    }
    public void twoDimMassWithRand() {
        int[][] mass = new int[8][5];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(89) + 10;
            }
        }
        for (int i = 0; i < mass.length; i++, System.out.println()) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
        }
    }
    public void twoDimMassRandFrom1to999() {
        int[][] mass = new int[8][5];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < mass.length; i++, System.out.println()) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
        }
    }
    public void askValuesForSum() {
        boolean exit = true;
        int[] nums = new int[10];
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите ряд чисел c вводом по одному через Enter:"+"\n"+"Ввод должен прерываться словом \"exit\"");
        while (exit) {
            try {
                for (int i = 0; i < 10; i++) {
                    String line = scannerOne.nextLine();
                    int newResult = Integer.parseInt(line);
                    nums[i]=newResult;
                }
            }
            catch (NumberFormatException e) {
                int finalResult = 0;
                for (int i=0; i<nums.length; i++){
                    int tempResult = nums[i];
                    finalResult+=tempResult;
                }
                System.out.print("result:"+finalResult);
                }
            }
    }
}


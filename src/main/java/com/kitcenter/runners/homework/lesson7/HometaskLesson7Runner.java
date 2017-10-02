package com.kitcenter.runners.homework.lesson7;

import com.kitcenter.app.homework.lesson7.ArrayLesson7;

import java.util.Scanner;


public class HometaskLesson7Runner {

    public static void main(String[] args) {
        System.out.println("1 - evenNumbersPrintHorizontally");
        System.out.println("2 - evenNumbersPrintVertically");
        System.out.println("3 - oddPrint1to99");
        System.out.println("4 - random0to9inMass15");
        System.out.println("5 - random0to999inMass15");
        System.out.println("6 - twoDimMassWithRand");
        System.out.println("7 - twoDimMassRandFrom1to999");
        System.out.println("8 - askValuesForSum");

        Scanner scannerOne = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int switchValue = scanner.nextInt();
        ArrayLesson7 arraysCreator = new ArrayLesson7();
        switch (switchValue) {
            case 1:
                System.out.println("arraysCreator.evenNumbersPrintHorizontally");
                ArrayLesson7.evenNumbersPrintHorizontally();
                break;
            case 2:
                System.out.println("arraysCreator.evenNumbersPrintVertically");
                ArrayLesson7.evenNumbersPrintVertically();
                break;
            case 3:
                System.out.println("arraysCreator.oddPrint1to99");
                ArrayLesson7.oddPrint1to99();
                break;
            case 4:
                System.out.println("random0to9inMass15");
                ArrayLesson7.random0to9inMass15();
                break;
            case 5:
                System.out.println("random0to999inMass15");
                ArrayLesson7.random0to999inMass15();
            case 6:
                System.out.println("twoDimMassWithRand");
                ArrayLesson7.twoDimMassWithRand();
            case 7:
                System.out.println("twoDimMassRandFrom1to999");
                ArrayLesson7.twoDimMassRandFrom1to999();
                break;
            case 8:
                System.out.println("askValuesForSum");
                Scanner intVal = new Scanner (System.in);
                ArrayLesson7.askValuesForSum(intVal);
        }
    }
}

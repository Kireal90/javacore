package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.HomeTask;

import java.util.Scanner;

public class HometaskLesson9Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your method:\n"+
                "case 1: \"Write a word to check if it is polindrome:\"\n"+
                "case 2: \"Enter number:\"\n"+
                "case 3: \"Check polindrome word, reading array from the beginning and from the end\"\"\n"+
                "case 4: \"Array read from beginning and comparison with word read from the end\n" +
                "case 5: \"Bollean method returns comparison by charAt method");
        int switchValue = scanner.nextInt();

        switch (switchValue) {
            case 1:
                System.out.println("Write a word to check if it is polindrome:");
                Scanner stringPolin = new Scanner (System.in);
                String scVal = stringPolin.nextLine();
                HomeTask.checkfPolindrome(scVal);
                break;
            case 2:
                System.out.println("Enter number:");
                Scanner numbPolin = new Scanner (System.in);
                int numbFromScan = numbPolin.nextInt();
                HomeTask.checkNumberPolinom(numbFromScan);
                break;
            case 3:
                System.out.println("Check polindrome word, reading array from the beginning and from the end");
                Scanner wordPolin = new Scanner(System.in);
                String userWord = wordPolin.nextLine();
                HomeTask.readMassAndCompare(userWord);
                break;
            case 4:
                System.out.println("Array read from beginning and comparison with word read from the end");
                Scanner arrayFullRead = new Scanner(System.in);
                String userWordFull = arrayFullRead.nextLine();
                HomeTask.readMassAndCompare(userWordFull);
                break;
            case 5:
                System.out.println("Bollean method returns comparison by charAt method");
                Scanner scannerBollean = new Scanner(System.in);
                String userWordCharAt = scannerBollean.nextLine();
                HomeTask.isPalindromBool(userWordCharAt);
        }
    }
}
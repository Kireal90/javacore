package com.kitcenter.runners.homework.lesson9;

import com.kitcenter.app.homework.lesson9.HomeTask;
import com.kitcenter.app.homework.lesson9.Task;

import java.util.Scanner;

public class HometaskLesson9Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your method:\n" +
                "case ONE: \"Write a word to check if it is polindrome:\"\n" +
                "case TWO: \"Enter number:\"\n" +
                "case THREE: \"Check polindrome word, reading array from the beginning and from the end\"\"\n" +
                "case FOUR: \"Array read from beginning and comparison with word read from the end\n" +
                "case FIVE: \"Bollean method returns comparison by charAt method");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        Task task = Task.valueOf(str);

        switch (task) {
            case ONE:
                System.out.println("Write a word to check if it is polindrome:");
                Scanner stringPolin = new Scanner(System.in);
                String scVal = stringPolin.nextLine();
                HomeTask.checkfPolindrome(scVal);
                break;
            case TWO:
                System.out.println("Enter number:");
                Scanner numbPolin = new Scanner(System.in);
                int numbFromScan = numbPolin.nextInt();
                HomeTask.checkNumberPolinom(numbFromScan);
                break;
            case THREE:
                System.out.println("Check polindrome word, reading array from the beginning and from the end");
                Scanner wordPolin = new Scanner(System.in);
                String userWord = wordPolin.nextLine();
                HomeTask.readMassAndCompare(userWord);
                break;
            case FOUR:
                System.out.println("Array read from beginning and comparison with word read from the end");
                Scanner arrayFullRead = new Scanner(System.in);
                String userWordFull = arrayFullRead.nextLine();
                HomeTask.readMassAndCompare(userWordFull);
                break;
            case FIVE:
                System.out.println("Boolean method returns comparison by charAt method");
                Scanner scannerBollean = new Scanner(System.in);
                String userWordCharAt = scannerBollean.nextLine();
                HomeTask.isPalindromBool(userWordCharAt);
                break;
        }
    }
}
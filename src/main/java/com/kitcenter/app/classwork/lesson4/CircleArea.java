package com.kitcenter.app.classwork.lesson4;


import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;
    private double radius;

    public static void evenOrOdd () {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value%2==0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void calculate(){
        System.out.println("Enter r1: ");
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();

        double circleAreaOne;
        circleAreaOne = 3.14*r1*r1;
        System.out.println("Enter r2: ");
        Scanner scanner2 = new Scanner(System.in);
        double r2 = scanner2.nextDouble();

        double circleAreaTwo;
        circleAreaTwo = 3.14*r2*r2;
        if ((r1 > r2) || (circleAreaOne > circleAreaTwo)){
            System.out.print("Area1 is bigger");
            System.out.print("Area2 is smaller");
        } else {
            System.out.print("Area2 is bigger");
            System.out.print("Area1 is smaller");
        }
        }
    }


package com.kitcenter.app.classwork.lesson7;

import java.util.Scanner;

public class Loop {


    public void findEven() {
        int counter = 0;
        for (int i = 1; i<=20; i++) {
            if (i%2==0) {
                counter++;
                System.out.println("even numbers: "+ counter);
            }
        }
    }

    public void printA (){
        int a = 1;
        System.out.println("Original a value" + a);
        System.out.println("Post-increment" + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a" + ++a);
        System.out.println("After pre-increment" + a);
    }

    public void printFrom0to10 () {
        for (int i =0; i<11; i++ ) {
            System.out.println(i);
        }
    }


    public  void checkAwithBDecreaseAtoB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        while (a > b) {
            System.out.println("a:"+a+" b:"+b);
            a = a - 1;
        }
        System.out.println("a:"+a+" b:"+b);
    }

}
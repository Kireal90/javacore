package com.kitcenter.app.utils.convertors;
import java.util.Scanner;
public class PrimitiveConvertor {
    float floatValue = 0.0f;
    int integerValue = 0;
    char charValue = '\u0000';
    public void floatToChar  (){
        System.out.println("введите входящее значение типа float:");
        Scanner scanner = new Scanner(System.in);
        floatValue = scanner.nextFloat();
        charValue = (char) floatValue;
        System.out.println("Input float value is : " + floatValue +  " Output char value is " + charValue );
    }
    public void intToChar(){
        System.out.println("введите входящее значение типа int:");
        Scanner scanner = new Scanner(System.in);
        integerValue = scanner.nextInt();
        charValue = (char) integerValue;
        System.out.println("Input int value is : " + integerValue +  " Output char value is " + charValue );
    }
    public void charToInt(){
        System.out.println("введите входящее значение типа char:");
        Scanner scanner = new Scanner(System.in);
        charValue = scanner.next().charAt(0);
        integerValue = (int) charValue;
        System.out.println("Input char value is : " + charValue +  " Output int value is " + integerValue );
    }


}
package com.kitcenter.runners.homework;

import java.util.Scanner;
import com.kitcenter.app.homework.Lesson5TwentyMethods;
public class homeworkMainRunner {

    public static void main(String[] args) {
            System.out.println("Enter number from 1 to 20: ");
            System.out.println("1 - additionMethod"+"\n"+
                                "2 - divisionMethod"+"\n"+
                                "3 - vKvadrate"+"\n"+
                                "4 - divideOnItself"+"\n"+
                                "5 - korenKvadratnuy"+"\n"+
                                "6 - multipyOn25"+"\n"+
                                "7 - vKube"+"\n"+
                                "8 - devideOn2"+"\n"+
                                "9 - devideOn25"+"\n"+
                                "10 - devideOn5"+"\n"+
                                "11 - plusHalf"+"\n"+
                                "12 - plusHalfAndAgainPlusHalf"+"\n"+
                                "13 - plusOne"+"\n"+
                                "14 - kvadratPluskvadrat"+"\n"+
                                "15 - valuePlusValueDevideOn2"+"\n"+
                                "16 - valueMinus100"+"\n"+
                                "17 - addTwoValuesVKvadrate"+"\n"+
                                "18 - plus10"+"\n"+
                                "19 - devidedOn2AndAdd100"+"\n"+
                                "20 - devideOneMillionOnValue");
            Scanner scanner = new Scanner(System.in);
            int valueFromScanner = scanner.nextInt();
            if (valueFromScanner==1) {
                System.out.println("additionMethod is choosed. Type value, press Enter, type value2, press Enter :");
                int arg1 = scanner.nextInt();
                int arg2 = scanner.nextInt();
                System.out.print("Result:"+Lesson5TwentyMethods.additionMethod(arg1, arg2));
            } else if (valueFromScanner==2) {
                System.out.println("divisionMethod is choosed. Type value, press Enter, type value2, press Enter :");
                int arg1 = scanner.nextInt();
                int arg2 = scanner.nextInt();
                System.out.print("Result:"+Lesson5TwentyMethods.divisionMethod(arg1, arg2));
            } else if (valueFromScanner==3) {
                System.out.println("vKvadrate is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:"+Lesson5TwentyMethods.vKvadrate(arg1));
            } else if (valueFromScanner==4) {
                System.out.println("divideOnItself is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:"+Lesson5TwentyMethods.divideOnItself(arg1));
            } else if (valueFromScanner==5) {
                System.out.println("korenKvadratnuy is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:"+Lesson5TwentyMethods.korenKvadratnuy(arg1));
            } else if (valueFromScanner==6) {
                System.out.println("multipyOn25 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.multipyOn25(arg1));
            } else if (valueFromScanner==7) {
                System.out.println("vKube is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.vKube(arg1));
            } else if (valueFromScanner==8) {
                System.out.println("devideOn2 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn2(arg1));
            } else if (valueFromScanner==9) {
                System.out.println("devideOn25 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn25(arg1));
            } else if (valueFromScanner==10) {
                System.out.println("devideOn5 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn5(arg1));
            } else if (valueFromScanner==11) {
                System.out.println("plusHalf is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusHalf(arg1));
            } else if (valueFromScanner==12) {
                System.out.println("plusHalfAndAgainPlusHalf is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusHalfAndAgainPlusHalf(arg1));
            } else if (valueFromScanner==13) {
                System.out.println("plusOne is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusOne(arg1));
            } else if (valueFromScanner==14) {
                System.out.println("kvadratPluskvadrat is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.kvadratPluskvadrat(arg1));
            } else if (valueFromScanner==15) {
                System.out.println("valuePlusValueDevideOn2 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.valuePlusValueDevideOn2(arg1));
            } else if (valueFromScanner==16) {
                System.out.println("valueMinus100 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.valueMinus100(arg1));
            } else if (valueFromScanner==17) {
                System.out.println("addTwoValuesVKvadrate is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                int arg2 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.addTwoValuesVKvadrate(arg1, arg2));
            } else if (valueFromScanner==18) {
                System.out.println("plus10 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plus10(arg1));
            } else if (valueFromScanner==19) {
                System.out.println("devidedOn2AndAdd100 is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devidedOn2AndAdd100(arg1));
            } else if (valueFromScanner==20) {
                System.out.println("devideOneMillionOnValue is choosed. Type value, press Enter :");
                int arg1 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOneMillionOnValue(arg1));
            }
    }
}

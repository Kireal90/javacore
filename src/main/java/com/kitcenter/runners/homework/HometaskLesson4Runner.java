package com.kitcenter.runners.homework;

import java.util.Scanner;
import com.kitcenter.app.homework.Lesson5TwentyMethods;
public class HometaskLesson4Runner {

    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 20: ");
        System.out.println("1 - additionMethod" + "\n" +
                "2 - divisionMethod" + "\n" +
                "3 - vKvadrate" + "\n" +
                "4 - divideOnItself" + "\n" +
                "5 - korenKvadratnuy" + "\n" +
                "6 - multipyOn25" + "\n" +
                "7 - vKube" + "\n" +
                "8 - devideOn2" + "\n" +
                "9 - devideOn25" + "\n" +
                "10 - devideOn5" + "\n" +
                "11 - plusHalf" + "\n" +
                "12 - plusHalfAndAgainPlusHalf" + "\n" +
                "13 - plusOne" + "\n" +
                "14 - kvadratPluskvadrat" + "\n" +
                "15 - valuePlusValueDevideOn2" + "\n" +
                "16 - valueMinus100" + "\n" +
                "17 - addTwoValuesVKvadrate" + "\n" +
                "18 - plus10" + "\n" +
                "19 - devidedOn2AndAdd100" + "\n" +
                "20 - devideOneMillionOnValue");
        Scanner scanner = new Scanner(System.in);
        int valueFromScanner = scanner.nextInt();
        switch (valueFromScanner) {
            case 1:
                System.out.println("additionMethod is choosed. Type value, press Enter, type value2, press Enter :");
                int arg1 = scanner.nextInt();
                int arg2 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.additionMethod(arg1, arg2));
                break;
            case 2:
                System.out.println("divisionMethod is choosed. Type value, press Enter, type value2, press Enter :");
                int arg21 = scanner.nextInt();
                int arg22 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.divisionMethod(arg21, arg22));
                break;
            case 3:
                System.out.println("vKvadrate is choosed. Type value, press Enter :");
                int arg31 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.vKvadrate(arg31));
                break;
            case 4:
                System.out.println("divideOnItself is choosed. Type value, press Enter :");
                int arg41 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.divideOnItself(arg41));
                break;
            case 5:
                System.out.println("korenKvadratnuy is choosed. Type value, press Enter :");
                int arg51 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.korenKvadratnuy(arg51));
                break;
            case 6:
                System.out.println("multipyOn25 is choosed. Type value, press Enter :");
                int arg61 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.multipyOn25(arg61));
                break;
            case 7:
                System.out.println("vKube is choosed. Type value, press Enter :");
                int arg71 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.vKube(arg71));
                break;
            case 8:
                System.out.println("devideOn2 is choosed. Type value, press Enter :");
                int arg81 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn2(arg81));
                break;
            case 9:
                System.out.println("devideOn25 is choosed. Type value, press Enter :");
                int arg91 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn25(arg91));
                break;
            case 10:
                System.out.println("devideOn5 is choosed. Type value, press Enter :");
                int arg101 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOn5(arg101));
                break;
            case 11:
                System.out.println("plusHalf is choosed. Type value, press Enter :");
                int arg111 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusHalf(arg111));
                break;
            case 12:
                System.out.println("plusHalfAndAgainPlusHalf is choosed. Type value, press Enter :");
                int arg121 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusHalfAndAgainPlusHalf(arg121));
                break;
            case 13:
                System.out.println("plusOne is choosed. Type value, press Enter :");
                int arg131 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plusOne(arg131));
                break;
            case 14:
                System.out.println("kvadratPluskvadrat is choosed. Type value, press Enter :");
                int arg141 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.kvadratPluskvadrat(arg141));
                break;
            case 15:
                System.out.println("valuePlusValueDevideOn2 is choosed. Type value, press Enter :");
                int arg151 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.valuePlusValueDevideOn2(arg151));
                break;
            case 16:
                System.out.println("valueMinus100 is choosed. Type value, press Enter :");
                int arg161 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.valueMinus100(arg161));
                break;
            case 17:
                System.out.println("addTwoValuesVKvadrate is choosed. Type value, press Enter :");
                int arg171 = scanner.nextInt();
                int arg172 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.addTwoValuesVKvadrate(arg171, arg172));
                break;
            case 18:
                System.out.println("plus10 is choosed. Type value, press Enter :");
                int arg181 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.plus10(arg181));
                break;
            case 19:
                System.out.println("devidedOn2AndAdd100 is choosed. Type value, press Enter :");
                int arg191 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devidedOn2AndAdd100(arg191));
                break;
            case 20:
                System.out.println("devideOneMillionOnValue is choosed. Type value, press Enter :");
                int arg201 = scanner.nextInt();
                System.out.print("Result:" + Lesson5TwentyMethods.devideOneMillionOnValue(arg201));
                break;
        }
    }
}

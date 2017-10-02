package com.kitcenter.app.homework.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {


    public static void ifIsPolinTrue (boolean isPolindr) {
        if (isPolindr) {
            System.out.println("Value is polindrome");
        } else {
            System.out.println("Value is not polindrome");
        }
    }

    public static void checkfPolindrome (String as) {
        String polindrome = as;
        boolean isPolin = true;
        for (int i=0; i<polindrome.length()/2; i++  ) {
            isPolin = isPolin && (polindrome.charAt(i) == polindrome.charAt (polindrome.length() - i - 1));
        }
        HomeTask.ifIsPolinTrue(isPolin);
    }
    public static  void checkNumberPolinom(int arg) {

        boolean isPolinInt = true;
        int[] numbToArray = Integer.toString(arg).chars().map(c -> c-='0').toArray();
        int nmb = numbToArray.length;
        for (int i = 0; i < numbToArray.length/2; i++ ) {
                        isPolinInt = isPolinInt && (numbToArray[i] == numbToArray[nmb - i - 1]);
        }
        HomeTask.ifIsPolinTrue(isPolinInt);
    }
    public static void readMassAndCompare (String word) {
        String wordRead = word;
        boolean isPolin = true;
        String temp1 = new String();
        String temp2 = new String();
        for (int i = 0 ;  i<wordRead.length(); i++) {
            temp1 += wordRead.charAt(i);
            temp2 += wordRead.charAt(wordRead.length() -1 - i);
            if ( temp1.equalsIgnoreCase(temp2)) {
                isPolin = true;
            } else {
           isPolin = false;
                break;
            }
        }
        HomeTask.ifIsPolinTrue(isPolin);
    }
    public static void fullReadString (String wordFullRead) {
        String wordValue = wordFullRead;
        boolean isPolin = true;
        String tempWord1 = "";
        String tempWord2 = "";
        String[] ary = new String[] {wordValue};
        for (String c : ary) {
            tempWord1+=c;
        }
        for (int i = ary.length; i>0; i--) {
            tempWord2+=i;
        }
        if (tempWord1.equalsIgnoreCase(tempWord2)){
            isPolin = true;
        } else {isPolin=false;}
        HomeTask.ifIsPolinTrue(isPolin);
    }
    public static void isPalindromBool (String stringToTest)
    {
        int length = stringToTest.length();
        int halfLength = length / 2;
        boolean isPosin = true;

        for (int i = 0; i <= halfLength; i++) {
            if (stringToTest.charAt(i) != stringToTest.charAt(length - i - 1)) {
               isPosin = false;
            }else { isPosin=true;}
        }
        HomeTask.ifIsPolinTrue(isPosin);
    }

}

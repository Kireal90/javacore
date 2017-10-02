package com.kitcenter.app.classwork.lesson9;

public class CharToString {
    public static void charToString () {
        char [] charTostr = {'a','b','c','d','e','f'};
        for (char val : charTostr ) {
            System.out.print(val);
        }
    }
    public static void intToString () {
        int numberPrim = 10;
        String newStr = String.valueOf(numberPrim);
        Integer fromStrToInt = new Integer(newStr);
        System.out.println(fromStrToInt);

        double doubPrim = 10.0d;
        String dobStr = String.valueOf(doubPrim);
        Double fromStrToDoub = new Double(dobStr);
        System.out.println(fromStrToDoub);

        boolean boolVal = false;
        String boolStr = String.valueOf(boolVal);
        Boolean strToBool = new Boolean(boolStr);
        System.out.println(strToBool);

        long lonNum = 100;
        String longToStr = String.valueOf(lonNum);
        Long strToLong = new Long (longToStr);
        System.out.println(strToLong);
    }
    public static void definePolindrome () {
        String polindrome = "kazak";
        boolean isPolin = true;
        for (int i=0; i<polindrome.length()/2; i++  ) {
            isPolin = isPolin && (polindrome.charAt(i) == polindrome.charAt (polindrome.length() - i - 1));
        }
            if (isPolin) {
                System.out.println("Word is polindrome");
            } else {
                System.out.println("Word is not polindrome");
            }
        }
    }


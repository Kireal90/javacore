package com.kitcenter.runners.classwork.lesson15;

public class BubbleSortNumber {
    static <U extends Number & Comparable> Number[] arrayBubbleSortDecrease(Number [] arr) {

        Number temp;


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j].doubleValue()< arr[j + 1].doubleValue())  {

                    temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                }

            }

        }

        return arr;

    }
}

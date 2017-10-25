package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.BoxT;

import java.util.Arrays;

public class ClassworkLesson15BoxTRunner {
    public static void main(String[] args) {

        BoxT<Integer> integerBox = new BoxT<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(21.0d);

        Number [] n = {10, 13.44, 23.545, 2.2, 34};

        BubbleSortNumber.arrayBubbleSortDecrease(n);
        System.out.println(Arrays.toString(n));

    }
}

package com.kitcenter.app.classwork.lesson7;

import java.util.Arrays;

public class Array {
    int[] massif = {1,2,3};
    char[] b ={'a','b','1'};

    public void forAssignValueInArray(){
        int [] a = new int[10];
        for (int i = 0; i<a.length; i++){
            a[i]=i;
        }
        int counter = 0;
        for (int forEach : a) {
            counter++;
        }
        System.out.println(Arrays.toString(a));
    }
}

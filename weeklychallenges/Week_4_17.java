package com.example.weeklychallenges;

import java.util.Arrays;

public class Week_4_17 {
    public static void main(String[] args) {
        int[] arr1 = arrayOfMultiples(7,5),
            arr2 = arrayOfMultiples(12,10),
            arr3 = arrayOfMultiples(17,6);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int[] intArr = new int[length];
        for(int i = 0; i < length; i++) {
            intArr[i] = num * (i + 1);
        }
        return intArr;
    }
}

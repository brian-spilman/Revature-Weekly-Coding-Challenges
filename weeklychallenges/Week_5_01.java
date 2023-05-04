package com.example.weeklychallenges;

public class Week_5_01 {

    public static void main(String[] args) {

        int[] nums1 = {2, 8, 7, 5},
                nums2 = {12, 90, 75},
                nums3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};

        System.out.println(warOfNumbers(nums1));
        System.out.println(warOfNumbers(nums2));
        System.out.println(warOfNumbers(nums3));

    }

    public static int warOfNumbers(int[] nums) {

        int sumEven = 0, sumOdd = 0;

        for(int x : nums) {
            if(x % 2 == 0) {
                sumEven += x;
            } else {
                sumOdd += x;
            }
        }

        return Math.abs(sumEven - sumOdd);
    }

}

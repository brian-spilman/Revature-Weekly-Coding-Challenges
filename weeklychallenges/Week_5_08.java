package com.example.weeklychallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Week_5_08 {

    public static void main(String[] args) {

        // Part One
        int[] nums1 = {1,3}, nums2 = {2};
        System.out.println(medianOfArrays(nums1, nums2));

        int[] nums3 = {1,2}, nums4 = {3,4};
        System.out.println(medianOfArrays(nums3, nums4));

        // Part Two
        List<LinkedList<Integer>> lists = new LinkedList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(4);
        l1.add(5);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(3);
        l2.add(4);
        LinkedList<Integer> l3 = new LinkedList<>();
        l3.add(2);
        l3.add(6);
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        System.out.println(mergeLists(lists));
        
    }

    public static double medianOfArrays(int[] nums1, int[] nums2) {

        int i = nums1.length;
        int j = nums2.length;

        int[] combined = new int[i + j];

        System.arraycopy(nums1, 0, combined, 0, i);
        System.arraycopy(nums2, 0, combined, i, j);

        Arrays.sort(combined);

        int size = combined.length;
        if(size % 2 == 0) {
            int a = size / 2;
            double b = combined[a];
            double c = combined[a - 1];

            double mid = (b + c) / 2;
            return mid;
        } else {
            int a = Math.round(size / 2);
            return combined[a];
        }

    }

    public static LinkedList<Integer> mergeLists(List<LinkedList<Integer>> lists) {

        int size = lists.size();
        LinkedList<Integer> merged = new LinkedList<>();

        for (LinkedList<Integer> l : lists) {
            merged.addAll(l);
        }

        Collections.sort(merged);

        return merged;
    }

}

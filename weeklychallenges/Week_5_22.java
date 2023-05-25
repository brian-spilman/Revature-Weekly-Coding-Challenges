package com.example.weeklychallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Week_5_22 {

    public static void main(String[] args) {
        triples();
        sumString();
    }

    public static void triples() {

        Scanner scan = new Scanner(System.in);
        Scanner strScan = new Scanner(System.in);
        int size = scan.nextInt();
        List<String> inputs = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            inputs.add(strScan.nextLine());
        }

        for(String s : inputs) {
            String[] strArr = s.split(" ");
            int[] intArr = new int[3];
            for(int i = 0; i < 3; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            Arrays.sort(intArr);
            System.out.println(intArr[1]);
        }

    }

    public static void sumString() {

        Scanner scan = new Scanner(System.in);
        Scanner strScan = new Scanner(System.in);
        int size = scan.nextInt();
        List<String> inputs = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            inputs.add(strScan.nextLine());
        }

        for(String s : inputs) {
            String fresh = s.replaceAll("[^0-9]", "");
            int[] intArr = new int[fresh.length()];
            for(int i = 0; i < fresh.length(); i++) {
                intArr[i] = Character.getNumericValue(fresh.charAt(i));
            }
            System.out.println(Arrays.stream(intArr).sum());
        }
    }


}

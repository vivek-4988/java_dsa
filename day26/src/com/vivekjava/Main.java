package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int testCase = cin.nextInt();

        int n = cin.nextInt(), arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

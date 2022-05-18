package com.vivekjava;

import java.util.Scanner;

public class MainCodingBlocksEg {
    //reference took from https://www.enjoyalgorithms.com/blog/maximum-subarray-sum

//    int[] arr = {-3, 2, -1, 4, -2};
//    int[] arr = {5,7,6,10,3};

    static int maxSubArraySum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();//to enter test cases
        int counter = 1 ;
        while (test != counter){
            int arSize = sc.nextInt();
            int[] arr = new int[arSize];
            for (int i = 0; i < arSize; i++) {
                arr[i] = sc.nextInt();
            }
            result(arr);
            counter++;
        }
    }

    //brute force approach
    static void result(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int subArraySum = 0;
            for (int j = i; j < n; j++) {
                subArraySum += arr[j];
                if (subArraySum > maxSubArraySum) {
                    maxSubArraySum = subArraySum;
                }
            }
        }
        System.out.println(maxSubArraySum);
    }

    //with o(n^2)
    static void getMaxSubArraySum() {
        int[] arr = {-4, 5, 7, -6, 10, -15, 3};
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int subArraySum = 0;
            for (int j = i; j < n; j++) {
                subArraySum += arr[j];
                if (subArraySum > maxSubArraySum) {
                    maxSubArraySum = subArraySum;
                }
            }
        }
        System.out.println(maxSubArraySum);
    }
}

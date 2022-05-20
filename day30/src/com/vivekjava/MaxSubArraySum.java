package com.vivekjava;

import java.util.*;

public class MaxSubArraySum {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int counter = 0;
        while (test != counter) {
            int arSize = sc.nextInt();
            int[] arr = new int[arSize];
            for (int i = 0; i < arSize; i++) {
                arr[i] = sc.nextInt();
            }
            result(arr);
            counter++;
        }
    }

    static void result(int[] arr) {
        int maxSubArraySum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur_sum + arr[i] < 0) {
                cur_sum = 0;
                continue;
            }
            cur_sum = cur_sum + arr[i];
            maxSubArraySum = Math.max(cur_sum, maxSubArraySum);
        }
        System.out.println(maxSubArraySum);
    }

}
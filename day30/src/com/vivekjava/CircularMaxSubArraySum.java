package com.vivekjava;

import java.util.Scanner;

//for codingblocks
public class CircularMaxSubArraySum {
    
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

    static void result(int[] nums) {
        int totalSum = 0;
        int maxEndat = 0;
        int minEndAt = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;


        for (int x : nums) {
            totalSum += x;
            maxEndat = Math.max(maxEndat+x,x);
            maxSum = Math.max(maxEndat,maxSum);

            minEndAt = Math.min(minEndAt+x,x);
            minSum = Math.min(minEndAt,minSum);
        }

        if (maxSum > 0 ){
            int val = Math.max(maxSum,totalSum-minSum);
            System.out.println(val);
        }else{
            System.out.println(maxSum);
        }
    }

}
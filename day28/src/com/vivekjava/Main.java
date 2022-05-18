package com.vivekjava;

public class Main {
    //reference took from https://www.enjoyalgorithms.com/blog/maximum-subarray-sum

//    static int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    static int[] arr = {-3, 2, -1, 4, -2};
//    int[] arr = {5,7,6,10,3};

    static int maxSubArraySum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        getMaxSubArraySumKadens();
    }


    //kadane's algo sort method
    static void getMaxSubArraySumKadens() {
        int maxSubArraySum = arr[0];
        int cur_sum = maxSubArraySum;
        for (int i = 1; i < arr.length; i++) {
            cur_sum = Math.max(arr[i] + cur_sum, arr[i]);
            maxSubArraySum = Math.max(cur_sum, maxSubArraySum);
        }
        System.out.println(maxSubArraySum);
    }

    //kadane's algo sort method
    static void getMaxSubArraySum2() {
        int maxSubArraySum = 0;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];
            if (cur_sum > maxSubArraySum) {
                maxSubArraySum = cur_sum;
            }
            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }
        System.out.println(maxSubArraySum);
    }

    //with o(n^2)
    static void getMaxSubArraySum() {
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {
            int subArraySum = 0;
            for (int j = i; j <= n; j++) {
                subArraySum += arr[j];
                if (subArraySum > maxSubArraySum) {
                    maxSubArraySum = subArraySum;
                }
            }
        }
        System.out.println(maxSubArraySum);
    }
}

package com.vivekjava;

public class Main {
    //reference took from https://www.enjoyalgorithms.com/blog/maximum-subarray-sum

    static int[] arr = {-4, 5, 7, -6, 10, -15, 3};
//    int[] arr = {-3, 2, -1, 4, -2};
//    int[] arr = {5,7,6,10,3};

    static int maxSubArraySum = 0;

    public static void main(String[] args) {

    }

    //with o(n^2)
    static void getMaxSubArraySum() {
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

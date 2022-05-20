package com.vivekjava;

public class Main {

    public static void main(String[] args) {
//        int[] nums = {4, -2, -3, 4, -1, -2, 1, 5, -3};
        int[] nums = {-4, 4, -6, 6, -10, 11, -12};
        sumCircularSubArray(nums);
        //maxSubArrSum(nums);
//        int[] nums = {-1, 4, 7, 2};
    }

    //Maximum Sum Circular Subarray
    static void sumCircularSubArray(int[] nums) {
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
            int val = Math.max(maxSum,totalSum-minEndAt);
            System.out.println(val);
        }else{
            System.out.println(maxSum);
        }

    }

    static void maxSubArrSum(int[] nums) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        System.out.println(maxSum);

    }

}

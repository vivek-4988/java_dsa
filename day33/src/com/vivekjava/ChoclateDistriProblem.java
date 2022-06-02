package com.vivekjava;

import java.util.*;

//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ChoclateDistriProblem {

    public static void main(String[] args) {
        int[] a = {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50};
        System.out.println(finMinDifference(a, 8, 5));
    }

    //n is packets
    //m is students
    static long finMinDifference(int[] array, long n, long m) {
        Arrays.sort(array);
        long minDiff = Long.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            minDiff = Math.min(array[i + ((int) m - 1)] - array[i], minDiff);
        }
        return minDiff;
    }

}

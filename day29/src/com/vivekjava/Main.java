package com.vivekjava;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    static int[] arr = {1, 2, 3, 1};

    public static void main(String[] args) {
        boolean val = containsDuplicateHash(arr);
        System.out.println(val);
    }

    static boolean containsDuplicateHash(int[] nums) {
        if (nums.length <= 0) {
            return false;
        } else {
            // Creates an empty hashset
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i]))
                    return true;
                // Add this item to hashset
                set.add(nums[i]);
            }
            return false;
        }
    }

    static boolean containsDuplicateSort(int[] nums) {
        if (nums.length <= 0) {
            return false;
        } else {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
            return false;
        }
    }

    //brute force approach o(n) - 20ms
    static boolean containsDuplicateBF(int[] nums) {
        if (nums.length <= 0) {
            return false;
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

}

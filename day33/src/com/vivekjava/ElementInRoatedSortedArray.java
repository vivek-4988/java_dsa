package com.vivekjava;

import java.util.Arrays;

//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ElementInRoatedSortedArray {

    //https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 11, 1, 2, 3, 4};
        System.out.println(searchInRotatedArray(arr, 9, 0, arr.length - 1));
    }

    static int searchInRotatedArray(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        if (arr[left] <= arr[mid]) {
            if (key >= arr[mid] && key <= arr[mid]) {
                return searchInRotatedArray(arr, key, left, mid - 1);
            }
            return searchInRotatedArray(arr, key, mid + 1, right);
        }

        if (key >= arr[mid] && key <= arr[mid]) {
            return searchInRotatedArray(arr, key, mid + 1, right);
        }
        return searchInRotatedArray(arr, key, left, mid - 1);
    }

}

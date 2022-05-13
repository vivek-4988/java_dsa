package com.vivekjava;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[] arr = {1, 2, 2, 2, 2, 3, 3, 3, 9, 11};
    static int[] bArray = {5, 7, 10, 12, 15, 20, 27, 31, 36, 45, 55, 65, 70, 73, 85, 99};

    public static void main(String[] args) {
        lowerBound(2);
        upperBound(3);
    }

    static void lowerBound(int data) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                ans = mid;
                high = mid - 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("LB " + ans);
    }

    static void upperBound(int data) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                ans = mid;
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("UB " + ans);
    }

    static void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }

        display(arr);
    }

    //searching minimum element from the array and swap with minimum
    static void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        display(arr);
    }

    //check with next index and swap
    static void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        display(arr);
    }

    static int bSearch(int item) {
        int lo = 0;
        int hi = bArray.length - 1;
        while (lo <= hi) {
            int med = (lo + hi) / 2;
            if (bArray[med] < item) {
                lo = med + 1;
            } else if (bArray[med] > item) {
                hi = med - 1;
            } else {
                return med;
            }
        }
        return -1;
    }

    static int linearSearch(int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    static void maxNumber() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    static void display(int[] ar) {
        System.out.println("My array");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ",");
        }
    }

}

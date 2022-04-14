package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(), arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int s[] = sort(arr, max);
        for (int t : s) {
            System.out.println(t);
        }
    }

    public static int[] sort(int arr[], int k) {
        int count[] = new int[k + 1], b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {  //Must be arr.length not count.length
            ++count[arr[i]];
        }
        for (int i = 1; i <= k; i++) {   //The index of count on the left of equal sign matters so it must start from 1 not 0
            count[i] = count[i] + count[i - 1];
        }
        for (int i = arr.length - 1; i > -1; i--) {
            b[--count[arr[i]]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
        return arr;
    }
}

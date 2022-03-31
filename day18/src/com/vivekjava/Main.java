package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 10, 15, 20, 22, 25, 30, 32, 35, 40, 42, 45, 48, 50};
        int lo = 0;
        int hi = arr.length - 1;
        int search = 20;
        int getValue = -1;
        while (lo <= hi) {
            int med = (lo + hi) / 2;
            if (arr[med] < search) {
                lo = med + 1;
            } else if (arr[med] > search) {
                hi = med - 1;
            } else {
                getValue = med;
                break;
            }
        }
        System.out.println("position : " + getValue);
    }
}

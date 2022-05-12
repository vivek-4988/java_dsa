package com.vivekjava;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[] defaultArray = {10, 5, 20, 30, 25};
    static int[] bArray = {5, 7, 10, 12, 15, 20, 27, 31, 36, 45, 55, 65, 70, 73, 85, 99};

    public static void main(String[] args) {
        System.out.println(bSearch(101));
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
            }else{
                return med;
            }
        }
        return -1;
    }

    static int linearSearch(int item) {
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[i] == item) {
                return i;
            }
        }
        return -1;
    }

    static void maxNumber() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < defaultArray.length; i++) {
            if (defaultArray[i] > max) {
                max = defaultArray[i];
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

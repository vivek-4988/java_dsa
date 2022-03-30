package com.vivekjava;

import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
    }


    private static int[] takeInput() {
        System.out.println("Size ?");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value of " + i);
            arr[i] = scn.nextInt();
        }

        return arr;
    }


    private static void display(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}

package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        print2darray();
    }

    static void print2darray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows :");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.println("enter value for row " + i + "col " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    static void wavePrint() {
        int[][] array = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}

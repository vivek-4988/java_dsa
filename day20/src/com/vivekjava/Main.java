package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        wavePrint();
    }

    static void wavePrint() {
        int[][] array = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }else{
                for (int j = array[i].length-1; j >= 0 ; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}

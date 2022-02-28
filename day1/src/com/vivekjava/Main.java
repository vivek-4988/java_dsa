package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        pattern3(n);
        //pattern2(n, m);
        //pattern1(n,m);
    }

    //left pyramid
    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    //hole in box
    private static void pattern2(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i==1||j==1||i==n||j==m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //box
    private static void pattern1(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

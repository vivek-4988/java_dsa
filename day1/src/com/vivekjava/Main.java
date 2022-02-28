package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========");
        int n = 4;
        int m = 5;

        //todo pattern 3
        pattern3(n);

        //todo pattern2
        //pattern2(n, m);

        //todo pattern 1
        //pattern1(n,m);
        System.out.println("=========");
    }


    /**
    =========
    *
    **
    ***
    ****
    =========
     */
    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * =====
     * ****
     * *
     * *
     * ****
     * =====
     */
    private static void pattern2(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     *******
     *******
     *******
     *******
     *******
     * */
    private static void pattern1(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

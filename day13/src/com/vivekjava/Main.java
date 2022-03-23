package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        p1(5);
    }

    //pattern star
    static void p1(int n) {
        int nst = n;
        int nsp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j + " ");
            }
            if (i > 1) {
                for (int j = 1; j <= nsp; j++) {
                    System.out.print("* ");
                }
                nsp += 2;
            }
            System.out.println();
            nst--;
        }
    }
}

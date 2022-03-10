package com.vivekjava;

public class StarPatterns {
    public static void main(String[] args) {
        p2(5);
    }

    public static void p2(int n) {
        int nsp = 0;
        int nst = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            nst--;
            nsp += 2;
        }
    }

    public static void p1(int n) {
        int nsp = 0;
        int nst = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            nst--;
            nsp += 2;
        }
    }

}

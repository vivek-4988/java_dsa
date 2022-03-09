package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        p3(5);
    }

    public static void p3(int n) {
        int number = 1;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.printf(" %d ", number);
                number++;
            }

            System.out.println();
            nsp--;
            nst += 2;

        }
    }

    public static void p2(int n) {
        int number = 1;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.printf(" %d ", number);
            }

            System.out.println();
            nsp--;
            nst += 2;
            number++;

        }
    }

    public static void p1(int n) {
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.print(" 1 ");
            }

            System.out.println();
            nsp--;
            nst += 2;

        }
    }

}

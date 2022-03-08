package com.vivekjava;

import java.util.Scanner;

//todo please check me readme for pattern result
public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        pattern7(5);
    }

    public static void pattern7(int n) {
        int nst = 1;
        int nsp = (n * 2) - 3;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //todo remove last extra star
            if (nst == n) {
                nst = nst - 1;
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }
            System.out.println();

            nst += 1;
            nsp -= 2;

        }
    }

    public static void pattern6(int n) {
        int nsp = n / 2;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            //spaces work
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                nsp -= 1;
                nst += 2;
            } else {
                nst -= 2;
                nsp += 1;
            }

            System.out.println();

        }
    }

    public static void pattern5(int n) {
        int nsp = 1;
        int nst = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            //spaces work
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                nsp += 2;
                nst -= 1;
            } else {
                nsp -= 2;
                nst += 1;
            }
        }
    }

    public static void pattern4(int n) {
        pattern0(n);
        pattern1(n);
    }

    public static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void pattern1(int n) {
        while (n > 0) {
            int j = n;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            n--;
        }
    }

    public static void pattern0(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}



package com.vivekjava;

import java.util.Scanner;

public class Main {

    static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }

    static void startTOH() {
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = -1;
        int nst = (n / 2) + 1;
        //upper
        for (int i = nst; i > 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" \t");
            }
            if (i == nst) {
                for (int j = 2; j <= i; j++) {
                    System.out.print("*\t");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*\t");
                }
            }
            nsp += 2;
            System.out.println();
        }
        //bottom
        for (int i = 1; i <= nst; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" \t");
            }
            if (i == nst) {
                for (int j = 2; j <= i; j++) {
                    System.out.print("*\t");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*\t");
                }
            }
            nsp -= 2;
            System.out.println();
        }
    }


    static String checkPrime() {
        String notPrime = "Not Prime";
        String prime = "Prime";

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            return notPrime;
        } else {
            int flag = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return prime;
            } else {
                return notPrime;
            }
        }
    }


}

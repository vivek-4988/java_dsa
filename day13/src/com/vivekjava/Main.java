package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p2Ganesha(n);
    }

    static void p2Ganesha(int n) {
        if (n >= 5 && n <= 99 && n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (i == (n / 2) + 1) {
                    //for middle row
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                } else if (i > n / 2) {
                    //bottom side
                    for (int j = 1; j <= n; j++) {
                        if (j == n / 2 + 1 || j == n) {
                            System.out.print("*");
                        } else {
                            if (i == n && j <= n / 2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                } else {
                    //top side
                    for (int j = 1; j <= n; j++) {
                        if (j > 1 && j != n / 2 + 1) {
                            if (j > n / 2 && i == 1) {
                                //to print first row right side
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
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

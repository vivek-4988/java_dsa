package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //only for odd number
        //p1(n);
        //p2(n);
        p1less(n);
    }

    //second method
    public static void p2(int n) {
        int nsp1 = n - 1;       // initializing number of spaces of 1st batch
        int nsp2 = -1;          // initializing number of spaces of 2nd batch
        int nst = 1;            // initializing number of numbers

        for (int row = 1; row <= n; row++) {

            int val;     // starting value of numbers

            if (row <= n / 2 + 1) {
                val = row;               // till mid value is equal to row number
            } else {
                val = n - row + 1;     // after mid values are total rows - current row +1
            }

            // work for spaces
            for (int csp = 1; csp <= nsp1; csp++) {
                System.out.print("  ");
            }

            // work for numbers
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + " ");
                val--;
            }

            // work for spaces
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("  ");
            }

            int cst = 1;
            val++;
            if (row == 1 || row == n) {
                cst = 2;

            }

            // work for numbers
            for (; cst <= nst; cst++) {
                System.out.print(val + " ");
                val++;
            }

            //preparation for next iteration
            if (row <= n / 2) {
                nsp1 -= 2;
                nst++;
                nsp2 += 2;
            } else {
                nsp1 += 2;
                nst--;
                nsp2 -= 2;
            }
            System.out.println();
        }
    }

    public static void space(int size) {
        for (int counter = 0; counter < size; counter++) {
            //Add space
            System.out.print("  ");
        }
    }

    public static void p1less(int size) {
        for (int i = size; i >= 1; i--) {
            //include initial space
            space((size * 2) - (i * 2));
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            if (i >= 2) {
                space((i - 1) * 2 - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        //print bottom half layers
        for (int i = 1; i <= size; i++) {
            //include initial space
            space(i * 2);
            //print star
            for (int j = size - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            if (i + 1 != size) {
                space(((size - 1) * 2) - (i * 2) - 1);
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void p1(int size) {
        for (int i = 1; i <= size; i++) {
            //include initial space
            space((size * 2) - (i * 2));
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            if (i >= 2) {
                space((i - 1) * 2 - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
        }

        //print bottom half layers
        for (int i = 1; i <= size; i++) {
            //include initial space
            space(i * 2);
            //print star
            for (int j = size - i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }
            if (i + 1 != size) {
                space(((size - 1) * 2) - (i * 2) - 1);
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" " + j + " ");
                }
            }
            System.out.print("\n");
        }
    }
}

package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //only for odd number
        p1(n);
    }

    public static void space(int size) {
        for (int counter = 0; counter < size; counter++) {
            //Add space
            System.out.print("   ");
        }
    }

    public static void p1less(int size) {
        for (int i = size ; i >= 1; i--) {
            //include initial space
            space((size * 2) - (i * 2));
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }
            if (i >= 2) {
                space((i - 1) * 2 - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j + " ");
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

    public static void p1(int size) {
        for (int i = 1; i <= size; i++) {
            //include initial space
            space((size * 2) - (i * 2));
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }
            if (i >= 2) {
                space((i - 1) * 2 - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j + " ");
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

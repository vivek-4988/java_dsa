package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        manmohanPattern2();
    }

    static void printBinary() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i = 0;
        while (n > 0) {
            String num = sc.next();
            arr[i] = num;
            i++;
            n--;
        }

        for (int j = 0; j <= arr.length - 1; j++) {
            System.out.println(Integer.parseInt(arr[j], 2));
        }

    }


    static void hollowRombusPattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            nsp--;
            System.out.println();
        }
    }

    static void reverse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        StringBuilder reverse = new StringBuilder();
        while (temp > 0) {
            reverse.append(String.valueOf(temp % 10));
            temp = temp / 10;
        }
        System.out.println(reverse);
    }

    static void manmohanPattern2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int myNum = 1;
        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                myNum++;
            }
            for (int j = 1; j <= i; j++) {

                if (i == 2 || j == 1 || j == i) {
                    System.out.print(myNum);
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    //pattern zeros
    static void manmohanPattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("1");
                } else {
                    if (i % 2 == 0) {
                        if (j == 1 || j == n) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }

    //pattern zeros
    static void patternZeros() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }

}

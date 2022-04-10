package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        manmohanPattern1();
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
                        if (j==1 || j==n){
                            System.out.print("1");
                        }else {
                            System.out.print("0");
                        }
                    }else{
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

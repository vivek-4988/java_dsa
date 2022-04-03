package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FahrenheitToCelsius();
    }

    static void FahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextInt();
        long max = sc.nextInt();
        long step = sc.nextInt();

        for (long i = min; i <= max ; i+= step) {
            long C = ((i - 32) * 5) / 9;
            System.out.println(i+"\t"+C);
        }
    }

    static void pascalTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int res = 1;
                int k = j;
                if (i > i - k)
                    k = i - k;

                for (int l = 0; l < k; l++) {
                    res *= (i - l);
                    res /= (l + 1);
                }

                System.out.print(res + "\t");
            }
            System.out.println();
        }
    }

}

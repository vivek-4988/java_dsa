package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalTriangle(n);
    }

    static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int res = 1;
                int k= j;
                if (i > i - k)
                    k = i - k;

                for (int l = 0; l < k ; l++) {
                    res *= (i - l);
                    res /= (l + 1);
                }

                System.out.print(res + "\t");
            }
            System.out.println();
        }
    }

}

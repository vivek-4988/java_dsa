package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mountainPattern(n);
    }

    static void mountainPattern(int n) {
        int nst = 1;
        int nsp = n + (n-3);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j+" ");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            if (n == nst) {
                nst--;
            }
            for (int j = nst; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
            nsp -= 2;
            nst++;
        }
    }

    static void octalToDecimal() {
        Scanner sc = new Scanner(System.in);
        int octalNum = 0, countval = 1;
        int deciNum = sc.nextInt();
        while (deciNum != 0) {
            // decimals remainder is calculated
            int remainder = deciNum % 8;

            // storing the octalvalue
            octalNum = octalNum + remainder * countval;

            // storing exponential value
            countval = countval * 10;
            deciNum /= 8;
        }
        System.out.println(octalNum);
    }
}

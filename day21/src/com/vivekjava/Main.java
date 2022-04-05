package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternTraingle(n);
    }

    static void patternTraingle(int n) {
        int nsp = n - 1;
        int nst = 1;
        int counter;
        for (int i = 1; i <= n; i++) {
            counter = i;
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(counter + "\t");
                if (j > nst / 2) {
                    counter--;
                } else {
                    counter++;
                }
            }
            System.out.println();
            nst += 2;
            nsp--;
        }
    }

    static void fibbonaciPattern(int n) {
        int firstEle = 0;
        int secEle = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    System.out.print(firstEle + "\t");
                } else if (i == 1 && j == 1) {
                    System.out.print(secEle + "\t");
                } else {
                    sum = firstEle + secEle;
                    firstEle = secEle;
                    secEle = sum;
                    System.out.print(sum + "\t");
                }
            }
            System.out.println();
        }
    }

    static void mountainPattern(int n) {
        int nst = 1;
        int nsp = n + (n - 3);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            if (n == nst) {
                nst--;
            }
            for (int j = nst; j >= 1; j--) {
                System.out.print(j + " ");
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

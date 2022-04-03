package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        countDigits();
    }

    static void countDigits() {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        int digit = sc.nextInt();

        int count = 0;
        while (number > 0) {
            long checkNum = number % 10;
            if (checkNum == digit) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }

    static boolean isArmStrongNumber(int n) {
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        int last;
        int sum = 0;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    static void binaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long c = Integer.parseInt(n, 2);
        System.out.println(c);
//        do{
//
//        }while (n.length()==0);
    }

    static void FahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextInt();
        long max = sc.nextInt();
        long step = sc.nextInt();

        for (long i = min; i <= max; i += step) {
            long C = ((i - 32) * 5) / 9;
            System.out.println(i + "\t" + C);
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

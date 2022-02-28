package com.vivekjava;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        //findGCD(12, 18);

        //getPower(5,5);

        //System.out.print(factorial(-3));

        //printNumberAndAvgIt();

        //sumOddNumber(7);

        //circleCircumference(5);

        /*
        int i = 0;
        do {
            //atleast play once
            System.out.println("*");
            i--;
        } while (i > 4);
        */

    }

    //searching great common divisor number
    static void findGCD(int x, int y) {
        int gcd = 1;
        StringBuilder xFactor = new StringBuilder();
        StringBuilder yFactors = new StringBuilder();
        for (int i = 1; i <= x && i <= y; i++) {
            xFactor.append(x % i == 0 ? i + "," : "");
            yFactors.append(y % i == 0 ? i + "," : "");
            //returns true if both conditions are satisfied
            if (x % i == 0 && y % i == 0)
                //storing the variable i in the variable gcd
                gcd = i;
        }
        System.out.println("FACTORS X : " + xFactor);
        System.out.println("FACTORS Y : " + yFactors);
        //prints the gcd
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }

    static void getPower(int base, int exponent) {
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println(result);
    }

    static void circleCircumference(int radius) {
        float pi = 3.14f;
        float circumference = 2 * pi * radius;
        System.out.println("Circumference : " + circumference);
    }

    static void sumOddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    static void printNumberAndAvgIt() {
        System.out.println("Enter any three number");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int avg = (sc.nextInt() + sc1.nextInt() + sc2.nextInt()) / 3;
        System.out.println("Average : " + avg);
    }

    //factorial function
    static Integer factorial(int n) {
        if (n < 0) {
            //no negative numbers for factorial
            return 0;
        }
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

}

package com.vivekjava;

import java.util.jar.JarOutputStream;

public class Main {

    static int sum = 0;

    public static void main(String[] args) {
        // write your code here

        //print1to5Recursive(1);
        //printSumofN(0, 8);

        //todo printFactorial
        //int v = printFactorial(5);
        //System.out.println(v);

        //todo print fibbonacciSum
//        System.out.print("0,1,");
//        printFibbonaciSum(0, 1, 7-2);

        //todo get power of x i.e. x^n
        int ans = printcalCPower(5, 0);
        System.out.println(ans);
    }

    private static int printcalCPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xPower = printcalCPower(x, n - 1);
        int xPow = x * xPower;
        return xPow;
    }


    //0 , 1 , 1 , 2 , 3 , 5
    private static void printFibbonaciSum(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + ",");
        printFibbonaciSum(b, c, n - 1);
    }

    private static int printFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = printFactorial(n - 1);//20
        return n * fact;
    }

    public static void printSumofN(int i, int n) {
        if (i == n) {
            System.out.println(sum);
            return;
        }
        i += 1;
        sum += i;
        printSumofN(i, n);
    }

    public static void print1to5Recursive(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        print1to5Recursive(n + 1);
    }

}

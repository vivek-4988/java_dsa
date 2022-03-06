package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //print1to5Recursive(1);
        //printSumofN(0, 8);
        int v = printFactorial(5);
        System.out.println(v);
    }

    static int sum = 0;

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

package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        //pdiskip(5);
        System.out.println(fib(8));
    }

    static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fnm = fib(n - 1);
        int fn2 = fib(n - 2);
        return fnm + fn2;
    }

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int pnm = power(x, n - 1);
        return x * pnm;
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm = fact(n - 1);
        return n * fnm;
    }

    static void pdiskip(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        pdiskip(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}

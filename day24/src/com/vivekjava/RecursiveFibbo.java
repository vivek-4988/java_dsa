package com.vivekjava;

public class RecursiveFibbo {

    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(ans);
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        //not tail recursion as it has some more tails
        return fib(n - 1) + fib(n - 2);
    }
}

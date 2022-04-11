package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        //pdiskip(5);
        System.out.println(power(2,5));
    }

    static int power(int x, int n) {
        if (n==0){
            return 1;
        }
        int pnm = power(x, n - 1);
        int pn = x * pnm;
        return pn;
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm = fact(n - 1);
        int fn = n * fnm;
        return fn;
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

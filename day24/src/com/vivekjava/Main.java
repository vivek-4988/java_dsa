package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        pdiskip(5);
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

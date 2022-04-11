package com.vivekjava;

public class PrintRecursiveNumberReal {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print(n + 1);
        System.out.println("Again " + n);
    }
}

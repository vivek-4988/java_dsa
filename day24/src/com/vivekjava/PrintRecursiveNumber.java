package com.vivekjava;

public class PrintRecursiveNumber {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        System.out.println(n);
        print1(2);
        System.out.println("Again " + n);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(3);
        System.out.println("Again " + n);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(4);
        System.out.println("Again " + n);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(5);
        System.out.println("Again " + n);
    }

    static void print4(int n) {
        System.out.println(n);
        System.out.println("Again " + n);
    }
}

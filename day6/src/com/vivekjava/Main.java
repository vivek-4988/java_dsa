package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        print1to5Recursive(1);
    }


    public static void print1to5Recursive(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        print1to5Recursive(n + 1);
    }

}

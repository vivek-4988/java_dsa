package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        p1(5);
    }

    public static void p1(int n) {
        int firstIndex = 1;
        int lastIndex = n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == firstIndex || j == lastIndex) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
            lastIndex--;
            firstIndex++;
        }
    }
}

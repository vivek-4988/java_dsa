package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        p1(5);
    }

    public static void p1(int n) {
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.print(" 1 ");
            }

            System.out.println();
            nsp --;
            nst += 2;

        }
    }

}

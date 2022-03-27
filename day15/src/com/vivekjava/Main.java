package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        part1();
    }

    private static void part1() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > 0 && n1 < 100 && n2 > 0 && n2 < 100) {
            for (int i = 1; i <= n1; i++) {
                int formula = (3 * i) + 2;
                if (formula % n2 != 0) {
                    System.out.println(formula);
                } else {
                    n1++;
                }
            }
        }
    }
}

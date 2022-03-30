package com.vivekjava;

import java.util.Scanner;

public class DSMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int sign = 0;
        boolean isStrictlyDecIn = false;
        int prev = num;
        while (n - 1 > 0) {
            num = sc.nextInt();
            int present = num;
            if (prev < present) {
                isStrictlyDecIn = true;
            }
            if (prev > present) {
                if (isStrictlyDecIn) {
                    isStrictlyDecIn = false;
                    sign = 2;
                }
                if (sign != 2)
                    sign = 1;
            }
            if (prev == present) {
                isStrictlyDecIn = false;
                sign = 2;

            }
            prev = num;
            n--;
        }
        if (isStrictlyDecIn && sign != 2)
            System.out.println("true");
        else {
            if (sign == 2)
                System.out.println("false");
            else
                System.out.println("true");
        }
    }
}

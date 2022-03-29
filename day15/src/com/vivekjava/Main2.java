package com.vivekjava;

import java.util.*;
public class Main2 {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        do {
            char operation = sc1.next().charAt(0);
            if (operation == 'x' || operation == 'X') {
                break;
            } else if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '%') {
                System.out.println("Invalid operation. Try again.");
            } else {
                long n1 = sc1.nextInt();
                long n2 = sc1.nextInt();
                if (n1 > 0 && n2 > 0 && n1 <= 1000000000 && n2 <= 1000000000) {
                    long ans = 0;
                    if (operation == '+') {
                        ans = n1 + n2;
                        System.out.println(ans);
                    } else if (operation == '*') {
                        ans = n1 * n2;
                        System.out.println(ans);
                    } else if (operation == '-') {
                        ans = n1 - n2;
                        System.out.println(ans);
                    } else if (operation == '/') {
                            ans = n1 / n2;
                            System.out.println(ans);
                    } else if (operation == '%') {
                        ans = n1 % n2;
                        System.out.println(ans);
                    } else {
                        System.out.println("Invalid operation. Try again.");
                    }
                }
            }
        } while (true);
    }
}

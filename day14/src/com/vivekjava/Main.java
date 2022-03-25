package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Write a program that works as a simple calculator.

        1.It reads a character (ch)
                2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number.
        3.If ch is 'X' or 'x', the program terminates.
        4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).
*/
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
                if (n1 > 0 && n2 > 0 && n1 < 1000000000 && n2 < 1000000000) {
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
                        if (n1 > n2) {
                            ans = n1 / n2;
                            System.out.println(ans);
                        }
                    } else if (operation == '%') {
                        ans = n1 % n2;
                        System.out.println(ans);
                    } else {
                        System.out.println("Invalid operation. Try again.");
                    }
                }
            }
        } while (true);

/*        // ===================================================================
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n < 10) {
            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print(j);
                }
                for (int j = num + 1; j <= n; j++) {
                    System.out.print("*");
                }
                num++;
                System.out.println();
            }
        }*/
    }
}

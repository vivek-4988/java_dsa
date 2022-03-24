package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=1 && n < 10){
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
        }
    }
}

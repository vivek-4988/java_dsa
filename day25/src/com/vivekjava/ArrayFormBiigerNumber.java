package com.vivekjava;

import java.util.Scanner;

public class ArrayFormBiigerNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((s[j] + s[i]).compareTo(s[i] + s[j]) > 0) {
                        String temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
            t--;
        }
    }
}

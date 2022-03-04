package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = 121;
        boolean value = simplePalindrome(x);
        System.out.printf("CASE x=%d = %b", x, value);
        System.out.println();

        x = -121;
        value = simplePalindrome(x);
        System.out.printf("CASE x=%d = %b", x, value);
        System.out.println();

        x = 1221;
        value = simplePalindrome(x);
        System.out.printf("CASE x=%d = %b", x, value);
        System.out.println();

        x = 0;
        value = simplePalindrome(x);
        System.out.printf("CASE x=%d = %b", x, value);
        System.out.println();
    }

    public static boolean simplePalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while (temp != 0) {
            int rem = temp % 10;
            temp = temp / 10;
            rev = (rev * 10) + rem;
        }

        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }

}

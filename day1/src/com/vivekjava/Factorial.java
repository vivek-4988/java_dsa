package com.vivekjava;

public class Factorial {

    public static void main(String[] args) {
        System.out.print(factorial(-3));
    }

    //factorial function
    static Integer factorial(int n) {
        if (n < 0) {
            //no negative numbers for factorial
            return 0;
        }
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

}

package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here
        anyBaseToDecimal();
        DecimalToanyBase();
    }

    private static void DecimalToanyBase() {
        int value = 238;
        int sb = 5;
        int sum = 0;
        int multiplier = 1;

        while (value != 0) {
            int rem = value % sb;
            value = value / sb;
            sum = sum + (rem * multiplier);
            multiplier = multiplier * 10;
        }
        System.out.println(sum);
    }

    private static void anyBaseToDecimal() {
        int value = 1423;
        int sb = 5;
        int sum = 0;
        int multiplier = 1;

        while (value != 0) {
            int rem = value % 10;
            value = value / 10;
            sum = sum + (rem * multiplier);
            multiplier = multiplier * sb;
        }
        System.out.println(sum);
    }
}

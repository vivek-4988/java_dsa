package com.vivekjava;

public class MyStrings {
    public static void main(String[] args) {
        prePostIncrement();
    }

    static void prePostIncrement() {
        System.out.println("===================PRE POST INCREMENT=======================");
        int a = 10;
        int b = 5;

        System.out.println("A value before a++ = " + a);
        b = a++; // this will assign b value to 10 and then made a + 1
        System.out.println("b = "+b);
        System.out.println("A value after a++ = " + a);


        System.out.println("A value before ++a = " + a);
        b = ++a; // this will assign b value , after adding a+1
        System.out.println("b = "+b);
        System.out.println("A value after ++a = " + a);
        System.out.println("===================PRE POST DECREMENT=======================");
        a = 10; //reassign
        //for minus
        System.out.println("A value before a-- = " + a);
        b = a--; // this will assign b value to 10 and then made a + 1
        System.out.println("b = "+b);
        System.out.println("A value after a-- = " + a);


        System.out.println("A value before --a = " + a);
        b = --a; // this will assign b value , after adding a+1
        System.out.println("b = "+b);
        System.out.println("A value after --a = " + a);



    }

    static void reverseString() {
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}



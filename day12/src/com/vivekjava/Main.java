package com.vivekjava;

import java.util.*;
public class Main {
    /*
    * TODO PROBLEM
    *
    Given a number N (denoting one of the legs of the triangle),
    Print its Pythagoras pair in increasing order if they exist.
    Otherwise, print "-1".
    * */
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

        if(n>=1000000000){
            System.out.print("-1");
        }else if (n<=2){
            System.out.print("-1");
        }else if (n%2 == 0) {

            long a = (n/2)*(n/2)-1;
            long b = (n/2)*(n/2)+1;

            System.out.print(a+" "+b);

        }else {
            long a = ((n * n - 1) / 2);
            long b = ((n * n + 1) / 2);

            System.out.print(a+" "+b);

        }
    }
}
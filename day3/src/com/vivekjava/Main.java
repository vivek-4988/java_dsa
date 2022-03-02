package com.vivekjava;


import java.util.Scanner;

/*
 * TODO for bit manipulations
 * */
public class Main {


    public static void main(String[] args) {
        getBit();
        clearBit();
        updateBit();
    }

    //convert 0 to 1 and 1 to 0
    //todo update or set bit
    private static void updateBit() {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper =1 set
        //oper = 0 clear
        int n = 5;//0101
        int pos = 1;
        if (oper == 1) {
            //set
            int bitMask = 1 << pos;
            System.out.println(bitMask | n);
        }else{
            //update
            int bitMask = 1 << pos;
            System.out.println(~bitMask & n);
        }


    }

    private static void clearBit() {
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1 << pos;

        System.out.println((bitMask & n));
        System.out.println((~bitMask & n));

    }

    //get 3rd bit(pos == 2) of n (n=0101)
    static void getBit() {
        //1. position works here from Right to left
        //bitmask : 1 << i
        //Opearion : AND

        int n = 5;//0101
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was 0 ");
        } else {
            System.out.println("bit 1");
        }

    }
}

package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        p3(5);

    }

    //Hourglass
    public static void p4(int n) {
        int myLenth = 2 * n + 1;
        int nst = myLenth;
        int space = 0;
        for (int i = 1; i <= myLenth; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            if (i <= myLenth / 2) {
                nst -= 2;
                space++;
            } else {
                nst += 2;
                space--;
            }

        }
    }


    //inverted hourglass
    public static void p3(int n) {
        int myLenth = 2 * n + 1;
        int nst = 0;
        int space = myLenth - 2;
        int secVal = n;
        for (int i = 1; i <= myLenth; i++) {
            int myN = n;
            for (int j = 0; j <= nst; j++) {
                System.out.print(myN+" ");
                myN--;
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }


            myN = secVal;
            //nst - 1 is to print 1 less column
            for (int j = 0; j <= (j == n ? nst - 1 : nst); j++) {
                System.out.print(myN+" ");
                myN++;
            }


            System.out.println();
            if (i <= myLenth / 2) {
                nst += 1;
                space -= 2;
                if (i != n) {
                    secVal--;
                }
            } else {
                nst -= 1;
                space += 2;
                if (i != n + 1) {
                    secVal++;
                }
            }
        }
    }

}

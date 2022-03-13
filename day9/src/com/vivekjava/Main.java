package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        p1(5);
        // p2(5);
        //p3(5);
        p4(10);
    }

    public static void p4(int n) {
        int nsp = n;
        int nst = 1;
        int my0Index = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            int printN = nsp;
            for (int j = 1; j <= nst; j++) {
                if (my0Index == j) {
                    System.out.print(" 0 ");
                } else {
                    System.out.printf(" %d ", printN);
                    if (j < nst / 2) {
                        printN++;
                    } else {
                        if (j != nst / 2) {
                            printN--;
                        }
                    }
                }
            }

            System.out.println();
            nsp--;
            nst += 2;
            my0Index++;
        }

    }


    public static void p3(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= nst; j++) {
                if (j == 1 || j == nst) {
                    System.out.printf(" %d ", i);
                } else {
                    System.out.print(" 0 ");
                }
            }

            System.out.println();
            nsp--;
            nst += 2;
        }

    }

    public static void p2(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= nst; j++) {
                if (j % 2 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ! ");
                }
            }

            System.out.println();
            nsp--;
            nst += 2;
        }

    }

    public static void p1(int n) {
        int firstIndex = 1;
        int lastIndex = n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == firstIndex || j == lastIndex) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
            lastIndex--;
            firstIndex++;
        }
    }
}

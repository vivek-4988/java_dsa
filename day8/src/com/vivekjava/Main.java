package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        p5(5);
    }

    public static void p5(int n) {
        int val = 1;
        int nst = 1;
        int nsp = n - 1;
        int nr = 2 * n - 1;
        for (int i = 1; i <= nr ; i++) {
            for (int j = 1; j <= nst; j++) {
                if (j % 2 != 0) {
                    System.out.printf(" %d ", val);
                } else {
                    System.out.print(" * ");
                }
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }
            System.out.println();
            if (i < (2 * n) / 2) {
                nst += 2;
            } else {
                nst -= 2;
            }

            if (val >= nr / 2 + 1) {
                val--;
            } else {
                val++;
            }
        }
    }


    public static void p4(int n) {
        int number = 1;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1 incremented and reversr from
            for (int j = 1; j <= nst; j++) {
                System.out.printf(" %d ", number);
                if (j <= nst / 2) {
                    number++;
                } else {
                    number--;
                }
            }

            System.out.println();
            nsp--;
            nst += 2;
            number = 1;

        }
    }

    public static void p3(int n) {
        int number = 1;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.printf("%d\t", number);
                number++;
            }

            System.out.println();
            nsp--;
            nst += 2;

        }
    }

    public static void p2(int n) {
        int number = 1;
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.printf(" %d ", number);
            }

            System.out.println();
            nsp--;
            nst += 2;
            number++;

        }
    }

    public static void p1(int n) {
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

            //number 1
            for (int j = 1; j <= nst; j++) {
                System.out.print(" 1 ");
            }

            System.out.println();
            nsp--;
            nst += 2;

        }
    }

}

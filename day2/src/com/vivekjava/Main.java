package com.vivekjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        //sprialOrderMatrix();

        //searchAndPrint2Darray();

        //todo transpose also added
        //first2Darray();
    }

    private static void sprialOrderMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();

        System.out.println("Enter columns");
        int coloumns = sc.nextInt();

        int[][] numbers = new int[rows][coloumns];

        System.out.println("Enter Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral order");
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = coloumns - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(numbers[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(numbers[row][colEnd] + " ");
            }
            colEnd--;

            //3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(numbers[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(numbers[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }

    }

    private static void searchAndPrint2Darray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();

        System.out.println("Enter columns");
        int coloumns = sc.nextInt();

        int[][] numbers = new int[rows][coloumns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Search number");
        int x = sc.nextInt();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                if (numbers[i][j] == x) {
                    System.out.printf("numbers[%d][%d]", i, j);
                }
            }
        }

    }


    /* also transpose added */
    private static void first2Darray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();

        System.out.println("Enter columns");
        int coloumns = sc.nextInt();

        int[][] numbers = new int[rows][coloumns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("& The transpose is : ");
        //To print transpose
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < coloumns; i++) {
//                System.out.print(numbers[i][j]+" ");
                System.out.printf("numbers[%d][%d]=" + numbers[i][j] + " ", i, j);
            }
            System.out.println();
        }

    }
}

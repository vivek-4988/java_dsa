package com.vivekjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader bi = new BufferedReader(
                    new InputStreamReader(System.in));
            String[] strAr = bi.readLine().split(" ");
            int n = 0;
            int m = 0;

            for (int i = 0; i <= strAr.length; i++) {
                if (i == 0) {
                    n = Integer.parseInt(strAr[0]);
                }
                if (i == 1) {
                    m = Integer.parseInt(strAr[1]);
                }
            }

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int target = sc.nextInt();

            System.out.println(search2dBinary(matrix, target));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean search2dBinary(int[][] matrix, int target) {

        int r = matrix.length;
        if (r == 0) return false;
        int c = matrix[0].length;

        int lo = 0;
        int high = (r * c) - 1;

        while (lo <= high) {
            int mid = (lo + (high - lo) / 2);
            int midEle = matrix[mid / c][mid % c];
            if (midEle == target) {
                return true;
            } else if (midEle < target) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    static void findItem2dMatrix() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] x = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int find = sc.nextInt();

        int getx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (x[i][j] == find) {
                    getx = 1;
                    break;
                }
            }
        }
        System.out.println(getx);
    }

}

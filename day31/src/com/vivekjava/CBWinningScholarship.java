package com.vivekjava;

import java.util.Scanner;

public class CBWinningScholarship {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(),
                m = cin.nextInt(),//total discount
                x = cin.nextInt(),//100% discount
                y = cin.nextInt();//pay with discount amount

        int si = 1, li = n, ans = 0;
        while (si <= li) {
            int mid = (si + li) / 2;
            if (check(mid, n, m, x, y)) {
                si = mid + 1;
                ans = mid;
            } else {
                li = mid - 1;
            }
        }
        System.out.print(ans);
    }

    static boolean check(int z, int n, int m, int x, int y) {
        return z * x <= m + (n - z) * y;
    }

}

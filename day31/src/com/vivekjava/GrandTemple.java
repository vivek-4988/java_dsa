package com.vivekjava;

import java.util.Scanner;

public class GrandTemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int [n];
        int [] y = new int [n];

        for(int i = 0 ; i<n ; i++)
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        x = MergeSort( x , 0 , n-1);
        y = MergeSort( y , 0 , n-1);
        long ans = 0;
        long maxbreadth=0;


        for(int j = 0 ; j<n-1 ; j++)
        {

            maxbreadth =Math.max( (y[j+1] - y[j]) - 1,maxbreadth);


        }
        long area = 0;
        for(int i=0;i<n-1;i++){
            long length = (x[i+1] - x[i]) - 1;
            if( length > 0 && maxbreadth > 0)
                area = length * maxbreadth ;

            if( area > ans )
            {
                ans = area;
            }
        }

        System.out.println(ans);
    }

    public static int[] MTSA (int [] arr , int [] brr)
    {
        int [] res = new int [arr.length + brr.length];
        int i = 0 , j = 0 , k=0;
        while (i<arr.length && j<brr.length)
        {
            if(arr[i]<=brr[j])
            {
                res[k] = arr[i];
                i++;
            }
            else
            {
                res[k] = brr[j];
                j++;
            }
            k++;
        }

        if(i == arr.length )
        {
            while (j < brr.length)
            {
                res[k] = brr[j];
                j++;
                k++;
            }
        }
        else if(j == brr.length )
        {
            while (i < arr.length)
            {
                res[k] = arr[i];
                i++;
                k++;
            }
        }

        return res;
    }

    public static int [] MergeSort(int [] arr , int lo , int hi)
    {

        if(lo == hi)
        {
            int [] br = new int [1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo + hi)/2 ;
        int [] fh =  MergeSort(arr,lo,mid);
        int [] sh =  MergeSort(arr,mid+1,hi);
        int [] result = MTSA(fh,sh);

        return result;
    }
}

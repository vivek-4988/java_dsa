package com.vivekjava;

public class Main {

//    static int[] arr = {3,1,4,8,7,2,5};//7
//    static int[] arr = {5,2,6,1,4};//4
    static int[] arr = {3,2,5,6,1,8};//4


    public static void main(String[] args) {
        System.out.println(maxProfitLt());
    }

    public static int maxProfitLt(){
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            minSoFar = Integer.min(minSoFar,arr[i]);
            int tempProfit = arr[i] - minSoFar;
            maxProfit = Integer.max(maxProfit,tempProfit);
        }

        return maxProfit;

    }

    public static int myBf(){
        int profit = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] > arr[i]){
                    int tempProfit = arr[j] - arr[i];
                    if (tempProfit > profit){
                        profit = tempProfit;
                    }
                }
            }
        }

        return profit;

    }

}

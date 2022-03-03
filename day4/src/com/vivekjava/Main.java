package com.vivekjava;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 1, 2};
        // write your code here
        //simpleSwap();
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;

        }
        System.out.println("==== SELECTION SORT =====");
        printArray(arr);
        System.out.println("==== SELECTION SORT =====");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("==== SELECTION SORT =====");
        printArray(arr);
        System.out.println("==== SELECTION SORT =====");

    }

    private static void simpleSwap() {
        int a = 10;
        int b = 3;

        System.out.printf("REAL : a=%d & b=%d", a, b);

        int temp = b;
        b = a;
        a = temp;
        System.out.println();
        System.out.printf("SWAPPED : a=%d & b=%d", a, b);

    }

    private static void bubbleSort(int[] arr) {
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("====BUBBLE SORT=====");
        printArray(arr);
        System.out.println("====BUBBLE SORT=====");
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}

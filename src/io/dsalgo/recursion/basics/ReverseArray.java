package io.dsalgo.recursion.basics;

import java.util.Arrays;

public class ReverseArray {
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    // using single parameter with int[]arr
    public static void reverse(int[] arr, int i){
        if(i >= arr.length/2) return;

        swap(arr, i, arr.length-i-1);

        reverse(arr, i+1); // Here, do not use i++, because i++ means i is passed as its original value before incrementing, which causes incorrect recursion
    }

    // using two parameters with int[]arr
    public static void reverse(int[] arr, int i, int j){
        if(i >= j) return;

        swap(arr, i, j);

        reverse(arr, i+1, j-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int[] arr2 = {5, 6, 7, 8, 9, 10};
        reverse(arr2, 0, arr2.length-1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
    }
}

package io.dsalgo.recursion.basics;

import java.util.ArrayList;

// Program to Print all the Subsequence
public class SubsequenceBasic {
    public static void print(int i, ArrayList<Integer> li, int[] arr, int n){
        if(i >= n) {
            System.out.println(li);
            return;
        }
        li.add(arr[i]);
        print(i + 1, li, arr, n);
        li.remove((Integer) arr[i]);
        print(i+1, li, arr, n);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        print(0, list, arr, arr.length);
    }
}

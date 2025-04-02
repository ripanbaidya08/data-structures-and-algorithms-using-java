package io.dsalgo.recursion.basics;

import java.util.ArrayList;

public class PrintingAllSubsequencesGivenSumK {
    private static void print(int i, ArrayList<Integer> li, int sum, int[] arr, int k, int n){
        if(i == n) {
            if(sum == k){
                System.out.println(li);
                return;
            }
            return;
        }
        li.add(arr[i]);
        sum += arr[i];

        print(i+1, li, sum, arr, k, n);

        li.remove((Integer) arr[i]);
        sum -= arr[i];

        print(i+1, li, sum, arr, k, n);
    }
    public static void main(String[] args) {
        int k = 6;
        int[] arr = {17, 18, 6, 11, 2, 4};
        ArrayList<Integer> li = new ArrayList<>();

        print(0, li, 0, arr, k, arr.length);
    }
}

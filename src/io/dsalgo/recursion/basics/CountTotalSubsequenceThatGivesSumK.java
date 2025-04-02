package io.dsalgo.recursion.basics;

import java.util.ArrayList;

public class CountTotalSubsequenceThatGivesSumK {
    private static int print(int i, ArrayList<Integer> li, int sum, int[] arr, int k, int n){
        if(i == n) {
            if(sum == k){
                return 1;
            }
            return 0;
        }
        li.add(arr[i]);
        sum += arr[i];

        int l = print(i + 1, li, sum, arr, k, n);
        li.remove((Integer) arr[i]);
        sum -= arr[i];
        int r = print(i + 1, li, sum, arr, k, n);

        return l + r;
    }
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1, 2, 1, 1};
        ArrayList<Integer> li = new ArrayList<>();

        System.out.println(print(0, li, 0, arr, k, arr.length));
    }
}

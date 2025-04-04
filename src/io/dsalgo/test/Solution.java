package io.dsalgo.test;

import java.util.HashMap;

public class Solution{
    static int maxLen(int arr[]) {
        int n = arr.length;
        int maxi = 0, sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>(); // <prefixSum, index>

        for(int i = 0; i < n; i ++){
            sum += arr[i];

            if(sum == 0){
                maxi = i + 1;
            } else {
                if(mp.containsKey(sum)){
                    maxi = Math.max(i - mp.get(sum), maxi);
                } else {
                    mp.put(sum, i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, -2, 3, -3};

        System.out.println(maxLen(arr));
    }
}

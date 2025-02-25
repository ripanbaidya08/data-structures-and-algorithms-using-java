package io.dsalgo.array.problems.easy;
/*  two sum - it has two variety, 1-> return yes or no, 2-> return the indexes.
*   brute - using two loop
*   better - using hashmap: most optimal for variety 2
*   optimal - using two pointer: this is optimal for variety 1
*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumBetter(int[] arr, int sum) {
        int[] ans = new int[2];
        int currentValue = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < arr.length; i ++){
            currentValue = arr[i];
            int remaining = sum - currentValue;

            if(mpp.containsKey(remaining)){
                ans[0] = mpp.get(remaining);
                ans[1] = i;
            }
            mpp.put(currentValue, i);
        }
        return ans;
    }

    public static String twoSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int left =0, right = arr.length-1;
        while(left <= right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == sum)
                return "YES";
            else if(currentSum > sum)
                right --;
            else
                left ++;
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 50;

//        int[] ans = twoSumBetter(arr, target);
//        System.out.println(Arrays.toString(ans));

        String result = twoSum(arr, target);
        System.out.println(result);
    }
}

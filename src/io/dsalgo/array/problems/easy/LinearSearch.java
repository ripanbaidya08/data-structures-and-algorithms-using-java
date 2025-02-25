package io.dsalgo.array.problems.easy;

public class LinearSearch {
    public static boolean isFound(int[] arr, int target){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == target) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 64, 9, 4};
        int target = 9;

        System.out.println(isFound(arr, target));
    }
}

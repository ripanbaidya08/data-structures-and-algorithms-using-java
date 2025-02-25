package io.dsalgo.searching;

import java.util.Arrays;

public class LinearSearch {
    private static boolean linearSearch(int[] arr, int target){

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2, 43, 23, 53, 223, 53, 6};
        int target = 43;

        System.out.println(Arrays.toString(arr));

        System.out.println(linearSearch(arr, target) ? "element "+target+" found" : "element "+target+" not found") ;
    }
}

package io.dsalgo.array.problems.easy;
// remove duplicates and return the number of unique elements.
// leetcode 26

public class RemoveDuplicates {

    private static int removeDuplicated(int[] arr){
       int i = 0 ; // the first element in an array as itself is a unique element.

        /**
         * start iterating from the second element in the array,
         * I am looking for the element which is unique.
         */
       for(int j = 1 ; j < arr.length ; j ++){
           if(arr[i] != arr[j]){
               // whatever my first element was, if it is different from its next element
               i ++; // increment the count, to give the position of next element just after the first element
               arr[i] = arr[j];
           }
       }
       // time: O(n), space: O(1)
       return (i+1); // since 0 based indexing, Increment +1 while returning the answer
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 2, 3, 3, 3, 5};

        System.out.println(removeDuplicated(arr));
    }
}

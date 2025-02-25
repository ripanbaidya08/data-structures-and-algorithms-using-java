package io.dsalgo.array.problems.easy;

public class LargestAndSmallestElement {

    public static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestElement(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 24, 3, 295, 342, 34 };

        int smallest = smallestElement(arr);
        int largest = largestElement(arr);

        System.out.println(smallest);
        System.out.println(largest);
    }
}

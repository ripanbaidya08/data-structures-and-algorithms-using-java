package io.dsalgo.recursion.basics;

public class PrintAllArrayElements {
    private static void print(int[] arr, int index){
        if(index == arr.length) return;
        System.out.print(arr[index]+" ");
        print(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {14,33, 5, 93, 54};

        print(arr, 0);

    }
}

package io.dsalgo.array.implementation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasics {
    /**
     * Declaration
     * int[] arr = {1, 2, 3, 4, 5};
     * int[] arr = new int[5]; // we can mention the size
     * int[] arr = new int[]{1, 2, 3, 4, 5};
     *
     * Access
     * System.out.println(arr[0]);
     *
     * Update
     * arr[0] = 10;
     *
     * Print entire array shortcut
     * System.out.println(Arrays.toString(arr));
     *
     * Length
     * int size = arr.length;
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("size: "+arr.length);
        System.out.println("first element: "+arr[0]);

        arr[0] = 20; // update the first element from 1 to 20
        System.out.println("first element: "+arr[0]);

        System.out.println(Arrays.toString(arr)); // print entire array.

        // print array element using loop
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+" ");
        }
    }
}

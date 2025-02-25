package io.dsalgo.array.problems.easy;

import java.util.ArrayList;

/**
 * Find the union of two sorted arrays
 * Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
 * Output: 1 2 3 4 5 6 7
 */
public class FindUnion {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        // union of two arrays
        ArrayList<Integer> union = new ArrayList<>();

        while(i < n1 && j < n2){
            if(a[i] <=  b[j]){
                // checking if the union array is empty then directly add. or if the last element is not equal to the current element
                if(union.isEmpty() || union.getLast() != a[i]){
                    union.add(a[i]);
                }
                i ++; // whatever the case increases the i'th index
            } else{
                if(union.isEmpty() || union.getLast() != b[j]){
                    union.add(b[j]);
                }
                j ++;
            }
        }

        // if an element exists in the first array
        while(i < n1){
            if(union.isEmpty() || union.getLast() != a[i]){
                union.add(a[i]);
            }
            i ++;
        }
        // if an element exists in the second array
        while(j < n2){
            if(union.isEmpty() || union.getLast() != b[j]){
                union.add(b[j]);
            }
            j ++;
        }
        return union;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        ArrayList<Integer> union = findUnion(a, b);
        System.out.println(union);
    }
}

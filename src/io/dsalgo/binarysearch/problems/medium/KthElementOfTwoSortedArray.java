package io.dsalgo.binarysearch.problems.medium;

// gfg practice
class KthElementOfTwoSortedArray {
    // tc: O(2n), sc: (m+n) where m and n are the sizes array of a and b
    public static int[] merge(int[] a, int[] b){
        int m = a.length, n = b.length;
        int[] merge = new int[m+n]; // store the merged array
        
        int i = 0, j = 0, k = 0;
        m = m - 1;
        n = n - 1;
        
        while(i <= m && j <= n){
            if(a[i] <= b[j]){
                merge[k++] = a[i];
                i ++;
            } else {
                merge[k++] = b[j];
                j ++;
            }
        }
        // elements exist in a
        while(i <= m){
            merge[k++] = a[i];
            i ++;
        } 
        // elements exist in b
        while(j <= n){
            merge[k++] = b[j];
            j ++;
        }
        return merge;
    }
    
    public static int kthElement(int a[], int b[], int k) {
        int[] merge = merge(a, b);
       
        return merge[k-1]; // return the kth element, which is the (k-1)th index
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9 };
        int[] b = {1, 4, 8, 10};
        int k = 5;

        System.out.println(kthElement(a, b, k));
    }
}
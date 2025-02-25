package io.dsalgo.stack.problems.medium;

// Number of greater Elements to the right
public class NumberOfGreaterElementToRight {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        int[] res = new int[queries];

        for(int i = 0; i < queries; i ++){ // indices
            int count = 0;
            int val = arr[indices[i]];
            for(int j = indices[i]; j < N; j ++){
                if(arr[j] > val) count ++;
            }
            res[i] = count;
        }
        return res;
    }

}

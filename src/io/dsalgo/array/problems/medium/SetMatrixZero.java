package io.dsalgo.array.problems.medium;

// leetcode 73

import java.util.HashSet;

public class SetMatrixZero {

    public static void setZero(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(arr[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // for all the rows set the column 0
        for(int i = 0; i < n; i ++){
            if(rows.contains(i) == false){
                continue;
            }
            for(int j = 0; j < m; j ++){
                arr[i][j] = 0;
            }
        }
        // for all the columns set the row 0
        for(int j = 0; j < m; j ++){
            if(cols.contains(j) == false){
                continue;
            }
            for(int i = 0; i < n; i ++){
                arr[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };


    }
}

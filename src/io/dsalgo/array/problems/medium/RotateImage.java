package io.dsalgo.array.problems.medium;

// leetcode 48

public class RotateImage {

    public static int[][] rotate90DegreeClockwiseBrute(int[][] matrix, int n) {
        int[][] ans = new int[n][n];
        System.out.println();
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        // time: O(n^2), space: O(n^2) -> we have to optimize the space
        return ans;
    }

    private static void displayMatrix(int[][] matrix, int n) {
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate90DegreeClockwiseOptimal(int[][] matrix, int n) {
        // 1. tranpose the matrix, dont take any other matrix.
        for(int i=0; i <= n-1; i ++){
            for(int j=i; j <= n-1; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 2. reverse each row of matrix
        for(int i=0; i < n; i ++){
            for (int j = 0; j <= n/2 ;j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        // time: O(n^2), space: O(1)
    }

    public static void main(String[] args) {

        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; // n*n
        int n = matrix.length;

//        int[][] rotated = rotate90DegreeClockwiseBrute(matrix, n);
//        displayMatrix(rotated, n);

        rotate90DegreeClockwiseOptimal(matrix, n);
        displayMatrix(matrix, n);
    }
}

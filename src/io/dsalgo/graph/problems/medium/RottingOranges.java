package io.dsalgo.graph.problems.medium;

import java.util.LinkedList;
import java.util.Queue;
// 994. Rotting Oranges
class RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[] > queue = new LinkedList<>();
        int freshOranges = 0;
        
        // Initialize the queue with all rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges ++;
                }
            }
        }
        
        // If there are no fresh oranges, no time is needed
        if (freshOranges == 0) return 0;
        
        int minutes = 0;

        /* 
                (r-1, c)
                    |
        (r, c-1) -- x -- (r, c+1)
                    |
                (r+1, c)
        
        * x -> grid[i][j]  
        * row and column directions - Up, Right, Down, Left
        */        
        int[] dirRow = {-1, 0, 1, 0}; 
        int[] dirCol = {0, 1, 0, -1};
        
        // Perform BFS to rot adjacent oranges
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                
                for (int j = 0; j < 4; j++) {
                    int x = current[0] + dirRow[j];
                    int y = current[1] + dirCol[j];
                    
                    // Check if the adjacent cell is within bounds and has a fresh orange
                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] != 1) {
                        continue;
                    }
                    
                    // Rot the fresh orange
                    grid[x][y] = 2;

                    queue.offer(new int[]{x, y});
                    freshOranges--;
                }
            }
            
            // Increment the time after processing each level
            if (!queue.isEmpty()) {
                minutes++;
            }
        }
        
        // If no fresh oranges are left, return the time, else return -1
        // time & space == O(rows×cols) 
        return freshOranges == 0 ? minutes : -1;
    }
}
package io.dsalgo.graph.problems.medium;

// 547. Number of Provinces
class NumberOfProvinces {
    public void dfs(int i, int n, int[][] isConnected, boolean[] visited){
        visited[i] = true;
        for(int j = 0; j < n; j ++){
            if(!visited[j] && isConnected[i][j] == 1) {
                dfs(j, n, isConnected, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i ++){
            if(!visited[i]){
                dfs(i, n, isConnected, visited);
                ans ++;
            }
        }
        return ans; // no of provinces
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};

        NumberOfProvinces obj = new NumberOfProvinces();
        System.out.println(obj.findCircleNum(isConnected));
    }
}
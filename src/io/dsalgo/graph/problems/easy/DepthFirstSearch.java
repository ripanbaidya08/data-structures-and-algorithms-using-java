package io.dsalgo.graph.problems.easy;

import java.util.ArrayList;

public class DepthFirstSearch {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> ans = new ArrayList<>();

    public void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[i] = true;
        ans.add(i);

        for(int val : adj.get(i)){
            if(visited[val] == false){
                dfs(val, adj, visited);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V]; // no of vertex or nodes

        dfs(0, adj, visited);
        return ans;
    }
}

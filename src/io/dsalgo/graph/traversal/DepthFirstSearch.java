package io.dsalgo.graph.traversal;

import java.util.ArrayList;

public class DepthFirstSearch {
    ArrayList<Integer> dfs = new ArrayList<>();

    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[node] = true;
        dfs.add(node);

        for(int val : adj.get(node)){
            if(!visited[val]){
                dfs(val, adj, visited);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V]; // no of vertex or nodes
        int start = 0; // starting node

        dfs(start, adj, visited);

        return dfs;
    }
}

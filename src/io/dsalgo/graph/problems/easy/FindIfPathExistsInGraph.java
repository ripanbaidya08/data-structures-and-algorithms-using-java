package io.dsalgo.graph.problems.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 1971. Find if Path Exists in Graph
class FindIfPathExistsInGraph {
    // time: O(V + E), space: O(V + E)
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        ArrayList<Integer>[] adj = new ArrayList[n]; // adjacency list
        
        // convert 2D arr to adjacency list
        for(int i = 0; i < n; i ++){
            adj[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < edges.length; i ++){
            int ui = edges[i][0];
            int vi = edges[i][1];
            adj[ui].add(vi);
            adj[vi].add(ui); // since bi-directional
        }

        // we can apply dfs or bfs to check the existance of path
        boolean[] visited = new boolean[n]; // all false
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(source);
        visited[source] = true;

        while(!q.isEmpty()){
            int front = q.poll();
            
            for(int node : adj[front]){
                if(visited[node] == false){
                    q.offer(node);
                    visited[node] = true;

                    if(node == destination){
                        return true; // path exist
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0, 1}, {2, 3}};
        int source = 0;
        int destination = 3;

        FindIfPathExistsInGraph obj = new FindIfPathExistsInGraph();
        System.out.println(obj.validPath(n, edges, source, destination));
    }
}
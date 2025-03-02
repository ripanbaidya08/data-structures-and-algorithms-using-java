package io.dsalgo.graph.problems.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean[] visited = new boolean[V]; // no of vertex or nodes
        Queue<Integer> q = new LinkedList<>();

        bfs.add(0); // add 0'th node
        visited[0] = true;
        q.offer(0);

        while(!q.isEmpty()){
            int frontV = q.poll();

            for(int v : adj.get(frontV)){
                if(visited[v] == false){
                    bfs.add(v); // add 0'th node
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return bfs;
    }
}

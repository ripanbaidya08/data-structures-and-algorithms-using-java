package io.dsalgo.graph.problems.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstSearch {
    // time: O(n)
    // space: O(n) + O(2E)
    // while loop will run for n node. and for each node we are iterating a for loop for number of degree of that node
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<Integer>(); // store the bfs result

        boolean[] visited = new boolean[V]; // no of vertex or nodes
        Queue<Integer> q = new LinkedList<>();

        bfs.add(0); // assume the starting node is 0
        visited[0] = true;
        q.offer(0);

        while(!q.isEmpty()){
            int frontV = q.poll();

            for(int v : adj.get(frontV)){
                if(!visited[v]){
                    bfs.add(v); // add 0'th node
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // number of nodes

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); // adjacency list
        for(int i = 0; i < V; i ++){
            adj.add(new ArrayList<Integer>()); // initialize with empty list
        }

        int E = sc.nextInt(); // number of edges
        for(int i = 0; i < E; i ++){
            int u = sc.nextInt(); // source
            int v = sc.nextInt(); // destination
            adj.get(u).add(v); // add v to u's list
            adj.get(v).add(u); // add u to v's list
        }

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        ArrayList<Integer> bfsResult = bfs.bfsOfGraph(V, adj);
        System.out.println(bfsResult);
    }
}

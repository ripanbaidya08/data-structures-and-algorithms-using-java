package io.dsalgo.graph.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Here, I have Represented ui Graph into three different ways. <br>
 * 1. Using Sets <bvi>
 * 2. Using Adjacency List <br>
 * 3. Using Adjacency Matrix <br>
 *      1-------2
 *      |       |
 *      3 ------4 <br>
 * Here, we have Implement the Graph in such a way so that the node should start with 0.
 */
public class GraphImpl {
    public static void createAdjacencyMatrix(int v, int e, HashSet<Integer> vertices, ArrayList<ArrayList<Integer>> edges) {
        // if edges are there, then will mark that by 1
        int[][] adj = new int[v][v]; // v- Number of vertex

        for(int i = 0; i < e; i ++) {
            int ui = edges.get(i).get(0);
            int vi = edges.get(i).get(1);

            adj[ui][vi] = 1;
            adj[vi][ui] = 1; // remove if it's directed graph
        }

        System.out.println("Graph Representation Using Adjacency Matrix");
        for(int i = 0; i < v; i ++){
            System.out.print(i+" -> ");
            for(int j = 0; j < v; j ++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Representation of Graph Using Adjacency List
    public static void createAdjacencyList(int v, int e, HashSet<Integer> vertices, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<Integer>[] adj = new ArrayList[v]; // adjacency list

        // for each vertex, create an empty list
        for(int i = 0; i < v; i ++){
            adj[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < e; i ++) {
            int ui = edges.get(i).get(0);
            int vi = edges.get(i).get(1);

            adj[ui].add(vi);
            adj[vi].add(ui); // Remove if it's directed graph
        }

        System.out.println("Graph Representation Using Adjacency List : ");
        for(int i = 0; i < v; i ++){
            System.out.println(i+ " -> " + adj[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> vertices = new HashSet<>(); // store nodes {0, 1, 2, 3, 4, .. }
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(); // store edges {{0, 1}, {0, 2}, {0, 3}, {2, 4}, {3, 1} ... }

        System.out.println("Enter number of vertices : ");
        int v = scan.nextInt(); // number of vertices
        System.out.println("Enter vertices : ");
        for(int i = 0; i < v; i ++) {
            int vertex = scan.nextInt();
            vertices.add(vertex);
        }

        System.out.println("Enter number of edges : ");
        int e = scan.nextInt(); // number of edges
        System.out.println("Enter edges : ");
        for(int i = 0; i < e; i ++) {
            ArrayList<Integer> edge = new ArrayList<>(); // store each edge
            int ui = scan.nextInt();
            int vi = scan.nextInt();
            // ui ------------------ vi
            //          | edges
            edge.add(ui);
            edge.add(vi);

            edges.add(edge); // add each edge to edges
        }

//        System.out.println("vertices = " + vertices);
//        System.out.println("edges = " + edges);

//        createAdjacencyList(v, e, vertices, edges);

        createAdjacencyMatrix(v, e, vertices, edges);
    }
}

package io.dsalgo.graph.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/*
    Graph implementation using sets
    1-------2
    |
    3 ------4

 */
public class GraphImpl {
    public static void createAdjacencyMatrix(int v, int e, HashSet<Integer> vertices, ArrayList<ArrayList<Integer>> edges) {
        // if edges are there, then will mark that by 1
        int[][] adj = new int[v][v];

        for(int i = 0; i < e; i ++){
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);

            adj[a][b] = 1;
            adj[b][a] = 1; // remove if it's a directed graph
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
    public static void createAdjacencyList(int v, int e, HashSet<Integer> vertices, ArrayList<ArrayList<Integer>> edges) {
        // Map vertices to array indices
        HashMap<Integer, Integer> vertexToIndex = new HashMap<>();
        int index = 0;
        for (int vertex : vertices) {
            vertexToIndex.put(vertex, index++);
        }
        // create a array of lists to store the adjacency list
        ArrayList<Integer>[] adj = new ArrayList[v]; // adjacency list

        // for each vertex, create an empty list
        for(int i = 0; i < v; i ++){
            adj[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < e; i ++){
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);

            int indexA = vertexToIndex.get(a);
            int indexB = vertexToIndex.get(b);

            adj[indexA].add(indexB);
            adj[indexB].add(indexA); // Remove if it's a directed graph
        }

        System.out.println("Graph Representation Using Adjacency List : ");
        for(int i = 0; i < v; i ++){
            System.out.println(i+ " -> " + adj[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> vertices = new HashSet<>(); // store nodes
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(); // store edges

        System.out.println("Enter number of vertices : ");
        int v = scan.nextInt(); // number of nodes
        System.out.println("Enter vertices : ");
        for(int i = 0; i < v; i ++) {
            int node = scan.nextInt();
            vertices.add(node);
        }

        System.out.println("Enter number of edges : ");
        int e = scan.nextInt(); // number of edges
        System.out.println("Enter edges : ");
        for(int i = 0; i < e; i ++) {
            ArrayList<Integer> edge = new ArrayList<>(); // store each edge
            int a = scan.nextInt();
            int b = scan.nextInt();

            edge.add(a);
            edge.add(b);

            edges.add(edge);
        }

//        System.out.println("vertices = " + vertices);
//        System.out.println("edges = " + edges);

//        createAdjacencyList(v, e, vertices, edges);

        createAdjacencyMatrix(v, e, vertices, edges);
    }
}

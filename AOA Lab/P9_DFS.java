// Write a program to implement DFS.

import java.util.*;
public class P9_DFS {
    private int vertices;
    private ArrayList<LinkedList<Integer>> adjList;

    // Constructor
    P9_DFS(int v) {
        vertices = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Add an edge into the graph (directed)
    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }

    // DFS traversal from a given start node
    void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("Nodes reachable from node " + start + ":");
        DFSUtil(start, visited);
        System.out.println();
    }

    // Utility method for DFS
    private void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of vertices
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        P9_DFS graph = new P9_DFS(v);

        // Number of edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (src dest):");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }

        // Starting node for DFS
        System.out.print("Enter starting node for DFS: ");
        int startNode = sc.nextInt();

        graph.DFS(startNode);
        sc.close();
    }
}

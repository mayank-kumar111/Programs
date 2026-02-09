import java.util.*;

public class P8_ReachableNodesBFS {
    private int vertices;
    private ArrayList<LinkedList<Integer>> adjList;

    // Constructor
    P8_ReachableNodesBFS(int v) {
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

    // BFS traversal from a given start node
    void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("Nodes reachable from node " + start + ":");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of vertices
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        P8_ReachableNodesBFS graph = new P8_ReachableNodesBFS(v);

        // Number of edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (src dest):");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest); // directed graph
        }

        // Starting node
        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        graph.BFS(start);
        sc.close();
    }
}
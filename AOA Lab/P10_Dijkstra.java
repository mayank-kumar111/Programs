import java.util.Scanner;
import java.util.Arrays;

public class P10_Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of nodes
        System.out.print("Enter number of nodes: ");
        int V = sc.nextInt();

        // Get adjacency matrix
        int[][] graph = new int[V][V];
        System.out.println("Enter adjacency matrix (use 0 if no edge):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // Get source node
        System.out.print("Enter source node (0 to " + (V - 1) + "): ");
        int source = sc.nextInt();

        dijkstra(graph, source, V);
    }

    static void dijkstra(int[][] graph, int source, int V) {
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited, V);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < V; i++)
            System.out.println("To node " + i + " is " + dist[i]);
    }

    static int minDistance(int[] dist, boolean[] visited, int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}
// Implement Prim's algorithm to find the Minimum Spanning Tree (MST).
// Take input from the user for the graph as an adjacency matrix.

import java.util.Scanner;

public class UserPrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int[][] graph = new int[V][V];
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = sc.nextInt();

        boolean[] selected = new boolean[V];
        selected[0] = true;
        System.out.println("\nMinimum Spanning Tree:");
        for (int edgeCount = 0; edgeCount < V - 1; edgeCount++) {
            int min = Integer.MAX_VALUE, x = 0, y = 0;
            for (int i = 0; i < V; i++) {
                if (selected[i]) {
                    for (int j = 0; j < V; j++) {
                        if (!selected[j] && graph[i][j] != 0 && graph[i][j] < min) {
                            min = graph[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " : " + graph[x][y]);
            selected[y] = true;
        }
        sc.close();
    }
}
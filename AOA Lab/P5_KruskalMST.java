import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge e) {
        return weight - e.weight;
    }
}

class Subset {
    int parent, rank;
}

public class P5_KruskalMST {
    int V, E;
    Edge[] edges;

    P5_KruskalMST(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
        for (int i = 0; i < E; i++)
            edges[i] = new Edge();
    }

    int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    void union(Subset[] subsets, int x, int y) {
        int xr = find(subsets, x), yr = find(subsets, y);
        if (subsets[xr].rank < subsets[yr].rank)
            subsets[xr].parent = yr;
        else if (subsets[xr].rank > subsets[yr].rank)
            subsets[yr].parent = xr;
        else {
            subsets[yr].parent = xr;
            subsets[xr].rank++;
        }
    }

    void kruskal() {
        Arrays.sort(edges);
        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
        }

        List<Edge> result = new ArrayList<>();
        for (Edge edge : edges) {
            int x = find(subsets, edge.src), y = find(subsets, edge.dest);
            if (x != y) {
                result.add(edge);
                union(subsets, x, y);
                if (result.size() == V - 1)
                    break;
            }
        }

        int cost = 0;
        System.out.println("Edges in MST:");
        for (Edge e : result) {
            System.out.println(e.src + " -- " + e.dest + " == " + e.weight);
            cost += e.weight;
        }
        System.out.println("Total Cost = " + cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vertices: ");
        int V = sc.nextInt();
        System.out.print("Edges: ");
        int E = sc.nextInt();

        P5_KruskalMST g = new P5_KruskalMST(V, E);
        System.out.println("Enter edges (src dest weight):");
        for (int i = 0; i < E; i++) {
            g.edges[i].src = sc.nextInt();
            g.edges[i].dest = sc.nextInt();
            g.edges[i].weight = sc.nextInt();
        }
        g.kruskal();
        sc.close();
    }
}
// Write a program of Breadth First Search (BFS) using queue for a given graph.

#include <stdio.h>
#include <stdlib.h>

int a[20][20], q[20], visited[20], n, i, j, f = -1, r = 0;

void bfs(int v)
{
    q[++r] = v;
    visited[v] = 1;
    while (f <= r)
    {
        for (i = 1; i <= n; i++)
        {
            if (a[v][i] && !visited[i])
            {
                visited[i] = 1;
                q[++r] = i;
            }
        }
        f++;
        v = q[f];
    }
}

int main()
{
    int v;
    printf("Enter the number of vertices:");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        q[i] = 0;
        visited[i] = 0; 
    }
    printf("Enter graph data in matrix form:\n");
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("Eter the starting vertex:");
    scanf("%d", &v);
    bfs(v);
    printf("The node which are reachable are:\n");
    for (i = 1; i <= n; i++)
    {
        if (visited[i])
        {
            printf("%d\t", q[i]);
        }
        else
        {
            printf("Bfs is not possible");
        }
    }
    return 0;
}
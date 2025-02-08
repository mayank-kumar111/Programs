import java.util.*;

// Question:2
//Given a route containing 4 direction (N, S, E, W), find the shortest path to reach the destination.
public class M7_shortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the route: ");
        String route = sc.nextLine();
        System.out.println("Shortest path to reach the destination: " + shortestPath(route));
        sc.close();
    }

    public static double shortestPath(String route) {
        int x = 0, y = 0;
        for (int i = 0; i < route.length(); i++) {
            if (route.charAt(i) == 'N') {
                y++;
            } else if (route.charAt(i) == 'S') {
                y--;
            } else if (route.charAt(i) == 'E') {
                x++;
            } else if (route.charAt(i) == 'W') {
                x--;
            }
        }
        // return Math.abs(x) + Math.abs(y);

        // int X2=x*x;
        // int Y2=y*y;
        // return Math.sqrt(X2+Y2); 

        // return Math.hypot(x, y);

        // return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        return Math.sqrt(x * x + y * y);


    }
}

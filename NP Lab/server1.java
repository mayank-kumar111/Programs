import java.io.*;
import java.net.*;

public class server1 {
    public static void main(String args[]) throws IOException {
        // Create a server socket on port 9090
        ServerSocket serverSocket = new ServerSocket(9090);
        
        // Get server IP address
        String serverIP = InetAddress.getLocalHost().getHostAddress();
        System.out.println("Server is running at " + serverIP + ":9090");
        System.out.println("Waiting for client connection...");

        // Accept incoming client connection
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected from: " + clientSocket.getInetAddress());

        // Setup input and output streams
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // Read message from client
        String message = in.readLine();
        System.out.println("Client says: " + message);

        // Send response to the client
        out.println("Message received by the server.");

        // Close connections
        clientSocket.close();
        serverSocket.close();
    }
}
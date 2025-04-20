import java.io.*;
import java.net.*;

public class client1 {
    public static void main(String args[]) throws IOException {
        // Replace with your server's actual IP address
        String serverIP = "192.168.43.230"; // Use the correct server IP here
        
        System.out.println("Connecting to server at " + serverIP + ":9090");
        
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(serverIP, 12345);
            System.out.println("Connected to server!");
            
            // Setup streams
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send message to the server
            out.println("Hello from client!");

            // Receive response from the server
            String response = in.readLine();
            System.out.println("Server says: " + response);

            // Close the socket
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Error: Unknown host - please check the server IP address");
        } catch (IOException e) {
            System.err.println("Error: Could not connect to server - " + e.getMessage());
        }
    }
}
import java.io.*;
import java.net.*;
import java.time.Instant;

public class Echo_Client_TCP {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String message = "Hello, Server!";
            System.out.println("Sending message: " + message);

            // Measure round trip time
            long startTime = Instant.now().toEpochMilli();

            writer.println(message);
            String response = reader.readLine();

            long endTime = Instant.now().toEpochMilli();
            long rtt = endTime - startTime;

            System.out.println("Server response: " + response);
            System.out.println("Round Trip Time (RTT): " + rtt + " ms");

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
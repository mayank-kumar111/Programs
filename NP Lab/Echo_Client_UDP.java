import java.net.*;
import java.time.Instant;

public class Echo_Client_UDP {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(hostname);
            String message = "Hello, Server!";
            byte[] sendBuffer = message.getBytes();
            byte[] receiveBuffer = new byte[1024];

            System.out.println("Sending message: " + message);

            // Record the start time
            long startTime = Instant.now().toEpochMilli();

            // Send the message
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, port);
            clientSocket.send(sendPacket);

            // Receive the echoed message
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            // Record the end time
            long endTime = Instant.now().toEpochMilli();

            // Calculate RTT
            long rtt = endTime - startTime;

            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + receivedMessage);
            System.out.println("Round Trip Time (RTT): " + rtt + " ms");
        } catch (Exception ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}

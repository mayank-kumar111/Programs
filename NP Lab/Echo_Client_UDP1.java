import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Echo_Client_UDP1 {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 12345;
        String message = "Hello, server!";

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(host);

            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, port);

            long startTime = System.currentTimeMillis(); // Start time for RTT measurement

            // Send message to server
            clientSocket.send(sendPacket);
            System.out.println("Message sent to server: " + message);

            byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);

            // Receive echo from server
            clientSocket.receive(receivePacket);
            long endTime = System.currentTimeMillis(); // End time for RTT measurement

            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + receivedMessage);

            // Calculate and display RTT
            long rtt = endTime - startTime;
            System.out.println("Round-trip time (RTT): " + rtt + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
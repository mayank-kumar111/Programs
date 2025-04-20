import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_remoteServer {
    public static void main(String[] args) {
        try {
            try (DatagramSocket serverSocket = new DatagramSocket(12345)) {
                byte[] receiveBuffer = new byte[1024];

                System.out.println("UDP Server is running...");

                while (true) {
                    // Receive message
                    DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                    serverSocket.receive(receivePacket);

                    String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println("Client says: " + message);

                    // Custom response logic
                    String reply = "Server received: " + message;
                    byte[] sendBuffer = reply.getBytes();

                    // Send response
                    DatagramPacket sendPacket = new DatagramPacket(
                            sendBuffer, sendBuffer.length,
                            receivePacket.getAddress(), receivePacket.getPort());

                    serverSocket.send(sendPacket);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
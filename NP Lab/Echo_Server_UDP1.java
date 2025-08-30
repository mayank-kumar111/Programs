import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Echo_Server_UDP1 {
    public static void main(String[] args) {
        int port = 12345;

        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                byte[] buffer = new byte[1024];
                DatagramPacket requestPacket = new DatagramPacket(buffer, buffer.length);

                // Receive packet from client
                serverSocket.receive(requestPacket);
                String message = new String(requestPacket.getData(), 0, requestPacket.getLength());
                System.out.println("Received from client: " + message);

                // Echo the message back to the client
                DatagramPacket responsePacket = new DatagramPacket(
                        message.getBytes(),
                        message.getBytes().length,
                        requestPacket.getAddress(),
                        requestPacket.getPort()
                );
                serverSocket.send(responsePacket);
                System.out.println("Echoed back to client: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
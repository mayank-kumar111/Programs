import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_server {
   public UDP_server() {
   }

   public static void main(String[] var0) {
      try {
         try (DatagramSocket var1 = new DatagramSocket(12345)) {
            byte[] var2 = new byte[1024];
            System.out.println("UDP Server is running...");

            while (true) {
               DatagramPacket var3;
               String var4;
               do {
                  var3 = new DatagramPacket(var2, var2.length);
                  var1.receive(var3);
                  var4 = new String(var3.getData(), 0, var3.getLength());
                  System.out.println("Received: " + var4);
               } while (!var4.equalsIgnoreCase("Hello Server"));

               String var5 = "Hello Client";
               byte[] var6 = var5.getBytes();
               DatagramPacket var7 = new DatagramPacket(var6, var6.length, var3.getAddress(), var3.getPort());
               var1.send(var7);
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }
}
import java.rmi.Naming;

public class AddClient {
    public static void main(String args[]) {
        try {
            // Lookup for remote object
            IAddServer obj = (IAddServer) Naming.lookup("rmi://localhost/AddServer");

            int result = obj.add(10, 20);
            System.out.println("Sum = " + result);
        } catch (Exception e) {
            System.out.println("AddClient exception: " + e);
        }
    }
}
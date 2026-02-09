import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class AddServer {
    public static void main(String args[]) {
        try {
            // Start registry programmatically (no need for command prompt)
            LocateRegistry.createRegistry(1099);

            AddServerImpl addServer = new AddServerImpl();
            Naming.rebind("AddServer", addServer);

            System.out.println("AddServer is ready...");
        } catch (Exception e) {
            System.out.println("AddServer error: " + e);
            e.printStackTrace();
        }
    }
}

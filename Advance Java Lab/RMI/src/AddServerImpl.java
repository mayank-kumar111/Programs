import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

// Implementation of Remote Interface
public class AddServerImpl extends UnicastRemoteObject implements IAddServer {

    // Constructor
    protected AddServerImpl() throws RemoteException {
        super();
    }

    // Method definition
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
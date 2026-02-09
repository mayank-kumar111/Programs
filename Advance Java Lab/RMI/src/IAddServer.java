
import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote Interface
public interface IAddServer extends Remote {
    public int add(int a, int b) throws RemoteException;
}

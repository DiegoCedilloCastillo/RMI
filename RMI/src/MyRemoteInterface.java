import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    String saludo(String nombre) throws RemoteException;
    MiObjeto serializarObjeto(MiObjeto objeto) throws RemoteException;
}
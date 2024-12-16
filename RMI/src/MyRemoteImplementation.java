import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImplementation extends UnicastRemoteObject implements MyRemoteInterface {

    public MyRemoteImplementation() throws RemoteException {
        super();
    }

    @Override
    public String saludo(String nombre) throws RemoteException {
        return "Hola, " + nombre + "!";
    }

    @Override
    public MiObjeto serializarObjeto(MiObjeto objeto) throws RemoteException {
        return objeto; // Retorna el objeto recibido
    }
}
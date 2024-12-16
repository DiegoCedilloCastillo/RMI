import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            // Crear el RMI Registry en el puerto 1099
            LocateRegistry.createRegistry(1099);

            // Crear una instancia del objeto remoto
            MyRemoteImplementation objRemoto = new MyRemoteImplementation();

            // Registrar el objeto remoto en el RMI Registry
            Naming.rebind("rmi://localhost/Saludo", objRemoto);

            System.out.println("Servidor listo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
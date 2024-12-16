import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Buscar el objeto remoto en el RMI Registry
            MyRemoteInterface remoto = (MyRemoteInterface) Naming.lookup("rmi://localhost/Saludo");

            // Invocar el método remoto
            System.out.println(remoto.saludo("Diego"));

            // Crear y enviar un objeto serializable
            MiObjeto objeto = new MiObjeto("Este es un objeto serializado");
            MiObjeto respuesta = remoto.serializarObjeto(objeto);

            System.out.println("Objeto recibido: " + respuesta.getValor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
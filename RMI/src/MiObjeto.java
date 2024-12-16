import java.io.Serializable;

public class MiObjeto implements Serializable {
    private String valor;

    public MiObjeto(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
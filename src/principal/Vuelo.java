package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JORGE
 * Extendes permite que vuelo herede de Observado
 */
public class Vuelo extends Observado {

    private String codigoDestino;
    private String ultimoSuceso;

    public Vuelo(String codigoDestino) {
        super();
        this.codigoDestino = codigoDestino;
        ultimoSuceso = "";
    }

    public String getUltimoSuceso() {
        return codigoDestino + ":" + ultimoSuceso;
    }

    public void setUltimoSuceso(String ultimoSuceso) {
        this.ultimoSuceso = ultimoSuceso;
        notificarObservadores();
    }
}

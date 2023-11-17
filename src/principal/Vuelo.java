package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JORGE
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

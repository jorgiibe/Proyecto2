package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JORGE
 */
public class Vuelo {

    private String codigoDestino;
    private List<Viajero> viajeros;
    private String ultimoSuceso;

    public Vuelo(String codigoDestino) {
        super();
        this.codigoDestino = codigoDestino;
        viajeros = new ArrayList<Viajero>();
        ultimoSuceso = "";
    }

    public void suscribirObservador(Viajero viajero) {
        viajeros.add(viajero);
    }

    public void eliminarObservador(Viajero viajero) {
        viajeros.remove(viajero);
    }

    public void notificarObservadores() {
        for (Viajero viajero : viajeros) {
            viajero.notificar();
        }
    }

    public String getUltimoSuceso() {
        return codigoDestino + ":" + ultimoSuceso;
    }

    public void setUltimoSuceso(String ultimoSuceso) {
        this.ultimoSuceso = ultimoSuceso;
        notificarObservadores();
    }

}

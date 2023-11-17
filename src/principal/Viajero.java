package principal;

/**
 *
 * @author JORGE
 */
public class Viajero {

    private String nombre;
    private Vuelo vuelo;

    public Viajero(String nombre, Vuelo vuelo) {
        super();
        this.nombre = nombre;
        this.vuelo = vuelo;
    }

    public void notificar() {
        System.out.println(nombre + "<-- Notificar: "
                + vuelo.getUltimoSuceso());
    }

}

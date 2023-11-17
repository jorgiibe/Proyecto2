package principal;

/**
 *
 * @author JORGE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vuelo vuelo = new Vuelo("IB123 destino París");
                
        Viajero andrea = new Viajero("Andrea", vuelo);
        Viajero diego = new Viajero("Diego", vuelo);
        Viajero katty = new Viajero("Katty", vuelo);
        Viajero jorge = new Viajero("Jorge", vuelo);
        Viajero fausto = new Viajero("fausto", vuelo);
        
        vuelo.suscribirObservador(andrea);
        vuelo.suscribirObservador(diego);
        vuelo.suscribirObservador(katty);
        vuelo.suscribirObservador(jorge);
        vuelo.suscribirObservador(fausto);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        vuelo.setUltimoSuceso("Llegada del vuelo.");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        

        vuelo.eliminarObservador(fausto);
        vuelo.eliminarObservador(jorge);
        
        
        System.out.println("-------------------------------------");
        vuelo.setUltimoSuceso("Salida de viajeros");
        System.out.println("-------------------------------------");
    }

}

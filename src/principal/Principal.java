/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Viajero oscar = new Viajero("Oscar", vuelo);
        vuelo.suscribirObservador(oscar);
        Viajero pepe = new Viajero("Pepe", vuelo);
        vuelo.suscribirObservador(pepe);
        vuelo.setUltimoSuceso("Llegada del vuelo.");
        vuelo.eliminarObservador(pepe);
        vuelo.setUltimoSuceso("Salida de viajeros");

    }

}

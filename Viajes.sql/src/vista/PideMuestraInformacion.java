
package vista;

import controlador.Pidiendo;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.InformacionDeLosViajes;
import modelo.Viajero;

public class PideMuestraInformacion {
    
    public Viajero pideInformacion() {
        Scanner teclado = new Scanner(System.in);
        Viajero viaje = new Viajero();
        Pidiendo p = new Pidiendo();
        
        viaje.setNombre(p.pideTexto("Nombre del viajero: "));
        viaje.setEdad(p.pideNumero("Edad del pasajero: "));
        System.out.println("Ha realizado algun viaje:\n\t1. Si\n\t2. no");
        int respuesta = teclado.nextInt();
        if (respuesta == 2) {
            p.println("ok");
        } else if (respuesta == 1) {
            
            InformacionDeLosViajes infoViaje = null;
            ArrayList<InformacionDeLosViajes> viajesRealizados = new ArrayList<>();
            viaje.setViajesRealizados(p.pideNumero("Numero de viajes realizados: "));
            
            for (int i = 0; i < viaje.getViajesRealizados(); i++) {
                infoViaje = new InformacionDeLosViajes();
                
                infoViaje.setDestino(p.pideTexto("Cual fue el destino del viaje: "));
                infoViaje.setTiempo(p.pideNumero("Cuantos dias duro el viaje: "));
                infoViaje.setAcompañante(p.pideNumero("Con quien fuiste al viaje: \n\t1. Familia\n\t2. Amigos\n\t3. Solo\n"));
                infoViaje.setValoracion(p.pideNumero("Cuanta valoracion darias al viaje:\n\tCalifica de 0 a 10. "));
                //Añade los viajes realizados a un ArrayList de viajesRealizados donde ha viajado
                viajesRealizados.add(infoViaje);
            }
            //Añadir el ArrayList al objeto Viaje /= a la Clase Viajero viaje.
            viaje.setArrayInfoViajes(viajesRealizados);
        }
        return viaje;
        
    }
    
        public void muestraInformacionEspa(Viajero viajerito) {
        Pidiendo p = new Pidiendo();
        p.println("\tNombre del viajero " + viajerito.getNombre());
        p.println("\tEdad del viajero " + viajerito.getEdad());
        p.println("\tViajes realizados del viajero " + viajerito.getViajesRealizados());
        if (viajerito.getViajesRealizados() == 0) {
        } else {
            p.println("\t  La informacion de los viajes. " + viajerito.getArrayInfoViajes());
        }
        p.println("");
    }
}

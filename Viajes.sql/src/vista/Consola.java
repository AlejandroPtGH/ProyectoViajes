package vista;

import controlador.Pidiendo;
import java.util.Scanner;
import modelo.Viajero;

public class Consola {

    Pidiendo p = new Pidiendo();

    public int idioma() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("\t.Elige el idioma.");
        System.out.println("   1. Español");
        System.out.println("   2. Ingles");
        System.out.println("   3. Frances");
        System.out.print("  \nIntroduzca una opcion: ");
        return teclado.nextInt();
    }

    public int menuEspañol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("  1. Insertar Usuario.");
        System.out.println("  2. Consultar Usuario.");
        System.out.println("  3. Generar HTML.");
        System.out.println("  4. Salir luego 0.");
        System.out.print("  \nIntroduzca una opcion: ");
        return sc.nextInt();
    }

    public int menuIngles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("  1. Insert user.");
        System.out.println("  2. Consult user.");
        System.out.println("  3. GenGenerar HTMLerate HTML.");
        System.out.println("  4. Get out.");
        System.out.print("  \nIntroduzca una opcion: ");
        return sc.nextInt();
    }

    public int menuFrances() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("  1. Insérer un utilisateur.");
        System.out.println("  2. Consulter l'utilisateur.");
        System.out.println("  3. Générer du HTML.");
        System.out.println("  4. Sortir.");
        System.out.print("  \nIntroduzca una opcion: ");
        return sc.nextInt();
    }
    
    
    
    
    
    
    
    
    
    
    

    public void muestraInformacionFrances(Viajero viajerito) {

        p.println("\tNom du voyageur " + viajerito.getNombre());
        p.println("\tÂge du voyageur " + viajerito.getEdad());
        p.println("\tVoyages effectués par le voyageur " + viajerito.getViajesRealizados());
        if (viajerito.getViajesRealizados() == 0) {
        } else {
            p.println("\t  Informations de voyage. " + viajerito.getArrayInfoViajes());
        }
        p.println("");
    }

    public void muestraInformacionIngles(Viajero viajerito) {

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

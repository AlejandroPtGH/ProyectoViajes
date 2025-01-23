package controlador;

import modelo.Viajero;

import vista.PideMuestraInformacion;

public class MenuOpcionTraducido {

    public void menuEspaniol(int opcionDeLosIdiomas) {
        
        PideMuestraInformacion pmi = new PideMuestraInformacion();
        Viajero v = null;
        do {
            //op = c.menuEspañol();
            if (opcionDeLosIdiomas >= 1 && opcionDeLosIdiomas <= 3) {
                switch (opcionDeLosIdiomas) {
                    case 1:
                        v = pmi.pideInformacion();
                        break;
                    case 2:
                        pmi.muestraInformacionEspa(v);
                        break;
                    case 3:
                        System.out.println("hacer html");
                        break;
                }
            } else if (opcionDeLosIdiomas == 4) {
                System.out.println("Adios, muchas gracias por participar");
            } else {
                System.out.println("\nElija una de las opciones mencionadas");
            }
        } while (opcionDeLosIdiomas != 4);
    }

}

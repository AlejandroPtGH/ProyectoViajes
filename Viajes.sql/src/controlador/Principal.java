package controlador;

import vista.Consola;

public class Principal {
    
    public static void main(String[] args){
        Consola c = new Consola();
        MenuOpcionTraducido mot = new MenuOpcionTraducido();
        int op, opp;
        do {
            op = c.idioma();
            if (op >= 1 && op <= 3) {
                switch (op) {
                    case 1:
                        opp=c.menuEspañol();
                        
                        mot.menuEspaniol(opp);
                        
                        break;
                    case 2:
                        c.menuIngles();
                        
                        break;
                    case 3:
                        c.menuFrances();
                        break;
                }
            } else if (op == 0) {
                System.out.println("Adios, muchas gracias por participar");
            } else {
                System.out.println("\nElija una de las opciones mencionadas");
            }
        } while (op != 0);
    }
    
}

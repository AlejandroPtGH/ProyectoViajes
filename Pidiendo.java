package controlador;

import java.util.Scanner;

public class Pidiendo {

    public String pideTexto(String texto) {
        Scanner t = new Scanner(System.in);
        System.out.print(texto);
        return t.nextLine();
    }

    public int pideNumero(String tex) {
        Scanner t = new Scanner(System.in);
        System.out.print(tex);
        return t.nextInt();
    }

    public void println(String t) {
        System.out.println(t);

    }

}

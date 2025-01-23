
package modelo;

import java.util.ArrayList;

public class Viajero {
    
    private String nombre;
    private int edad;
    private int viajesRealizados;
    private int viajeOno;
    private ArrayList<InformacionDeLosViajes> arrayInfoViajes;
    
    public Viajero(){
        nombre="";
        edad=0;
        viajesRealizados=0;
        viajeOno=0;
    }
    public Viajero(String nombre, int edad, int viajesRealizados, int viajeOno){
        this.nombre=nombre;
        this.edad=edad;
        this.viajesRealizados=viajesRealizados;
        this.viajeOno=viajeOno;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getViajesRealizados() {
        return viajesRealizados;
    }

    public void setViajesRealizados(int viajesRealizados) {
        this.viajesRealizados = viajesRealizados;
    }

    public int getViajeOno() {
        return viajeOno;
    }

    public void setViajeOno(int viajeOno) {
        this.viajeOno = viajeOno;
    }

    public ArrayList<InformacionDeLosViajes> getArrayInfoViajes() {
        return arrayInfoViajes;
    }

    public void setArrayInfoViajes(ArrayList<InformacionDeLosViajes> arrayInfoViajes) {
        this.arrayInfoViajes = arrayInfoViajes;
    }
    
    
}

package modelo;

public class InformacionDeLosViajes {

    private String destino;
    private int tiempo;
    private int acompañante;
    private int valoracion;

    public InformacionDeLosViajes() {
        destino = "";
        tiempo = 0;
        acompañante = 0;
        valoracion = 0;
    }

    public InformacionDeLosViajes(String destino, int tiempo, int acompañante, int valoracion) {
        this.destino = destino;
        this.tiempo = tiempo;
        this.acompañante = acompañante;
        this.valoracion = valoracion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(int acompañante) {
        this.acompañante = acompañante;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

}

package org.wilvertoj.laboratorio.entities;

public class LlamadaLocal extends AbstractLlamada {

    private double precio=0.25;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LlamadaLocal() {
        super();
    }

    public LlamadaLocal(String numeroOrigen, String numeroDestino, double duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

     @Override
    public double calcularPrecio() {
        return this.getDuracion() * this.precio;
    }

    public String toString (){
        return " Llamada Local numero oirgen " + this.getNumeroOrigen() + " numero destino "+this.getNumeroDestino() + " con duracion ".concat(String.valueOf(this.getDuracion()));
    }
}

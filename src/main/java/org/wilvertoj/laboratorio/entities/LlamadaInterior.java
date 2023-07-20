package org.wilvertoj.laboratorio.entities;

public class LlamadaInterior extends AbstractLlamada {

    private double precioUno = 0.20;
    private double precioDos = 0.35;
    private double precioTres = 0.85;
    private int franja;

    public double getPrecioUno() {
        return precioUno;
    }

    public void setPrecioUno(double precioUno) {
        this.precioUno = precioUno;
    }

    public double getPrecioDos() {
        return precioDos;
    }

    public void setPrecioDos(double precioDos) {
        this.precioDos = precioDos;
    }

    public double getPrecioTres() {
        return precioTres;
    }

    public void setPrecioTres(double precioTres) {
        this.precioTres = precioTres;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }


    @Override
    public double calcularPrecio() {
        if(this.franja == 1){
                return this.precioUno * this.getDuracion();
            }else if (this.franja == 2){
                return this.precioDos * this.getDuracion();
            }else if(this.franja == 3){
                return this.precioTres * this.getDuracion();
        }
        return 0;
    }

    public LlamadaInterior() {
        super();
    }

    public LlamadaInterior(String numeroOrigen, String numeroDestino, double duracion, int franja) {
        super(numeroOrigen, numeroDestino, duracion);
        this.franja = franja;
    }

    @Override
    public String toString(){
        return "Llamada Interior numero oirgen " + this.getNumeroOrigen() + " numero destino " + this.getNumeroDestino() + " con duracion ".concat(String.valueOf(this.getDuracion()));
    }

}

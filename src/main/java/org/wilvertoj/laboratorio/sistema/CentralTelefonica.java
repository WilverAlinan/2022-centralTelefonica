package org.wilvertoj.laboratorio.sistema;

import org.wilvertoj.laboratorio.entities.AbstractLlamada;

import java.util.AbstractCollection;

public class CentralTelefonica {

    private int contador;
    private double acumulador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador += contador;
    }

    public double getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(double acumulador) {
        this.acumulador += acumulador;
    }

    public void registrarLlamada(AbstractLlamada registro) {
        System.out.println(registro);
        this.setContador(1);
        this.setAcumulador(registro.calcularPrecio());
    }

    public int getTotalLlamadas(){
        return this.getContador();
    }

    public double getTotalFacturas(){
        return this.getAcumulador();
    }

}

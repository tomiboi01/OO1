package ar.edu.unlp.oo1.ejercicio2.impl;

public class Producto {
    private double peso = 0;
    private double precioPorKilo = 0;
    private String descripcion = "Undefined product";

    public double getPeso() {
        return this.peso;
    }
    public double getPrecio() {
        return this.peso * this.precioPorKilo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecioPorKilo() {
        return precioPorKilo;
    }
    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}

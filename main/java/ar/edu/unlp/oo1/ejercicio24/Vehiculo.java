package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;

public class Vehiculo {
    private String descripcion;
    private int capacidad;
    private int anioFabricacion;
    private double valorMercado;
    private Conductor dueño;


    public Vehiculo(String descripcion, int capacidad, int anioFabricacion, double valorMercado) {
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.anioFabricacion = anioFabricacion;
        this.valorMercado = valorMercado;
    }

    public Conductor getDueño() {
        return dueño;
    }

    public void setDueño(Conductor dueño) {
        this.dueño = dueño;
    }

    public boolean tieneCapacidadSuficiente(int i) {
        return capacidad >= i;
     }

    public double getValorDeMercado() {
        return valorMercado;
    }

    public double calcularAntiguedad() {
        return LocalDate.now().getYear()  - anioFabricacion;
     }

}

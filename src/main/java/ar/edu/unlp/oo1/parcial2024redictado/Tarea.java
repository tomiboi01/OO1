package ar.edu.unlp.oo1.parcial2024redictado;

import java.util.List;

public abstract class Tarea {
    protected int id;
    protected int tiempoEstimadoDeRealizacion;
    protected double montoFijo;
    protected List<Repuesto> repuestos;
    public double calcularCostoBase(){
        return montoFijo;
    }

    public double calcularCosto()
    {
        return this.calcularCostoBase() + this.repuestos.stream().mapToDouble(r->r.getCosto()).sum();
    }

    public Tarea(int id, int tiempoEstimadoDeRealizacion, double montoFijo, List<Repuesto> repuestos) {
        this.id = id;
        this.tiempoEstimadoDeRealizacion = tiempoEstimadoDeRealizacion;
        this.montoFijo = montoFijo;
        this.repuestos = repuestos;
    }

    
}

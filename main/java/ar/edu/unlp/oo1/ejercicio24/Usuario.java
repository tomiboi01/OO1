package ar.edu.unlp.oo1.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nombre;
    protected double saldo;
    protected List<Viaje> viajes;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
        this.viajes = new ArrayList<Viaje>();
    }

    public abstract double calcularComision(double monto);

    public abstract double calcularBonificacion();

    public void cargarSaldo(double monto)
    {
        this.saldo +=monto;
    }
    public void cobrarSaldo(double monto)
    {
        this.saldo += saldo - this.calcularComision(monto);
    }
    public boolean tieneSaldoEnRojo()
    {
        return this.saldo < 0;
    }
}

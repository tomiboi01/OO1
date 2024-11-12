package ar.edu.unlp.oo1.ejercicio4.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private LocalDate fecha = LocalDate.now();
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    private List<Producto> productos;
    
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> productos) {
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
        this.productos = new ArrayList<>(productos);

    }


    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double impuesto()
    {
        return this.precioTotal * 0.21;
    }


    public LocalDate getFecha() {
        return fecha;
    }
    
public List<Producto> getProductos(){
        return this.productos;
    }
}
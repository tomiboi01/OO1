package ar.edu.unlp.oo1.ejercicio2.impl;

public class Balanza {
    private int cantidadDeProductos = 0;
    private double pesoTotal = 0;
    private double precioTotal = 0;

    public void agregarProducto(Producto producto) {
        this.cantidadDeProductos++;
        this.pesoTotal += producto.getPeso();
        this.precioTotal += producto.getPrecio();
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.pesoTotal = 0;
        this.precioTotal = 0;
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public Ticket emitirTicket()
    {
        return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

}

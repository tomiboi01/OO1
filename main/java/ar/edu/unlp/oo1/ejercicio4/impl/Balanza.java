package ar.edu.unlp.oo1.ejercicio4.impl;

import java.util.ArrayList;
import java.util.List;

public class Balanza {

    private List<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void ponerEnCero() {
        productos.clear();
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(p -> p.getPeso()).sum();
    }

    public double getPrecioTotal() {
        return this.productos.stream().mapToDouble(p->p.getPrecio()).sum();
    }

    public Ticket emitirTicket()
    {
        return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(),getPrecioTotal(), this.productos);
    }

    public List<Producto> getProductos(){
        return this.productos;
    }
}

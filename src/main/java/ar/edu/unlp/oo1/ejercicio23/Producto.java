package ar.edu.unlp.oo1.ejercicio23;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public double getPrecio() {
        return this.precio; 
    }

    public int getStock() {
        return this.stock;
    }

    public void decrementarStock(int cantidad)
    {
        this.stock-=cantidad;   
    }

}

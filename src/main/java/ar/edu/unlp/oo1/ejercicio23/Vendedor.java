package ar.edu.unlp.oo1.ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{

    private List<Producto> productos;

    public Vendedor(String nombre, String direccion) {
        super(nombre, direccion);
        this.productos = new ArrayList<Producto>();
    }

    
}

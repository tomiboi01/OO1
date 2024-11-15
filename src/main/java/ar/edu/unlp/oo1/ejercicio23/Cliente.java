package ar.edu.unlp.oo1.ejercicio23;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.oo1.ejercicio21.*;

public class Cliente extends Persona {
    private List<Pedido> pedidos;

    public Cliente(String nombre, String direccion) {
        super(nombre, direccion);
        this.pedidos = new ArrayList<Pedido>();
    }

    public boolean crearPedido (Vendedor vendedor, Producto producto, int cantidad, FormaDePago formaDePago, FormaDeEnvio formaDeEnvio) {
        if (producto.getStock() < cantidad) {
            return false;
        }
        producto.decrementarStock(cantidad);
        Pedido pedido = new Pedido(this, vendedor, producto, cantidad,formaDePago, formaDeEnvio);
        this.pedidos.add(pedido);
        return true;
    }

    public Bag<Producto> cantidadPorCategoria() {
        BagImpl<Producto> bolsa = new BagImpl<Producto>();
        this.pedidos.stream().forEach(pedido -> bolsa.add(pedido.getProducto()));
        return bolsa;
    }
    
}

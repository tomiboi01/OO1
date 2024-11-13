package ar.edu.unlp.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha = LocalDate.now();
    private String cliente = "No especificado";

    private List<Item> items = new ArrayList<Item>();

    
    public Presupuesto(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarItem (Item item) {
        this.items.add(item);
    }
    public double calcularTotal ()
    {
        return items.stream().mapToDouble(i -> i.costo()).sum();
    }
}

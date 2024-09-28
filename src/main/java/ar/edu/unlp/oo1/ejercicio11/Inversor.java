package ar.edu.unlp.oo1.ejercicio11;

import java.util.List;

public class Inversor implements ValorCalculable {
    String nombre;
	List<ValorCalculable> inversiones;

    public double valorActual()
    {
        return inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
    }

    public void addInversion(ValorCalculable valorCalculable)
    {
        this.inversiones.add(valorCalculable);
    }

}

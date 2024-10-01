package ar.edu.unlp.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
  private List<Pieza> piezas;

  public double getVolumenDeMaterial(String nombreDeMaterial)
  {
    return piezas.stream()
    .filter(p -> p.getMaterial().equals(nombreDeMaterial))
    .mapToDouble(p -> p.getVolumen())
    .sum();
  }

  public double getSuperficieDeColor(String unNombreDeColor)
  {
    return piezas.stream()
    .filter(p -> p.getColor().equals(unNombreDeColor))
    .mapToDouble(p -> p.getSuperficie())
    .sum();
  }
public void add(Pieza pieza)
{
    this.piezas.add(pieza);
}

public ReporteDeConstruccion() {
    this.piezas = new ArrayList<Pieza>();
}


    
}

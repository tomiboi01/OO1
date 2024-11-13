package ar.edu.unlp.oo1.parcial2024redictado;

import java.util.List;

public class TareaPorRodado extends Tarea {
    private int cantKm;
    @Override
    public double calcularCostoBase()
    {
        return this.montoFijo + 0.05 * cantKm;
    }
    public TareaPorRodado(int id, int tiempoEstimadoDeRealizacion, double montoFijo, List<Repuesto> repuestos, int cantKm) {
        super(id, tiempoEstimadoDeRealizacion, montoFijo, repuestos);
        this.cantKm = cantKm;

    }

    
}

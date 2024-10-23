package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public class ContratoPlanta extends Contrato {
    public double sueldoMensual;
    public double montoConyuge;
    public double montoHijos;

    public double calcularSueldo()
    {
        return sueldoMensual + montoConyuge + montoHijos;
    }

    public int duracionContratoEnDias()
    {
        return this.getFechaDeInicio().until(LocalDate.now()).getDays();
    }

    
}

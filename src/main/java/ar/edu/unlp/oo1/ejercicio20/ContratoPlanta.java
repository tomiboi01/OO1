package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public class ContratoPlanta extends Contrato {
    public double sueldoMensual;
    public double montoConyuge;
    public double montoHijos;

    

    public ContratoPlanta(LocalDate fechaDeInicio, double sueldoMensual, double montoConyuge, double montoHijos) {
        super(fechaDeInicio);
        this.sueldoMensual = sueldoMensual;
        this.montoConyuge = montoConyuge;
        this.montoHijos = montoHijos;
    }

    public double calcularSueldo()
    {
        // asumo que si no tiene hijos o conyuge, el monto correspondiente estaría en 0
        return sueldoMensual + montoConyuge + montoHijos;
    }

    public int duracionContratoEnDias()
    {
        return this.getFechaDeInicio().until(LocalDate.now()).getDays();
    }

    
}

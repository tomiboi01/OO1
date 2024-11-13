package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public abstract class Contrato {
    private LocalDate fechaDeInicio;

    

    public abstract double calcularSueldo();

    public abstract int duracionContratoEnDias();

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }


    
    
}

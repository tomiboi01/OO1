package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public abstract class Servicio {
    protected LocalDate fecha;
    protected Mascota mascota;

    public abstract double calcularCosto();

    public Servicio(Mascota mascota)
    {
        this.mascota = mascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    
}

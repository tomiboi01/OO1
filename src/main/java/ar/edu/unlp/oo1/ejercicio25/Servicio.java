package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public abstract class Servicio {
    protected LocalDate fecha;
    protected Mascota mascota;

    public abstract double calcularCosto();

    public Servicio(Mascota mascota)
    {
        this.mascota = mascota;
        this.fecha = LocalDate.now();
    }

    public Servicio(Mascota mascota, LocalDate fecha)
    {
        this.mascota = mascota;
        this.fecha = fecha;
    }



    public LocalDate getFecha() {
        return fecha;
    }

    
}

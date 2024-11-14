package ar.edu.unlp.oo1.ejercicio25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio{
    protected Medico medico;

    

    public ServicioMedico(Mascota mascota, Medico medico) {
        super(mascota);
        this.medico = medico;
    }

    public ServicioMedico(Mascota mascota,  Medico medico, LocalDate fecha) {
        super(mascota, fecha);
        this.medico = medico;
    }



    public double calcularCosto()
    {
        return this.medico.costoHonorarios() + costoMateriales() + costoAtencionDomingos();
    }

    public double costoAtencionDomingos()
    {
        if (fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY))
        {
            return 200;
        }
        return 0;
    }
    public abstract double costoMateriales();

    
}

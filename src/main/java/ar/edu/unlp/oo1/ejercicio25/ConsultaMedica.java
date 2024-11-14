package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class ConsultaMedica extends ServicioMedico{

    public ConsultaMedica(Mascota mascota, Medico medico)
    {
        super(mascota, medico);
    }

    public ConsultaMedica(Mascota mascota, Medico medico, LocalDate fecha)
    {
        super(mascota, medico, fecha);
    }

    public double costoMateriales()
    {
        return 300;
    }

    public double calcularCosto()
    {
        return super.calcularCosto() + this.medico.getAntiguedad() * 100;
    }


}

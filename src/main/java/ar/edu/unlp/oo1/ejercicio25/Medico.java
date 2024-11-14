package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class Medico {
    private String nombre;
    private LocalDate fechaDeIngreso;
    private double honorarios;

    

    public Medico(String nombre, LocalDate fechaDeIngreso, double honorarios) {
        this.nombre = nombre;
        this.fechaDeIngreso = fechaDeIngreso;
        this.honorarios = honorarios;
    }

    

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }



    public double costoHonorarios()
    {
        return honorarios;
    }

    public int getAntiguedad() {
        return this.fechaDeIngreso.until(LocalDate.now()).getYears(); }

    
}

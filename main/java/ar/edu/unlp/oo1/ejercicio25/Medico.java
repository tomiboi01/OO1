package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class Medico {
    private String nombre;
    private LocalDate fechaDeIngreso;
    private double honorarios;
    private Mascota mascota;

    

    public Medico(String nombre, LocalDate fechaDeIngreso, double honorarios, Mascota mascota) {
        this.nombre = nombre;
        this.fechaDeIngreso = fechaDeIngreso;
        this.honorarios = honorarios;
        this.mascota = mascota;
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

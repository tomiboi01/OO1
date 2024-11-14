package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String especie;
    private List<Servicio> serviciosUsados;

    public Mascota(String nombre, LocalDate fechaDeNacimiento, String especie) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.especie = especie;
        this.serviciosUsados = new ArrayList<Servicio>();

    }

    public boolean utilizoNServiciosOMas(int n)
    {
        return this.serviciosUsados.size() >= n;
    }

    public double calcularRecaudacionDeServiciosEnFecha(LocalDate fecha)
    {
        return this.serviciosUsados.stream().filter(s->s.getFecha().isEqual(fecha)).mapToDouble(s->s.calcularCosto()).sum();

    }

    public void darDeAltaServicio(Servicio servicio)
    {
        this.serviciosUsados.add(servicio);
    }
    
}

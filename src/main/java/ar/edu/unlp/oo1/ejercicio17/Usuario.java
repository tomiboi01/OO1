package ar.edu.unlp.oo1.ejercicio17;

import java.util.List;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;
import ar.edu.unlp.oo1.ejercicio14.LapseInterface;

public class Usuario {
    private String nombre;
    private String dirreccion;
    private int dni;
    List<Propiedad> propiedades;

    

    public Usuario(String nombre, String dirreccion, int dni) {
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.dni = dni;
    }

    public boolean consultarDisponibilidad(Propiedad propiedad, LapseInterface lapso){
        return !propiedad.yaEstaReservadaParaElLapso(lapso);
    }

    public boolean crearReserva(Propiedad propiedad, LapseInterface lapso)
    {
        return propiedad.crearReserva(lapso);
    }

    public double calcularPrecioReserva(Propiedad propiedad, LapseInterface lapso){
        return propiedad.getPrecioReserva(lapso);
    }

    public double cancelarReserva (Propiedad propiedad, LapseInterface lapso)
    {
        return propiedad.cancelarReserva(lapso);
    }
    public double calcularIngresos(LapseInterface datelapse)
    {
        return 0.75 * this.propiedades.stream().mapToDouble(p -> p.calcularPrecioTotalReservasEntre(datelapse)).sum();
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirreccion() {
        return dirreccion;
    }
    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }



}

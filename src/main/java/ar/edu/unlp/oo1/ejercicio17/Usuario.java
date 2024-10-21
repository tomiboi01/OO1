package ar.edu.unlp.oo1.ejercicio17;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;

public class Usuario {
    private String nombre;
    private String dirreccion;
    private int dni;
    List<Propiedad> propiedades;

    public boolean consultarDisponibilidad(Propiedad propiedad, DateLapse lapso){
        return !propiedad.yaEstaReservadaParaElLapso(lapso);
    }

    public boolean crearReserva(Propiedad propiedad, DateLapse lapso)
    {
        return propiedad.crearReserva(lapso);
    }

    public double calcularPrecioReserva(Propiedad propiedad, DateLapse lapso){
        return propiedad.getPrecioReserva(lapso);
    }

    public double cancelarReserva (Propiedad propiedad, DateLapse lapso)
    {
        if (propiedad.cancelarReserva(lapso))
        {
            return propiedad. 
        }
        return 0;
    }
    public double calcularIngresos(DateLapse datelapse)
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

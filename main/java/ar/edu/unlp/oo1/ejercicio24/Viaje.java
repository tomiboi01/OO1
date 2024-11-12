package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String destino;
    private String origen;
    private double costoTotal;
    private Vehiculo vehiculo;
    private LocalDate fechaDeViaje;
    private List<Usuario> usuarios;
    public Viaje(String destino, String origen, double costoTotal, Vehiculo vehiculo, LocalDate fechaDeViaje) {
        this.destino = destino;
        this.origen = origen;
        this.costoTotal = costoTotal;
        this.vehiculo = vehiculo;
        this.fechaDeViaje = fechaDeViaje;
        this.usuarios = new ArrayList<Usuario>();
        this.usuarios.add(vehiculo.getDueño());

    }
    
    public boolean registrarPasajero(Usuario pasajero)
    {
        if (!vehiculo.tieneCapacidadSuficiente(this.usuarios.size() + 1))
            return false;
        LocalDate fechaLimite = this.fechaDeViaje.minusDays(2);
        if (LocalDate.now().isAfter(fechaLimite))
            return false;
        if (!pasajero.agregarViaje(this))
            return false;
        this.usuarios.add(pasajero);
        return true;
    }

    public void procesar()
    {
        usuarios.stream().forEach(u->u.cobrarSaldo(costoTotal/this.usuarios.size() - u.calcularBonificacion()));
    }

    public LocalDate getFecha() {
        return fechaDeViaje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}

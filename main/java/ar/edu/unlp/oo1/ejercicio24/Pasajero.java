package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;

public class Pasajero extends Usuario{

    public Pasajero(String nombre)
    {
        super(nombre);
    }

    @Override
    public double calcularComision(double monto) {
        if (this.realizoUnViajeEnLosUltimosXDias(30))  
            return 0;
        return monto * 0.1;
    }

    @Override
    public double calcularBonificacion() {
        if (this.realizoUnViaje())
                    return 500;
                return 0;
            }
        
    private boolean realizoUnViaje() {
        return !this.viajes.isEmpty();
    }

    public boolean realizoUnViajeEnLosUltimosXDias(int x)
    {
    LocalDate haceXDias = LocalDate.now().minusDays(x);
    return this.viajes.stream().anyMatch(v->!v.getFecha().isBefore(haceXDias) && !v.getFecha().isAfter(LocalDate.now()));
    }

    public boolean agregarViaje(Viaje viaje) {
        if (this.tieneSaldoEnRojo()) 
        {
            return false;
        }
        this.viajes.add(viaje);
        return true;

    }

    
}

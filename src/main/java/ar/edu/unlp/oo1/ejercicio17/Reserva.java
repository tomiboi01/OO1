package ar.edu.unlp.oo1.ejercicio17;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;
import ar.edu.unlp.oo1.ejercicio14.LapseInterface;

public class Reserva {
    private LapseInterface lapso;
    private Propiedad propiedad;

    
    public Reserva(LapseInterface lapso, Propiedad propiedad) {
        this.lapso = lapso;
        this.propiedad = propiedad;
    }
    public LapseInterface getLapso() {
        return lapso;
    }
    public void setLapso(LapseInterface lapso) {
        this.lapso = lapso;
    }
    public Propiedad getPropiedad() {
        return propiedad;
    }
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public double calcularCosto()
    {
        return propiedad.getPrecioXNoche() * lapso.sizeInDays();
    }
    public boolean seSuperponeConLapso(LapseInterface l)
    {
        return this.lapso.overlaps(l);
    }

    public int cantidadNoches(){
        return lapso.sizeInDays();
    }


}

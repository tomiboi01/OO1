package ar.edu.unlp.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.List;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;
import ar.edu.unlp.oo1.ejercicio18.PoliticaCancelacion;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioXNoche;
    private PoliticaCancelacion polCancelacion;

    private List<DateLapse> lapsosReservas; 

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }
    public void setNombreDescriptivo(String nombreDescriptivo) {
        this.nombreDescriptivo = nombreDescriptivo;
    }
    public double getPrecioXNoche() {
        return precioXNoche;
    }
    public void setPrecioXNoche(double precioXNoche) {
        this.precioXNoche = precioXNoche;
    }

    public boolean crearReserva(DateLapse lapso)
    {
        if (yaEstaReservadaParaElLapso(lapso))
        {
            return 0;
        }
        reservarSinCheckear(lapso);
        return polCancelacion.MultiplicadorMontoAReembolsar(lapso.getFrom()) * precioXNoche;
    }

    private void reservarSinCheckear(DateLapse d)
    {
        lapsosReservas.add(d);
    }

    private boolean yaEstaReservadaParaElLapso(DateLapse fecha)
    {
        return lapsosReservas.stream().filter(l -> l.overlaps(l)).count() != 0;

    }

    public double getPrecioReserva(DateLapse lapso){
        return (this.precioXNoche * lapso.sizeInDays()) - 1;
    }

    public boolean estaSiendoUsadaAhora()
    {
        return lapsosReservas.stream().filter(l -> l.includesDate(LocalDate.now())).findFirst().orElse(null) != null;
    }

    public boolean cancelarReserva(DateLapse datelapse)
    {
        if (estaSiendoUsadaAhora())
        {
            return false;
        }
        cancelarSinCheckear(datelapse);
        return true;

    }

    private void cancelarSinCheckear(DateLapse datelapse)
    {
        lapsosReservas.remove(datelapse);
    }

    public double calcularPrecioTotalReservasEntre(DateLapse datelapse)
    {
        return this.lapsosReservas.stream().filter(l -> l.overlaps(datelapse)).mapToDouble(l -> l.sizeInDays()).sum() * precioXNoche;
    }


}
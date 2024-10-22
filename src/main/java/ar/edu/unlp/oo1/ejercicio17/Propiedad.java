package ar.edu.unlp.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.oo1.ejercicio14.LapseInterface;
import ar.edu.unlp.oo1.ejercicio18.PoliticaCancelacion;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioXNoche;
    private PoliticaCancelacion polCancelacion;
    private List<LapseInterface> lapsosReservas; 



    public Propiedad(String direccion, String nombreDescriptivo, double precioXNoche, PoliticaCancelacion politicaCancelacion) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioXNoche = precioXNoche;
        this.polCancelacion = politicaCancelacion;
        lapsosReservas = new ArrayList<LapseInterface>();
    }
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

    public boolean crearReserva(LapseInterface lapso)
    {
        if (yaEstaReservadaParaElLapso(lapso))
        {
            return false;
        }
        reservarSinCheckear(lapso);
        return true;
    }
    private void reservarSinCheckear(LapseInterface lapso)
    {
        lapsosReservas.add(lapso);
    }

    public boolean yaEstaReservadaParaElLapso(LapseInterface lapso)
    {
        return lapsosReservas.stream().filter(l -> l.overlaps(lapso)).count() != 0;
    }

    

    

    public double cancelarReserva(LapseInterface lapso)
    {
        if (estaSiendoUsadaAhora())
        {
            return 0;
        }
        cancelarSinCheckear(lapso);
        return polCancelacion.MultiplicadorMontoAReembolsar(lapso.getFrom()) * precioXNoche;

    }

    private void cancelarSinCheckear(LapseInterface datelapse)
    {
        lapsosReservas.remove(datelapse);
    }

    private boolean estaSiendoUsadaAhora()
    {
        return lapsosReservas.stream().filter(l -> l.includesDate(LocalDate.now())).findFirst().orElse(null) != null;
    }

    public double getPrecioReserva(LapseInterface lapso){
        return this.precioXNoche * lapso.sizeInDays();
    }

    public double calcularPrecioTotalReservasEntre(LapseInterface datelapse)
    {
        return this.lapsosReservas.stream().filter(l -> l.overlaps(datelapse)).mapToDouble(l -> l.sizeInDays()).sum() * precioXNoche;
    }

}
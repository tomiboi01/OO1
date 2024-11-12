package ar.edu.unlp.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.Duration;

public class PlazoFijo implements ValorCalculable {
    LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;

    
    public PlazoFijo(LocalDate fechaDeConstitucion) {
        montoDepositado = 0;
        porcentajeDeInteresDiario = 0;
        this.fechaDeConstitucion = fechaDeConstitucion;
    }

    public void agregarMonto(double monto)
    {
        this.montoDepositado+=monto;
    }

    public void setporcentajeDeInteresDiario(int porcentajeDeInteresDiario)
    {
        this.porcentajeDeInteresDiario+=porcentajeDeInteresDiario;
    }

    @Override
    public double valorActual() {
        return montoDepositado + montoDepositado * (Duration.between(fechaDeConstitucion, LocalDate.now()).toDays());
       }

    

}

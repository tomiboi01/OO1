package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {
    public LocalDate fechaDeFin;
    public double montoHora;
    public int horasPorMes;

    public ContratoPorHoras (LocalDate fechaDeInicio, LocalDate fechaDeFin, double montoHora, int horasPorMes)
    {
        super(fechaDeInicio);
        this.fechaDeFin = fechaDeFin;
        this.montoHora = montoHora;
        this.horasPorMes = horasPorMes;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public double getMontoHora() {
        return montoHora;
    }

    public void setMontoHora(double montoHora) {
        this.montoHora = montoHora;
    }

    public int getHorasPorMes() {
        return horasPorMes;
    }

    public void setHorasPorMes(int horasPorMes) {
        this.horasPorMes = horasPorMes;
    }

    public double calcularSueldo()
    {
        return montoHora * horasPorMes;

    }

    public int duracionContratoEnDias()
    {
        return this.getFechaDeInicio().until(this.getFechaDeFin()).getDays();
    }

}

package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDeDespacho;
    private Cliente clienteOrigen;
    private String origen;
    private String destino;
    private double pesoGramos;
    public LocalDate getFechaDeDespacho() {
        return fechaDeDespacho;
    }
    public void setFechaDeDespacho(LocalDate fechaDeDespacho) {
        this.fechaDeDespacho = fechaDeDespacho;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getPesoGramos() {
        return pesoGramos;
    }
    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public abstract double calcularCosto();
    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }
    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }

    
    
}

package ar.edu.unlp.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> enviosRealizados;
    private List<Envio> enviosARecibir;


    
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        enviosARecibir = new ArrayList<Envio>();
        enviosRealizados = new ArrayList<Envio>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    

    public abstract double calcularDescuento();

    public void realizarEnvio(Envio env, Cliente cli)
    {
        cli.agregarEnvioARecibir(env);
    }

    public void agregarEnvioARecibir(Envio env)
    {
        enviosARecibir.add(env);
    }


    public double montoAPagarDuranteUnLapso(DateLapse lapso)
    {
        return this.enviosARecibir.stream().filter(e->lapso.includesDate(e.getFechaDeDespacho())).mapToDouble(e->e.calcularCosto()).sum();
    }
}

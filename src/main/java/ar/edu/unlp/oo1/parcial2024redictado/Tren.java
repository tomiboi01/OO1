package ar.edu.unlp.oo1.parcial2024redictado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tren {
    private int nroSerie;
    private String marca;
    private String modelo;
    private LocalDate fechaIncorporacion;
    private List<Viaje> viajes;
    
    private int kilometrajeInicial;
    public Tren(int nroSerie, String marca, String modelo, LocalDate fechaIncorporacion, int kilometrajeInicial) {
        this.nroSerie = nroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaIncorporacion = fechaIncorporacion;
        this.kilometrajeInicial = kilometrajeInicial;
        this.viajes = new ArrayList<Viaje>();
        
    }

    

}

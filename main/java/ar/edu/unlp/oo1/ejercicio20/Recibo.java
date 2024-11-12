package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public class Recibo {
    private String nombre;
    private String apellido;
    private int CUIL;
    private int antiguedadAnios;
    private LocalDate fecha;
    private double sueldo;
    
    public Recibo(String nombre, String apellido, int cUIL, int antiguedadAnios, LocalDate fecha, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        CUIL = cUIL;
        this.antiguedadAnios = antiguedadAnios;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }

    
}

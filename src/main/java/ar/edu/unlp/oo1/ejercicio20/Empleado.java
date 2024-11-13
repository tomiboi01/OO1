package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private int CUIL;
    private LocalDate fechaDeNacimiento;
    private boolean tieneHijosACargo;

    private ContratoPlanta contratoPlanta;

    private List<ContratoPorHoras> contratosPorHora = new ArrayList<ContratoPorHoras>();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getCUIL() {
        return CUIL;
    }
    public void setCUIL(int cUIL) {
        CUIL = cUIL;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public boolean isTieneHijosACargo() {
        return tieneHijosACargo;
    }
    public void setTieneHijosACargo(boolean tieneHijosACargo) {
        this.tieneHijosACargo = tieneHijosACargo;
    }

    public void agregarContratoPorHora(ContratoPorHoras contratoPorHora)
    {
        this.contratosPorHora.add(contratoPorHora);
    }

    public Recibo getReciboDeSueldo()
    {
        return new Recibo(this.nombre, this.apellido, this.CUIL, this.getAntiguedadEmpleado(), LocalDate.now(), this.calcularSueldo());
    }
    
    public double calcularSueldo()
    {
        double multiplicadorMontoAdicional=calcularPorcentajeMontoAdicional(this.getAntiguedadEmpleado())/100;
        double sueldo=0;

        sueldo += contratoPlanta  != null ? contratoPlanta.calcularSueldo(): 0;

        ContratoPorHoras contratoPorHorasActivo=this.getContratoPorHorasActivo();
        sueldo+=contratoPorHorasActivo !=null ? contratoPorHorasActivo.calcularSueldo() : 0;

        return sueldo + sueldo * multiplicadorMontoAdicional;
    }

    public int getAntiguedadEmpleado()
    {
        int antiguedadDias= contratoPlanta != null ? contratoPlanta.duracionContratoEnDias() : 0;
        antiguedadDias+=this.contratosPorHora.stream().mapToDouble(c->c.duracionContratoEnDias()).sum();
        return antiguedadDias / 365;
    }

    private ContratoPorHoras getContratoPorHorasActivo()
    {
       return  this.contratosPorHora.stream().filter(c->c.getFechaDeFin().isAfter(LocalDate.now())).findFirst().orElse(null);
    }

    public double calcularPorcentajeMontoAdicional(int antiguedad)
    {
        if (antiguedad < 5)
            return 0;
        if(antiguedad < 10)
            return 30;
        if (antiguedad < 15)
            return 50;
        if (antiguedad < 20)
            return 70;
        return 100;
    }




    
}



package ar.edu.unlp.oo1.ejercicio6;

import java.util.Date;

public class Mamifero {
    private String identificador;
    private String especie;
    private Date fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;


    
    public Mamifero() {
    }


    public Mamifero(String identificador) {
        this.identificador = identificador;
    }


    public String getIdentificador() {
        return identificador;
    }
    public String getEspecie() {
        return especie;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Mamifero getPadre() {
        return padre;
    }
    public Mamifero getMadre() {
        return madre;
    }
    public Mamifero getAbueloPaterno() {
        return padre != null ? this.padre.getPadre() : null;

    }
    public Mamifero getAbueloMaterno() {
        return madre != null ? this.madre.getPadre() : null;
    }
    public Mamifero getAbuelaPaterna() {
        return padre != null ? this.padre.getMadre() : null;
    }
    public Mamifero getAbuelaMaterna() {
        return madre != null ? this.madre.getMadre() : null;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }
    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
    
    @Override
    public boolean equals(Object object)
    {
       if (object != null && object instanceof Mamifero)
            return this.identificador.equals(((Mamifero)object).getIdentificador());
        return false;
        }
    
    public boolean tieneComoAncestroA(Mamifero unMamifero)
    {
        return checkearPadre(this.padre, unMamifero) || checkearPadre(this.madre, unMamifero);
    }

    private boolean checkearPadre(Mamifero padre, Mamifero ancestro)
    {
            return padre != null ? padre.equals(ancestro) || padre.tieneComoAncestroA(ancestro) : false;

    }
}

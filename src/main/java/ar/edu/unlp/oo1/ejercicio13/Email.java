package ar.edu.unlp.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
    public List<Archivo> adjuntos;
    private String titulo;
    private String cuerpo;
    
    public Email(String titulo, String cuerpo) {
        this();
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        
    }

    public Email(){
        this.adjuntos = new ArrayList<Archivo>();
        this.titulo = "";
        this.cuerpo = "";
    }

    public String getTitulo() {
        return titulo;
    }
    public String getCuerpo() {
        return cuerpo;
    }

    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public List<Archivo> adjuntos() {
        return this.adjuntos;
    }

    public int tamaño()
    {
        int tamañoCuerpo = this.cuerpo != null ? cuerpo.length() : 0;
        int tamañoTitulo = this.titulo != null ? titulo.length() : 0;
        return tamañoCuerpo + tamañoTitulo + this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
    
    }

    public void agregarAdjunto(Archivo archivo) {
        this.adjuntos.add(archivo);
    }

    public Categorias devolverCategoria()
    {
        if (this.tamaño() <= 300)
            return Categorias.Pequeño;
        if (this.tamaño() <= 500)
            return Categorias.Mediano;
        return Categorias.Grande;
    }
    
    
    
    
}

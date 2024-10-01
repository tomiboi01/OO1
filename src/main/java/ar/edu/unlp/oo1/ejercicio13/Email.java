package ar.edu.unlp.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
    public List<Archivo> adjuntos;
    private String titulo;
    private String cuerpo;
    
    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList<Archivo>();
    }

    public String getTitulo() {
        return titulo;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    
    public List<Archivo> adjuntos() {
        return this.adjuntos;
    }

    public int tamaño()
    {
        return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
    
    }

    
    
    
}

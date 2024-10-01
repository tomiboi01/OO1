package ar.edu.unlp.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails = new ArrayList<Email>();

    public Carpeta(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void mover(Email email, Carpeta destino)
    {
        this.emails.remove(email);
        destino.agregarEmail(email);
    }

    // está bien agregar estos métodos?

    public void agregarEmail(Email email)
    {
        this.emails.add(email);
    }

    public int tamañoMails()
    {
        return this.emails.stream().mapToInt(e-> e.tamaño()).sum();
    }

    public Email buscar(String texto){
        return this.emails.stream().filter(e -> e.getTitulo().contains(texto) || e.getCuerpo().contains(texto)).findFirst().orElse(null);
    }

    
}

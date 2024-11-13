package ar.edu.unlp.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta(String nombre)
    {
        this();
        this.nombre=nombre;
    }
    public Carpeta() {
        emails = new ArrayList<Email>();
    }
    public String getNombre() {
        return nombre;
    }

    public void mover(Email email, Carpeta destino)
    {
        this.emails.remove(email);
        destino.agregarEmail(email);
    }


    public void agregarEmail(Email email)
    {
        this.emails.add(email);
    }

    public int tamañoMails()
    {
        return this.emails.stream().mapToInt(e-> e.tamaño()).sum();
    }

    public int cantidadMails()
    {
        return emails.size();
    }

    public Email buscar(String texto){
        return this.emails.stream().filter(e -> e.getTitulo().contains(texto) || e.getCuerpo().contains(texto)).findFirst().orElse(null);
    }

    public CantidadCategorias cantidadCadaCategoria()
    {
        CantidadCategorias cantidadCategorias = new CantidadCategorias();
        this.emails.stream().forEach(e->cantidadCategorias.aumentarCantidadDeCategoria(e.devolverCategoria()));
        return cantidadCategorias;

    }

    
}

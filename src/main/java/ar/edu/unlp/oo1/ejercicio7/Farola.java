package ar.edu.unlp.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean prendida=false;
    private List<Farola> neighbors = new ArrayList<Farola>();
    public void pairWithNeighbor( Farola otraFarola)
    {
        if (!this.neighbors.contains(otraFarola))
        {
            this.neighbors.add(otraFarola);
            otraFarola.pairWithNeighbor(this);
        }
    }
    /*
    * Retorna sus farolas vecinas
    */
    public List<Farola> getNeighbors ()
    {
        return new ArrayList<Farola> (neighbors);
    }


    /*
    * Si la farola no está encendida, la enciende y propaga la acción.
    */
    public void turnOn()
    {
        this.prendida = true;
        this.neighbors.stream().forEach(f -> {if (f.isOff()) f.turnOn();});
        
    }

    /*
    * Si la farola no está apagada, la apaga y propaga la acción.
    */
    public void turnOff()
    {
        this.prendida = false;
        this.neighbors.stream().forEach(f -> {if (f.isOn()) f.turnOff();});
    }

    public boolean isOn() {
        return this.prendida;
    }
    public boolean isOff() {
        return !this.prendida;    
    }
        
}

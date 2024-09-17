package ar.edu.unlp.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean prendida=false;
    private List<Farola> neighbors = new ArrayList<Farola>();
    public void pairWithNeighbor( Farola otraFarola)
    {
        this.neighbors.add(otraFarola);
        if (!otraFarola.getNeighbors().contains(this))
            otraFarola.pairWithNeighbor(this);
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
        for (Farola n: neighbors)
        {
        if (!n.isOn()) 
            {
                n.turnOn();
            }
        }
    }

    /*
    * Si la farola no está apagada, la apaga y propaga la acción.
    */
    public void turnOff()
    {
        this.prendida = false;
        for (Farola n: neighbors)
        {
        if (n.isOn()) 
            {
                n.turnOff();
            }
        }
    }

    public boolean isOn() {
        return this.prendida;
    }
    public boolean isOff() {
        return !this.prendida;    
    }
        
}

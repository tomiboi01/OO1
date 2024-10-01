package ar.edu.unlp.oo1.ejercicio12;

public class Esfera extends Pieza {
    private int radio;

    @Override
    public double getVolumen()
    {
        return 4/3 * Math.PI * Math.pow(radio,3);
    }

    @Override
    public double getSuperficie()
    {
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Esfera(String material, String color, int radio) {
        super(material, color);
        this.radio = radio;
    }

    public Esfera() {
        super();
    }
    
    
}

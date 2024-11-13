package ar.edu.unlp.oo1.ejercicio12;

public class Cilindro extends Pieza {
    private int radio;
    private int altura;
    
    @Override
    public double getVolumen()
    {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double getSuperficie()
    {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio,2);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Cilindro(String material, String color, int radio, int altura) {
        super(material, color);
        this.radio = radio;
        this.altura = altura;
    }

    public Cilindro() {
        super();
    }

    
    


    
}

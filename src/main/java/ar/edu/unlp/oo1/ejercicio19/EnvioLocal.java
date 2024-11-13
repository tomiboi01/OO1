package ar.edu.unlp.oo1.ejercicio19;

public class EnvioLocal extends Envio{
    private boolean EsEntregaRapida;
    public double calcularCosto(){
        return EsEntregaRapida ? 500 : 1000;
    }
    
}

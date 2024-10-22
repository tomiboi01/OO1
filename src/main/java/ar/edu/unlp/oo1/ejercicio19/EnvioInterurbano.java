package ar.edu.unlp.oo1.ejercicio19;

public class EnvioInterurbano extends Envio {
    private double distanciaKm;

    public double calcularCosto(){
        double descuento = (this.getClienteOrigen().calcularDescuento()) / 100; 
        double precioEnvio = this.getPesoGramos() * this.calcularPrecioXGramo();
        return (1 - descuento) * precioEnvio; 

    }

    private double calcularPrecioXGramo()
    {
        if (distanciaKm <= 100) 
            return 20;
        if (distanciaKm <= 500) 
            return 25;
        return 30;
    }
    
}

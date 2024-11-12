package ar.edu.unlp.oo1.ejercicio19;

public class EnvioInternacional extends Envio
{
    public double calcularCosto(){
        double descuento = (this.getClienteOrigen().calcularDescuento()) / 100; 
        double precioEnvio = this.getPesoGramos() * this.calcularPrecioXGramo();
        return (1 - descuento) * precioEnvio; 


    }
    public double calcularPrecioXGramo(){
        return this.getPesoGramos() <= 1000 ? 10 : 12;
    }
}

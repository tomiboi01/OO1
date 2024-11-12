package ar.edu.unlp.oo1.ejercicio25;

public class ServicioGuarderia extends Servicio{
    private int cantidadDias;
    
    

    public ServicioGuarderia(Mascota mascota, int cantidadDias) {
        super(mascota);
        this.cantidadDias = cantidadDias;
    }



    public double calcularCosto()
    {
        double costoDias = this.cantidadDias * 500;
        if (this.mascota.utilizoNServiciosOMas(5))
        {
            return costoDias * 0.9;
        }
        return costoDias;
    }



    
}

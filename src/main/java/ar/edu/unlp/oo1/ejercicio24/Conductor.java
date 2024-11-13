package ar.edu.unlp.oo1.ejercicio24;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public Conductor(String nombre, Vehiculo vehiculo) {
        super(nombre);
        this.vehiculo = vehiculo;
    }

    public double calcularComision(double monto){
        if (this.vehiculo.calcularAntiguedad() < 5)
            return monto * 0.01;
        return monto * 0.1;        
    }

    public double calcularBonificacion()
    {
        return this.vehiculo.getValorDeMercado() * 0.001;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}

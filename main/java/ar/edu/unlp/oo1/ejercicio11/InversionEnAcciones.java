package ar.edu.unlp.oo1.ejercicio11;

public class InversionEnAcciones implements ValorCalculable {
    String nombre;
	int cantidad;
	double valorUnitario;

    


    public InversionEnAcciones(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAcciones(int cantidad)
    {
        this.cantidad+=cantidad;
    }

    public void agregarValorUnitario(int valorUnitario)
    {
        this.valorUnitario+=valorUnitario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    @Override
    public double valorActual()
    {
        return this.cantidad*this.valorUnitario;
    }

    


}

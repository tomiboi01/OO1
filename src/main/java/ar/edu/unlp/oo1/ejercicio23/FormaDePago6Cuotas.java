package ar.edu.unlp.oo1.ejercicio23;

public class FormaDePago6Cuotas implements FormaDePago {
    public double calcularPrecioFinal(double monto) {
        return monto * 1.2;
    }

}

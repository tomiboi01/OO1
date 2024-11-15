package ar.edu.unlp.oo1.ejercicio23;

public class FormaDeEnvioExpress implements FormaDeEnvio{
    private String direccionCliente;
    private String direccionVendedor;
    public FormaDeEnvioExpress(String direccionCliente, String direccionVendedor) {
        this.direccionCliente = direccionCliente;
        this.direccionVendedor = direccionVendedor;
    }
    public double calcularCosto() {
        return 0.5 * this.calcularKm();
    }

    private int calcularKm()
    {
        return new CalculadoraDeDistancia().distanciaEntre(this.direccionVendedor, this.direccionCliente);
    }

}

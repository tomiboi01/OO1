package ar.edu.unlp.oo1.ejercicio23;
//quien crea esta clase?
public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private int cantidad;
    private FormaDePago formaDePago;
    private FormaDeEnvio formaDeEnvio;

    public Pedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad, FormaDePago formaDePago, FormaDeEnvio formaDeEnvio)
    {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.formaDePago = formaDePago;
        this.formaDeEnvio = formaDeEnvio;
    }

    public double calcularCosto()
    {
        return this.formaDePago.calcularPrecioFinal(this.calcularCostoSinAdicionales()) + this.formaDeEnvio.calcularCosto();
    }

    private double calcularCostoSinAdicionales()
    {
        return producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return this.producto;
    }

   
}

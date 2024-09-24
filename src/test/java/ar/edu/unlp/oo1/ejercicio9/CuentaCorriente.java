package ar.edu.unlp.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {
    double descubierto;

    public CuentaCorriente ()
    {
        super();
        this.descubierto = 0;
    }

    @Override
    protected boolean puedeExtraer(double monto) {
        return (this.getSaldo() - monto) >= descubierto;    
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    
    
}

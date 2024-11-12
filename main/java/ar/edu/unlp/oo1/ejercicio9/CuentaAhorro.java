package ar.edu.unlp.oo1.ejercicio9;

public class CuentaAhorro extends Cuenta {

    @Override
    protected boolean puedeExtraer(double monto) {
        return this.getSaldo() >= monto;
    }

    @Override
    public boolean extraer(double monto)
    {
        return super.extraer(monto + this.calcularCostoAdicional());
    }
    
    @Override
    public void depositar (double monto){
        super.depositar (monto + this.calcularCostoAdicional());
    }

    @Override
    public boolean transferirACuenta (double monto, Cuenta cuentaDestino)
    {
        if (this.puedeExtraer(monto + this.calcularCostoAdicional()))
        {
            this.extraerSinControlar(monto + this.calcularCostoAdicional());
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
    private double calcularCostoAdicional ()
    {
        return this.getSaldo() * 0.02;
    }
    
}

package ar.edu.unlp.oo1.ejercicio9;

public abstract class Cuenta {
    double monto;

    public Cuenta()
    {
        this.monto = 0;
    }

    public void depositar (double monto)
    {
        this.monto += monto;
    }

    public double getSaldo() {
        return monto;
    }

    protected void extraerSinControlar (double monto)
    {
        this.monto -= monto;
    }

    public boolean extraer (double monto) {
        if (this.puedeExtraer(monto))
        {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }
    public boolean transferirACuenta (double monto, Cuenta cuentaDestino)
    {
        if (this.puedeExtraer(monto))
        {
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

    protected abstract boolean puedeExtraer (double monto);

    
}

package ar.edu.unlp.oo1.ejercicio8;

public class C extends B{
    @Override
    public void aportes()
    {
        System.out.println("C.aportes()");
        this.montoBasico();
    }

    @Override
    public void montoBasico()
    {
        System.out.println("C.montoBasico()");
    }

}

package ar.edu.unlp.oo1.ejercicio8;



public class B extends A{
    @Override
    public void sueldoBasico()
    {
        System.out.println("B.sueldoBasico()");
        super.sueldoBasico();
        this.bonoPorCategoria();

    }
    @Override
    public void montoBasico()
    {
        System.out.println("B.montoBasico()");
    }

    public void bonoPorCategoria()
    {
        System.out.println("B.bonoPorCategoria()");
    }

}
package ar.edu.unlp.oo1.ejercicio8;

public class A {
   

    public void aportes()
    {
        System.out.println("A.aportes()");

    }

    public void sueldoBasico()
    {
        System.out.println("A.sueldoBasico()");
        this.montoBasico();
        this.aportes();

    }
 public void montoBasico()
    {
        System.out.println("A.montoBasico()");
    }

}

package ar.edu.unlp.oo1.ejercicio13;

public class CantidadCategorias {
    private int[] cantidadCategorias = new int[Categorias.values().length];

    public void aumentarCantidadDeCategoria (Categorias categoria)
    {
        cantidadCategorias[categoria.ordinal()]++;
    }

    public void decrementarCantidadCategoria(Categorias categoria)
    {
        this.cantidadCategorias[categoria.ordinal()]--;
    }
    public int cantidadCategoria(Categorias categoria)
    {
        return cantidadCategorias[categoria.ordinal()];
    }
    
}

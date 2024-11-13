package ar.edu.unlp.oo1.ejercicio21;
import java.util.AbstractCollection;
public abstract class Bag<T> extends AbstractCollection<T> {
    
    @Override
    public abstract boolean add(T element);

    /**
     * Devuelve la cardinalidad del elemento. Sí el elemento no está en el Bag,            
     * devuelve 0.
     */
    public abstract int occurrencesOf(T element);

    /**
     * Elimina una referencia del elemento del Bag. Sí el elemento no está en 
     * el Bag, no hace nada.
     */
    public abstract void removeOccurrence(T element);

    /**
     * Elimina el elemento del Bag. Sí el elemento no está en el Bag, no hace
     * nada
     */
    public abstract void removeAll(T element);

    /**
     * Devuelve el número total de elementos en el Bag, es decir, la suma de
     * todas las cardinalidades de todos sus elementos.
     */
    @Override
    public abstract int size();
}
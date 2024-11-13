package ar.edu.unlp.oo1.ejercicio16;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EvenNumberTreeSet extends TreeSet<Integer> {


    public boolean add(Integer dato)
    {
        if (dato % 2 == 0)
            return super.add(dato);
        return false;
    }

    
    
}

package ar.edu.unlp.oo1.ejercicio16;

import java.util.HashSet;

public class EvenNumberHashSet extends HashSet<Integer>{
    @Override
    public boolean add(Integer i)
    {
        if (i % 2 == 0)
            return super.add(i);
        return false;
    }
    
}

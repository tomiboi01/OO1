package ar.edu.unlp.oo1.ejercicio21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends Bag<T>{
    private Map<T, Integer> map;

    public BagImpl()
    {
        this.map = new HashMap<T,Integer>();
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean add(T element) {
        if (map.containsKey(element))
        {  
            map.replace(element, map.get(element)+1);
            return true;
        }
        map.put(element, 1);
        return false;
        
    }

    @Override
    public int occurrencesOf(T element) {
        return map.getOrDefault(element, 0);
    }

    @Override
    public void removeOccurrence(T element) {
        map.replace(element, map.get(element)-1);
    }

    @Override
    public void removeAll(T element) {
        map.remove(element); 
    }

    @Override
    public int size() {
        return map.values().stream().mapToInt(i->i).sum();

   
    }
}
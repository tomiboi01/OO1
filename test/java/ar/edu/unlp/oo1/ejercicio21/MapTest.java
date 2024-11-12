package ar.edu.unlp.oo1.ejercicio21;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.HashMap;

public class MapTest {
    private Map<String, Integer> hashMap;


    @BeforeEach
    public void setUp()
    {
        hashMap = new HashMap<String,Integer>();
    }
    @Test
    public void testPut()
    {
        assertNull(hashMap.get("Lionel Messi"));
        hashMap.put("Lionel Messi", 111);
        assertEquals(111, hashMap.get("Lionel Messi"));
        hashMap.put("Gabriel Batistuta", 56);
        assertEquals(56, hashMap.get("Gabriel Batistuta"));
        hashMap.put ("Kun Agüero", 42);

        assertEquals(42, hashMap.get("Kun Agüero"));
    }
    @Test
    public void testRemove()
    {
        hashMap.put("Lionel Messi", 111);
        assertEquals(111, hashMap.get("Lionel Messi"));
        hashMap.remove("Lionel Messi");
        assertNull(hashMap.get("Lionel Messi"));
    }
    @Test
    public void testPutIfAbsent()
    {
        hashMap.put("Gabriel Batistuta", 56);
        assertEquals(56,hashMap.putIfAbsent("Gabriel Batistuta", 123));
        
    }

    @Test
    public void testValues()
    {  
        hashMap.put("Lionel Messi", 111);
        hashMap.put("Gabriel Batistuta", 56);
        hashMap.put ("Kun Agüero", 42);

        assertEquals(209,hashMap.values().stream().mapToInt(v->v).sum()
);
    }
}



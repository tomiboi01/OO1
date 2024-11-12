package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEvenNumberSet {
    Set<Integer> set;

    @BeforeEach
    public void setUp() throws Exception
    {
        set = new EvenNumberHashSet();

    }

    @Test
    public void testAdd()
    {
        assertFalse(set.add(1));
        assertTrue(set.add(2));
        assertFalse(set.add(2));

    }
    
}

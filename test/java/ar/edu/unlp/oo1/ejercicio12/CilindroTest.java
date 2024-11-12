package ar.edu.unlp.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
    private Cilindro cilindro;

    @BeforeEach
    public void setUp() throws Exception
    {
        cilindro = new Cilindro();
    }

    @Test
    public void testGetVolumen()
    {
        cilindro.setMaterial("metal");
        cilindro.setRadio(10);
        cilindro.setAltura(5);
        assertEquals(500*Math.PI,cilindro.getVolumen());
    }


    
}

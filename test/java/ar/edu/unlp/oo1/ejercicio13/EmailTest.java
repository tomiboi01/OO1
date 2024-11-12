package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
    Email email;

    @BeforeEach
    public void setUp() throws Exception
    {
        email = new Email();
    }

    @Test
    public void testTamaño()
    {
        email.setCuerpo(null);
        email.setTitulo(null);
        assertEquals(0,email.tamaño());
        email.agregarAdjunto(new Archivo("hola"));
        assertEquals(4,email.tamaño());
        email.setCuerpo("hola");
        assertEquals(8,email.tamaño());
        email.setTitulo("hola");
        assertEquals(12,email.tamaño());
        email.agregarAdjunto(new Archivo("tesisF"));
        assertEquals(18,email.tamaño());

    }
    
}

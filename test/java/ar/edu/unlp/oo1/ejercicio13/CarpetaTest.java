package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    Carpeta carpeta;
    Email email;
    Email email2;

    @BeforeEach
    public void setUp() throws Exception
    {
        email2 = new Email();
        email = new Email();
        carpeta = new Carpeta();
    }

    @Test
    public void testTamaño()
    {
        assertEquals(0, carpeta.tamañoMails());
        email.setCuerpo("cuerpo");
        email.setTitulo("titulo");
        email.agregarAdjunto(new Archivo("nombre"));
        carpeta.agregarEmail(email);
        assertEquals(18, carpeta.tamañoMails());

        Email email2 = new Email("cuerpo2","titulo2");
        email2.agregarAdjunto(new Archivo("nombre2"));
        email2.agregarAdjunto(new Archivo("nombre3"));
        carpeta.agregarEmail(email2);
        assertEquals(46, carpeta.tamañoMails());

        Carpeta carpeta2 = new Carpeta("nombre3");
        Email email3 = new Email("cuerpo2","titulo2");
        email3.agregarAdjunto(new Archivo("nombre2"));
        email3.agregarAdjunto(new Archivo("nombre3"));
        carpeta2.agregarEmail(email3);
        assertEquals(28, carpeta2.tamañoMails());

        carpeta.mover(email2, carpeta2);
        assertEquals(18, carpeta.tamañoMails());
        assertEquals(56, carpeta2.tamañoMails());
    }

    @Test
    public void testBuscar(){
        email.setCuerpo("cuerpo");
        email.setTitulo("titulo");
        email2.setCuerpo("cuerpo2");
        email2.setTitulo("titulo2");
        carpeta.agregarEmail(email);
        carpeta.agregarEmail(email2);
        assertEquals(email2, carpeta.buscar("cuerpo2"));
        assertEquals(email, carpeta.buscar("cuerpo"));
        assertEquals(email, carpeta.buscar("titulo"));


    }

    
}

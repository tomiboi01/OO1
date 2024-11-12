package ar.edu.unlp.oo1.ejercicio12;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionesTest {
    private ReporteDeConstruccion reporte;

    @BeforeEach
    public void setUp() throws Exception{
        reporte = new ReporteDeConstruccion();
    }

    @Test
    public void testGetVolumenDeMaterial()
    {
        assertEquals(0, reporte.getVolumenDeMaterial("metal"));
        Pieza cilindro = new Cilindro("metal", "rojo", 10, 5);
        reporte.add(cilindro);
        assertEquals(cilindro.getVolumen(), reporte.getVolumenDeMaterial("metal"));
        Pieza esfera = new Esfera("madera", "verde", 10);
        reporte.add(esfera);
        assertEquals(cilindro.getVolumen(), reporte.getVolumenDeMaterial("metal"));
        Pieza prisma = new PrismaRectangular("metal", "rojo", 10, 10, 10);
        reporte.add(prisma);
        assertEquals(prisma.getVolumen() + cilindro.getVolumen(), reporte.getVolumenDeMaterial("metal"));
        assertEquals(0, reporte.getVolumenDeMaterial(null));

    }

    @Test
    public void testGetSuperficieDeColor()
    {
        assertEquals(0, reporte.getSuperficieDeColor("rojo"));
        Pieza cilindro = new Cilindro("metal", "rojo", 10, 5);
        reporte.add(cilindro);
        assertEquals(cilindro.getSuperficie(), reporte.getSuperficieDeColor("rojo"));
        Pieza esfera = new Esfera("madera", "verde", 10);
        reporte.add(esfera);
        assertEquals(cilindro.getSuperficie(), reporte.getSuperficieDeColor("rojo"));
        Pieza prisma = new PrismaRectangular("plástico", "rojo", 10, 10, 10);
        reporte.add(prisma);
        assertEquals(prisma.getSuperficie() + cilindro.getSuperficie(), reporte.getSuperficieDeColor("rojo"));
        
    }
    
}

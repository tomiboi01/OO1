package ar.edu.unlp.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp()
    {
        vehiculo = new Vehiculo("descripcion", 5, 2010, 1000);
    }
    @Test
    void testCalcularAntiguedad() {
        assertEquals(14,vehiculo.calcularAntiguedad());
        vehiculo = new Vehiculo("descripcion", 5, 2024, 1000);
        assertEquals(0,vehiculo.calcularAntiguedad());

    }

    @Test
    void testTieneCapacidadSuficiente() {

    }
}

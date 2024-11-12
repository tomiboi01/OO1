package ar.edu.unlp.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConductorTest {
    public Conductor conductor;
    public Vehiculo vehiculoCon5Anios;
    public Vehiculo vehiculoCon4Anios;
    public Vehiculo vehiculoCon6Anios;
    
    @BeforeEach
    public void setUp()
    {
        vehiculoCon4Anios = new Vehiculo("desc", 1, 2020, 100);
        vehiculoCon5Anios = new Vehiculo("desc", 1, 2019, 100);
        vehiculoCon6Anios = new Vehiculo("desc", 1, 2018, 100);
        conductor = new Conductor("a", vehiculoCon4Anios);
        vehiculoCon4Anios.setDueño(conductor);


    }
    @Test
    void testCalcularBonificacion() {
        assertEquals(0.1,this.conductor.calcularBonificacion());
    }

    @Test
    void testCalcularComision() {
        assertEquals(1, this.conductor.calcularComision(100));
        this.conductor.setVehiculo(vehiculoCon5Anios);
        assertEquals(10, this.conductor.calcularComision(100));
        this.conductor.setVehiculo(vehiculoCon6Anios);
        assertEquals(10, this.conductor.calcularComision(100));
    }
}

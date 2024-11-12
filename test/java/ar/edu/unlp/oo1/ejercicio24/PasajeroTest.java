package ar.edu.unlp.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasajeroTest {
    private Pasajero pasajero;
    private Viaje viajeNoOcurrido;
    private Viaje viajeHace30Dias;
    private Viaje viajeHaceMas30Dias;
    private Vehiculo vehiculo;


    @BeforeEach
    public void setUp()
    {
        pasajero = new Pasajero("pepe");
        vehiculo = new Vehiculo("descripcion", 1, 2010, 1000);
        viajeNoOcurrido = new Viaje("destino", "origen", 100, vehiculo, LocalDate.now().plusDays(10));
        viajeHace30Dias = new Viaje("destino", "origen", 100, vehiculo, LocalDate.now().minusDays(30));
        viajeHaceMas30Dias = new Viaje("destino", "origen", 100, vehiculo, LocalDate.now().minusDays(31));

    }
    @Test
    void testAgregarViaje() {

        assertTrue(this.pasajero.agregarViaje(viajeNoOcurrido));
        
    }

    @Test
    void testCalcularBonificacion() {
        assertEquals(0,this.pasajero.calcularBonificacion());
        this.pasajero.agregarViaje(viajeNoOcurrido);
        assertEquals(500,this.pasajero.calcularBonificacion());
    }

    @Test
    void testCalcularComision() {
        assertEquals(10, this.pasajero.calcularComision(100));
        this.pasajero.agregarViaje(viajeNoOcurrido);
        assertEquals(10, this.pasajero.calcularComision(100));
        this.pasajero.agregarViaje(viajeHaceMas30Dias);
        assertEquals(10, this.pasajero.calcularComision(100));
        this.pasajero.agregarViaje(viajeHace30Dias);
        assertEquals(0, this.pasajero.calcularComision(100));

    }

    @Test
    void testRealizoUnViajeEnLosUltimosXDias() {
        assertFalse(this.pasajero.realizoUnViajeEnLosUltimosXDias(30));
        this.pasajero.agregarViaje(viajeNoOcurrido);
        assertFalse(this.pasajero.realizoUnViajeEnLosUltimosXDias(30));
        this.pasajero.agregarViaje(viajeHaceMas30Dias);
        assertFalse(this.pasajero.realizoUnViajeEnLosUltimosXDias(30));
        this.pasajero.agregarViaje(viajeHace30Dias);
        assertTrue(this.pasajero.realizoUnViajeEnLosUltimosXDias(30));

    }


}

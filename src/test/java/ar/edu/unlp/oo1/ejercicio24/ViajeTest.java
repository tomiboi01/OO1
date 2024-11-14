// package ar.edu.unlp.oo1.ejercicio24;

// import java.time.LocalDate;
// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class ViajeTest {
//     public Conductor conductor;
//     public Pasajero pasajero;
//     public Viaje viajeHoy;
//     public Viaje viajeDentroDeUnaSemana;
//     public Vehiculo vehiculoSinCapacidad;
//     public Vehiculo vehiculoConCapacidad;

//     @BeforeEach
//     public void setUp()
//     {
//         pasajero = new Pasajero("jorge");
//         conductor = new Conductor("a", null);
//         vehiculoSinCapacidad = new Vehiculo("a", 0, 2010, 100);
//         vehiculoConCapacidad = new Vehiculo("a", 1, 2010, 100)
//         viajeHoy = new Viaje("a","b", 100, vehiculoConCapacidad, LocalDate.now());
//         viajeDentroDeUnaSemana = new Viaje("a", "A", 100, vehiculoConCapacidad, LocalDate.now().plusDays(7));
//         conductor.setVehiculo(vehiculoConCapacidad);
//         vehiculoConCapacidad.setDueño(conductor);
//     }
//     @Test
//     void testProcesar() {
//         pasajero.cargarSaldo(99999);
//         assertFalse(viajeHoy.registrarPasajero(pasajero));
//     }

//     @Test
//     void testRegistrarPasajero() {
        
//     }
// }

// package ar.edu.unlp.oo1.ejercicio25;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.time.LocalDate;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class MedicoTest {
//     private Medico medico;

//     @BeforeEach
//     public void setUp()
//     {
//         medico = new Medico("pepe", LocalDate.of(2010,1,1), 100);
//     }
//     @Test
//     void testGetAntiguedad() {
//         assertEquals(14, medico.getAntiguedad());
//         medico.setFechaDeIngreso(LocalDate.now());
//         assertEquals(0, medico.getAntiguedad());
//     }
// }

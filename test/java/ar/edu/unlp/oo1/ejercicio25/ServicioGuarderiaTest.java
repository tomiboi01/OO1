// package ar.edu.unlp.oo1.ejercicio25;

// import java.time.LocalDate;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class ServicioGuarderiaTest {
//     private Mascota mascota;
//     private Medico medico;
//     private ServicioGuarderia s1;
//     private Servicio s2;
//     private Servicio s3;
//     private Servicio s4;
//     private Servicio s5;
//     private Servicio s6;

//     @BeforeEach
//     public void setUp()
//     {
//         this.mascota = new Mascota("pepe", LocalDate.of(2015,1,1), "perro caniche");
//         this.medico = new Medico("jorge", LocalDate.of(2010,1,1), 100);
//         s1 = new ServicioGuarderia(mascota, 10);
//         s2 = new ConsultaMedica(mascota, medico);
//         s3 = new Vacunacion(mascota, medico, "a", 100);
//         s4 = new ServicioGuarderia(mascota, 10);
//         s5 = new Vacunacion(mascota, medico, "a", 100);
//         s6 = new ConsultaMedica(mascota, medico);
   
//     }
//     @Test
//     void testCalcularCosto() {

//     }
// }

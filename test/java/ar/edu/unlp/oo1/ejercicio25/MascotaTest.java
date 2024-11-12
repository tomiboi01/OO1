// package ar.edu.unlp.oo1.ejercicio25;
// import static org.junit.jupiter.api.Assertions.*;

// import java.time.LocalDate;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class MascotaTest {
//     private Mascota mascota;
//     private Medico medico;
//     private Servicio s1;
//     private Servicio s2;
//     private Servicio s3;
//     private Servicio s4;
//     private Servicio s5;
//     private Servicio s6;

//     @BeforeEach
//     public void setUp (){
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
//     public void testUtilizoNServiciosOMas()
//     {
//         this.mascota.darDeAltaServicio(s1);
//         assertFalse(this.mascota.utilizoNServiciosOMas(5));
//         this.mascota.darDeAltaServicio(s2);
//         this.mascota.darDeAltaServicio(s3);
//         this.mascota.darDeAltaServicio(s4);
//         this.mascota.darDeAltaServicio(s5);
//         assertTrue(this.mascota.utilizoNServiciosOMas(5));
//         this.mascota.darDeAltaServicio(s6);
//         assertTrue(this.mascota.utilizoNServiciosOMas(5));
//     }
//     @Test
//     public void testCalcularRecaudacionDeServicios()
//     {
//         assertEquals(0.0,this.mascota.calcularRecaudacionDeServiciosEnFecha(LocalDate.now()));
//         this.mascota.darDeAltaServicio(s1);
//         assertEquals(100 + 200,this.mascota.calcularRecaudacionDeServiciosEnFecha(LocalDate.now()));
//     }
// }

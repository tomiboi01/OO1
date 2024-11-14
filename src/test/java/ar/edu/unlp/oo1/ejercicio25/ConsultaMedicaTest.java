package ar.edu.unlp.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultaMedicaTest {
    private ConsultaMedica consultaMedicaEnDomingo;
    private ConsultaMedica consultaMedicaEnDiaDeSemana;
    private Mascota mascota;
    private Medico medicoCon6AniosDeAntiguedad;


    @BeforeEach
    public void setUp()
    {
        this.medicoCon6AniosDeAntiguedad = new Medico("jorge", LocalDate.of(2018,1,7), 100);
        this.mascota = new Mascota("pepe", LocalDate.of(2015,1,1), "perro caniche");
        this.consultaMedicaEnDomingo = new ConsultaMedica(mascota, medicoCon6AniosDeAntiguedad, LocalDate.of(2018,1,7));
        this.consultaMedicaEnDiaDeSemana = new ConsultaMedica(mascota, medicoCon6AniosDeAntiguedad, LocalDate.of(2018,1,8));
    }
    @Test
    void testCalcularCosto() {
        assertEquals(1200, consultaMedicaEnDomingo.calcularCosto());

    }


}

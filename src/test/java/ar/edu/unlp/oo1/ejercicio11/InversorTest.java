package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
    private Inversor inversor; 

    @BeforeEach
	void setUp() throws Exception {
		this.inversor = new Inversor();
	}

    @Test
    private void testValorActual(){
        PlazoFijo plazoFijo = new PlazoFijo(LocalDate.of(2024, 9, 20));
        plazoFijo.agregarMonto(2000);
        plazoFijo.setporcentajeDeInteresDiario(10);
        this.inversor.addInversion(plazoFijo);
        assertEquals(3400, inversor.valorActual());
        InversionEnAcciones inversionEnAcciones = new InversionEnAcciones("afip");
        inversionEnAcciones.agregarAcciones(10);
        inversionEnAcciones.setValorUnitario(100);
        this.inversor.addInversion(inversionEnAcciones);
        assertEquals(0, inversor.valorActual());
        System.out.println("ads");


    }
}


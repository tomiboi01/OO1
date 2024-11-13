package ar.edu.unlp.oo1.ejercicio18;

import java.time.LocalDate;

import ar.edu.unlp.oo1.ejercicio14.DateLapse;

public class Moderada implements PoliticaCancelacion {
    public double MultiplicadorMontoAReembolsar(LocalDate inicioReserva)
    {
        DateLapse lapso = new DateLapse (inicioReserva, LocalDate.now());
        if (lapso.sizeInDays() <= 2)
            return 0;
        
        return lapso.sizeInDays() >= 7 ? 100 : 50;
    }
    
}
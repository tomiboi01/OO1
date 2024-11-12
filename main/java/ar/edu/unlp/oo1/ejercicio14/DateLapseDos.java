package ar.edu.unlp.oo1.ejercicio14;

import java.time.LocalDate;

public class DateLapseDos {
    private LocalDate from;
    public int sizeInDays;

    public DateLapseDos(LocalDate from)
    {
        this.from = from;
    }

    public LocalDate getFrom() {
        return from;
    }

    public int sizeInDays()
    {
        return this.sizeInDays;
    }

    public boolean includesDate(LocalDate other)
    {
        return from.plusDays(sizeInDays).isAfter(other);   
    }
}

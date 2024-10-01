package ar.edu.unlp.oo1.ejercicio14;

import java.time.LocalDate;

public class DateLapse implements LapseInterface {
    private LocalDate from;
    public LocalDate to;

    public DateLapse(LocalDate from, LocalDate to)
    {
        this.from = from;
        this.to=to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int sizeInDays()
    {
        return (from.until(to).getDays());
    }

    public boolean includesDate(LocalDate other)
    {
        return from.isBefore(other) && to.isAfter(other);
    }
    
}

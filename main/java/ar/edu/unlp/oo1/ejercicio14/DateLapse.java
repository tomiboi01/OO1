package ar.edu.unlp.oo1.ejercicio14;

import java.time.LocalDate;

public class DateLapse implements LapseInterface {
    private LocalDate from;
    private LocalDate to;

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
        return (this.from.isBefore(other) || this.from.isEqual(other)) && to.isAfter(other) || this.to.isEqual(other);
    }
    
    public boolean overlaps (LapseInterface anotherDateLapse )
    {
        return this.includesDate(anotherDateLapse.getFrom()) || this.includesDate(anotherDateLapse.getTo())
        || anotherDateLapse.estaContenidoEn(anotherDateLapse);

    }

    public boolean estaContenidoEn(LapseInterface anotherLapseInterface)
    {
        return 
            (this.from.equals(anotherLapseInterface.getFrom()) || this.from.isAfter(anotherLapseInterface.getFrom())) 
            && 
            (this.to.equals(anotherLapseInterface.getTo()) || this.to.isBefore(anotherLapseInterface.getTo()));
    }
}

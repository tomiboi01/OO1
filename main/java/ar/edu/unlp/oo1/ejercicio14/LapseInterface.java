package ar.edu.unlp.oo1.ejercicio14;

import java.time.LocalDate;

public interface LapseInterface {
    public LocalDate getFrom();
    public LocalDate getTo();
    public int sizeInDays();
    public boolean includesDate(LocalDate other);
    public boolean overlaps(LapseInterface other);
    public boolean estaContenidoEn(LapseInterface other);
}

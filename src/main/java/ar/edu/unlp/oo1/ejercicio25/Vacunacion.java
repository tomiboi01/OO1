package ar.edu.unlp.oo1.ejercicio25;

public class Vacunacion extends ServicioMedico{
    private String vacuna;
    private double costoVacuna;

    

    public Vacunacion(Mascota mascota, Medico medico, String vacuna, double costoVacuna) {
        super(mascota, medico);
        this.vacuna = vacuna;
        this.costoVacuna = costoVacuna;
    }

    @Override
    public double calcularCosto()
    {
        return super.calcularCosto() + this.costoVacuna;
    }

    @Override
    public double costoMateriales() {
        return 500; 
    }
}

package ar.edu.unlp.oo1.ejercicio25;

public abstract class ServicioMedico extends Servicio{
    protected Medico medico;

    

    public ServicioMedico(Mascota mascota, Medico medico) {
        super(mascota);
        this.medico = medico;
    }

    public double calcularCosto()
    {
        return this.medico.costoHonorarios() + costoMateriales() + costoAtencionDomingos();
    }

    public double costoAtencionDomingos()
    {
        return 200;
    }
    public abstract double costoMateriales();

    
}

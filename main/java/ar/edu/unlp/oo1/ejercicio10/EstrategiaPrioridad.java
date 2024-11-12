package ar.edu.unlp.oo1.ejercicio10;

import java.util.List;

public class EstrategiaPrioridad implements EstrategiaRetornador{

    @Override
    public JobDescription devolver(List<JobDescription> jobs) {
        return jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);}
    
}

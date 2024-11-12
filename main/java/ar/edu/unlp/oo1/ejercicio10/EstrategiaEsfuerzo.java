package ar.edu.unlp.oo1.ejercicio10;

import java.util.List;

public class EstrategiaEsfuerzo implements EstrategiaRetornador{

    @Override
    public JobDescription devolver(List<JobDescription> jobs) {
        return jobs.stream()
        .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
        .orElse(null);}
    
}

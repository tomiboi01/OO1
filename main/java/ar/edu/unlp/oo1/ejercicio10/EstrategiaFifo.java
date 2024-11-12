package ar.edu.unlp.oo1.ejercicio10;

import java.util.List;

public class EstrategiaFifo implements EstrategiaRetornador{

    @Override
    public JobDescription devolver(List<JobDescription> jobs) {
        return jobs.get(0);
    }

    
    
}

package ar.edu.unlp.oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;
    EstrategiaRetornador estrategiaRet;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = "FIFO";
        estrategiaRet = new EstrategiaFifo();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(String aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        JobDescription nextJob = estrategiaRet.devolver(this.getJobs());
        if (nextJob != null)
            this.unschedule(nextJob);
        return nextJob;
    }

}

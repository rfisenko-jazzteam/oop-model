package org.jazzteam.oop.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Company {

    private static Company instance = new Company();

    private Set<Worker> workers = new LinkedHashSet<Worker>();

    private Office office;

    private Director director;

    private Company() {
        office = new Office();
    }

    public static synchronized Company getInstance() {
        return instance;
    }

    public void conductCorporateHoliday() {
        for (Worker worker : workers) {
            director.increaseWorkerOperability(worker);
        }
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Set<Worker> getWorkers() {
        return workers;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}

package org.jazzteam.oop.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Company {

    private static Company instance = new Company();

    private Set<Worker> workers = new LinkedHashSet<Worker>();

    private Office office;

    private Company() {
        office = new Office();
    }

    public static synchronized Company getInstance() {
        return instance;
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

}

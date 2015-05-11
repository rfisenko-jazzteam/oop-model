package org.jazzteam.oop.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Office {

    private Set<Worker> workers = new LinkedHashSet<Worker>();


    public Set<Worker> getWorkers() {
        return workers;
    }
}

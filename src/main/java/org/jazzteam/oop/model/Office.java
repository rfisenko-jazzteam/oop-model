package org.jazzteam.oop.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Office {

    private Set<Worker> workers = new LinkedHashSet<Worker>();


    public Set<Worker> getWorkers() {
        return workers;
    }

    public void leaveAllWorkers() {
        for (Worker worker : this.getWorkers()) {
            if (this.getWorkers().contains(worker)) {
                worker.leaveFromOffice();
            }
        }
    }
}

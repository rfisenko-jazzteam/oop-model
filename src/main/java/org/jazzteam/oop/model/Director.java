package org.jazzteam.oop.model;

public class Director extends Worker implements IOperabilityManager {

    private static final int DIRECTOR_OPERABILITY_INCREASE_SIZE = 3;

    public void increaseOperability(Worker worker) {
        worker.setOperability(worker.getOperability() + DIRECTOR_OPERABILITY_INCREASE_SIZE);
    }
}

package org.jazzteam.oop.model;

public class Director extends Worker implements IOperabilityManager {

    private static final int DIRECTOR_OPERABILITY_INCREASE_SIZE = 3;

    public void increaseWorkerOperability(Worker worker) {
        worker.increaseOperability(DIRECTOR_OPERABILITY_INCREASE_SIZE);
    }

    @Override
    public void relax() {
        increaseOperability(1);
    }
}

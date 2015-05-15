package org.jazzteam.oop.model;

public class Manager extends Worker implements IOperabilityManager {

    private static final int MANAGER_OPERABILITY_INCREASE_SIZE = 2;

    public void increaseWorkerOperability(Worker worker) {
        worker.increaseOperability(MANAGER_OPERABILITY_INCREASE_SIZE);
    }

    @Override
    public void relax() {
        increaseOperability(4);
    }
}

package org.jazzteam.oop.model;

public class Manager extends Worker implements IOperabilityManager {

    private static final int MANAGER_OPERABILITY_INCREASE_SIZE = 2;
    public static final int MANAGER_RELAX_COUNT = 4;

    public void increaseWorkerOperability(Worker worker) {
        worker.increaseOperability(MANAGER_OPERABILITY_INCREASE_SIZE);
    }

    public int getRelaxEfficiency() {
        return MANAGER_RELAX_COUNT;
    }
}

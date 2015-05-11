package org.jazzteam.oop.model;

public class Manager implements IOperabilityManager {

    private static final int MANAGER_OPERABILITY_INCREASE_SIZE = 2;

    public void increaseOperability(Worker worker) {
        worker.setOperability(worker.getOperability() + MANAGER_OPERABILITY_INCREASE_SIZE);
    }
}

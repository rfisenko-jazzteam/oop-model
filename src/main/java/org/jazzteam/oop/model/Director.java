package org.jazzteam.oop.model;

public class Director extends Worker implements IOperabilityManager {

    private Company company;

    private static final int  DIRECTOR_OPERABILITY_INCREASE_SIZE = 3;
    public static final int DIRECTOR_RELAX_COUNT = 1;

    public void increaseWorkerOperability(Worker worker) {
        worker.increaseOperability(DIRECTOR_OPERABILITY_INCREASE_SIZE);
    }

    public int getRelaxEfficiency() {
        return DIRECTOR_RELAX_COUNT;
    }

    public void changeCompanyOffice(Office newOffice) {
        company.getOffice().leaveAllWorkers();
        company.setOffice(newOffice);
    }

}

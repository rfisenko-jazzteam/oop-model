package org.jazzteam.oop.model;

public class Accountant extends Worker implements IAccountant {

    public static final int ACCOUNTANT_RELAX_COUNT = 5;

    public void takeSalary(Worker worker) {
        worker.setCash(worker.getCash() + worker.getSalary());
    }

    public int getRelaxEfficiency() {
        return ACCOUNTANT_RELAX_COUNT;
    }
}

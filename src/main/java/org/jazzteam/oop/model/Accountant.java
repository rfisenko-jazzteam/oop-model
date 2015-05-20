package org.jazzteam.oop.model;

import org.jazzteam.oop.model.statistic.Analyzable;
import org.jazzteam.oop.model.statistic.Statistic;

public class Accountant extends Worker implements IAccountant, Analyzable {

    public static final int ACCOUNTANT_RELAX_COUNT = 5;

    public void takeSalary(Worker worker) {
        worker.setCash(worker.getCash() + worker.getSalary());
    }

    public int getRelaxEfficiency() {
        return ACCOUNTANT_RELAX_COUNT;
    }

    public Statistic analyse() {
        return null; //TODO [rfisenko 20.05.15]: release this method
    }
}

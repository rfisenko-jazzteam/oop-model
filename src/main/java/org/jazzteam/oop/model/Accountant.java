package org.jazzteam.oop.model;

public class Accountant extends Worker implements IAccountant {

    public void takeSalary(Worker worker) {
        worker.setCash(worker.getCash() + worker.getSalary());
    }
}

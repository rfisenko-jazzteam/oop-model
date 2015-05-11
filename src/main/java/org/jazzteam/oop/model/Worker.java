package org.jazzteam.oop.model;

public class Worker extends Human {

    private int salary;
    private int cash;
    private int operability;

    public void goToOffice(Office office) {
        if (!office.getWorkers().contains(this)) {
            office.getWorkers().add(this);
        } else {
            throw new IllegalStateException(String.format("Worker already in office! Name: '%s'", this.getName()));
        }
    }

    public void drinkCoffe() {
        operability++;
    }

    public int getOperability() {
        return operability;
    }

    public void setOperability(int operability) {
        this.operability = operability;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}

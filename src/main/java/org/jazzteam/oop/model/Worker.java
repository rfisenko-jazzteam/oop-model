package org.jazzteam.oop.model;

public abstract class Worker extends Human {

    private int salary;
    private int cash;
    private int operability;
    private Office office;

    public abstract void relax();

    public void goToOffice(Office office) {
        if (!office.getWorkers().contains(this)) {
            office.getWorkers().add(this);
            this.office = office;
        } else {
            throw new IllegalStateException(String.format("Worker already in office! Worker name: '%s'", this.getName()));
        }
    }

    public void leaveFromOffice() {
        if (null != this.office && this.office.getWorkers().contains(this)) {
            this.office.getWorkers().remove(this);
            this.office = null;
        } else {
            throw new IllegalStateException(String.format("Worker already out of the office! Worker name: '%s'", this.getName()));
        }
    }

    public void drinkCoffee() {
        increaseOperability(1);
    }

    public void increaseOperability(int count) {
        operability = operability + count;
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

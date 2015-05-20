package org.jazzteam.oop.model;

public class SalesManager extends Worker {

    private static final int SALES_MANAGER_RELAX_COUNT = 3;

    public int getRelaxEfficiency() {
        return SALES_MANAGER_RELAX_COUNT;
    }
}

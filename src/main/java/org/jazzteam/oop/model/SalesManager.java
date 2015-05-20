package org.jazzteam.oop.model;

public class SalesManager extends Worker implements ISalesManager {

    private static final int SALES_MANAGER_RELAX_COUNT = 3;

    public int getRelaxEfficiency() {
        return SALES_MANAGER_RELAX_COUNT;
    }

    public Deal makeDeal() {
        return null; //TODO [rfisenko 20.05.15]: release this method
    }
}

package org.jazzteam.oop.model;

public class Programmer extends Worker implements IProgrammer {

    private int minimumOperabilityForCreatingProgram = 0;

    public boolean createProgram() {
        return this.getOperability() > minimumOperabilityForCreatingProgram;
    }

    public void setMinimumOperabilityForCreatingProgram(int minimumOperabilityForCreatingProgram) {
        this.minimumOperabilityForCreatingProgram = minimumOperabilityForCreatingProgram;
    }
}

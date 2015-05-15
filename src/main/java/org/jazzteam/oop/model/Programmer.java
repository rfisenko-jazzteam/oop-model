package org.jazzteam.oop.model;

public class Programmer extends Worker implements IProgrammer {

    private int minimumOperabilityForCreatingProgram = 0;

    public Program createProgram() {
        if (this.getOperability() >= minimumOperabilityForCreatingProgram) {
            return new Program();
        } else {
            throw new IllegalStateException(String.format("Programmer is very tired! Programmer name: '%s'", this.getName()));
        }
    }

    public void setMinimumOperabilityForCreatingProgram(int minimumOperabilityForCreatingProgram) {
        this.minimumOperabilityForCreatingProgram = minimumOperabilityForCreatingProgram;
    }

    public int getMinimumOperabilityForCreatingProgram() {
        return minimumOperabilityForCreatingProgram;
    }

    @Override
    public void relax() {
        increaseOperability(2);
    }
}

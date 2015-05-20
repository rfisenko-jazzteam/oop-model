package org.jazzteam.oop.model;

import org.jazzteam.oop.model.statistic.Analyzable;
import org.jazzteam.oop.model.statistic.Statistic;

public class Programmer extends Worker implements IProgrammer, Analyzable {

    public static final int PROGRAMMER_RELAX_COUNT = 2;
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

    public int getRelaxEfficiency() {
        return PROGRAMMER_RELAX_COUNT;
    }

    @Override
    public void relax() {
        if (this.getOperability() < minimumOperabilityForCreatingProgram) {
            this.setOperability(minimumOperabilityForCreatingProgram);
        } else {
            super.relax();
        }
    }

    public Statistic analyse() {
        return null;       //TODO [rfisenko 20.05.15]: release this method
    }
}

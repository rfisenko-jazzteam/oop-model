package org.jazzteam.oop.model.factory;

import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Worker;

public class Factory {
    public static Office createNewOffice() {
        return new Office();
    }

    public static Worker createNewWorker() {
        return new Worker();
    }
}
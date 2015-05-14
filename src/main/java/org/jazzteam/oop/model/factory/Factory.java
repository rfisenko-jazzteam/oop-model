package org.jazzteam.oop.model.factory;

import org.jazzteam.oop.model.Accountant;
import org.jazzteam.oop.model.Director;
import org.jazzteam.oop.model.Manager;
import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Programmer;
import org.jazzteam.oop.model.Worker;

public class Factory {
    public static Office createNewOffice() {
        return new Office();
    }

    public static Worker createNewWorker() {
        Worker worker = new Worker();
        worker.setOperability(0);
        return worker;
    }

    public static Programmer createNewProgrammer() {
        Programmer programmer = new Programmer();
        programmer.setOperability(1);
        return programmer;
    }

    public static Manager createNewManager() {
        Manager manager = new Manager();
        return manager;
    }

    public static Director createNewDirector() {
        Director director = new Director();
        return director;
    }

    public static Accountant createNewAccountant() {
        Accountant accountant = new Accountant();
        return accountant;
    }
}

package org.jazzteam.oop.model;

import java.util.LinkedList;
import java.util.List;

public class Company {

    private static Company instance = new Company();

    private List<Worker> workers = new LinkedList<Worker>();


    public List<Worker> getWorkers() {
        return workers;
    }

    private Company() {
    }

    public static synchronized Company getInstance() {
        return instance;
    }

}

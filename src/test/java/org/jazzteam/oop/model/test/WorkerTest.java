package org.jazzteam.oop.model.test;

import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Worker;
import org.jazzteam.oop.model.factory.Factory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkerTest extends Assert {

    private Office office;
    private Worker worker;

    @BeforeMethod
    public void precondition() {
        office = Factory.createNewOffice();
        worker = Factory.createNewWorker();
    }

    @Test
    public void goWorkerToOfficeTest() {
        int initialWorkersCount = office.getWorkers().size();
        worker.goToOffice(office);

        assertEquals(office.getWorkers().size(), initialWorkersCount + 1);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void goWorkerToOfficeWithAlreadyExistingTest() {
        worker.goToOffice(office);
        worker.goToOffice(office);
    }

    @Test(dependsOnMethods = "goWorkerToOfficeTest")
    public void workerLeaveFromOfficeTest() {
        worker.goToOffice(office);
        worker.leaveFromOffice();

        assertTrue(!office.getWorkers().contains(worker));
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void workerLeaveFromOfficeWithAlreadyLeavingTest() {
        worker.leaveFromOffice();
    }

    @Test
    public void workerDrinkCoffeeTest() {
        int initialOperability = worker.getOperability();
        worker.drinkCoffee();
        assertTrue(worker.getOperability() > initialOperability);
    }
}

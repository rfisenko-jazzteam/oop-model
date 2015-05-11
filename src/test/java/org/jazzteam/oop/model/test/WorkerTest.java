package org.jazzteam.oop.model.test;

import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Worker;
import org.jazzteam.oop.model.factory.Factory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkerTest {

    private Office defaultOffice;
    private Worker defaultWorker;

    @BeforeMethod
    public void precondition() {
        defaultOffice = Factory.createNewOffice();
        defaultWorker = Factory.createNewWorker();
    }

    @Test
    public void goWorkerToOfficeTest() {
        int initialWorkersCount = defaultOffice.getWorkers().size();
        defaultWorker.goToOffice(defaultOffice);

        Assert.assertEquals(defaultOffice.getWorkers().size(), initialWorkersCount + 1);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void goWorkerToOfficeWithAlreadyExistingTest() {
        defaultWorker.goToOffice(defaultOffice);
        defaultWorker.goToOffice(defaultOffice);
    }

    @Test
    public void workerLeaveFromOfficeTest() {
        defaultWorker.goToOffice(defaultOffice);
        defaultWorker.leaveFromOffice();

        Assert.assertTrue(!defaultOffice.getWorkers().contains(defaultWorker));
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void workerLeaveFromOfficeWithAlreadyLeavingTest() {
        defaultWorker.leaveFromOffice();
    }

}

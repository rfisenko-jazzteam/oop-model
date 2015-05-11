package org.jazzteam.oop.model.test;

import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Worker;
import org.jazzteam.oop.model.factory.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WorkerTest {

    @Before
    public void cleanUp() {

    }

    @Test
    public void goWorkerToOfficeTest() {
        Office office = Factory.createNewOffice();
        int initialWorkersCount = office.getWorkers().size();

        Worker worker = Factory.createNewWorker();
        worker.goToOffice(office);

        Assert.assertEquals(initialWorkersCount + 1, office.getWorkers().size());
    }

}

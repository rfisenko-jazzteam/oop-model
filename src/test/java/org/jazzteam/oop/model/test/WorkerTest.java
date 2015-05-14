package org.jazzteam.oop.model.test;

import org.jazzteam.oop.model.Accountant;
import org.jazzteam.oop.model.Director;
import org.jazzteam.oop.model.IOperabilityManager;
import org.jazzteam.oop.model.Manager;
import org.jazzteam.oop.model.Office;
import org.jazzteam.oop.model.Programmer;
import org.jazzteam.oop.model.Worker;
import org.jazzteam.oop.model.factory.Factory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkerTest extends Assert {

    private Office office;
    private Worker worker;
    private Programmer programmer;
    private Director director;
    private Manager manager;
    private Accountant accountant;

    @BeforeMethod
    public void precondition() {
        office = Factory.createNewOffice();
        worker = Factory.createNewWorker();
        programmer = Factory.createNewProgrammer();
        manager = Factory.createNewManager();
        director = Factory.createNewDirector();
        accountant = Factory.createNewAccountant();
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

    @Test
    public void programmerCreatedProgramTest() {
        assertNotNull(programmer.createProgram());
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void programmerTiredAndCreatedProgram() {
        programmer.setOperability(-1);
        programmer.createProgram();
    }

    @DataProvider
    public Object[][] operabilityManagerDataProvider() {
        return new Object[][]{
                {manager},
                {director},
        };
    }

    @Test(dataProvider = "operabilityManagerDataProvider")
    public void increaseWorkerMotivationTest(IOperabilityManager operabilityManager) {
        int initOperability = worker.getOperability();
        operabilityManager.increaseOperability(worker);
        assertTrue(worker.getOperability() > initOperability);
    }

    @Test
    public void workerGetSalaryTest() {
        int initCash = worker.getCash();
        accountant.takeSalary(worker);
        assertEquals(worker.getCash(), initCash + worker.getSalary());
    }

}

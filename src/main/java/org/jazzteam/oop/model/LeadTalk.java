package org.jazzteam.oop.model;

public class LeadTalk {

    private ISalesManager salesManager;
    private Customer customer;

    public ISalesManager getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(ISalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

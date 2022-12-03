package controllers;

import common.exception.ExistException;
import models.person.Customer;
import services.IService;
import services.extend.impl.CustomerServiceImpl;

import java.util.LinkedList;
import java.util.List;

public class CustomerController {

    private final IService<Customer> customerService = new CustomerServiceImpl();

    public List<Customer> displayCustomer() {
        return this.customerService.display();
    }

    public void addCustomer(Customer customer) {
        try {
            this.customerService.add(customer);
        } catch (ExistException e) {
            throw new RuntimeException(e);
        }
    }

    public void editCustomer(Customer customer) {
        this.customerService.edit(customer);
    }
}

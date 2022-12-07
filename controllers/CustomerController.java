package controllers;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Customer;
import services.extend.ICustomerService;
import services.extend.impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.List;

public class CustomerController {

    private final ICustomerService customerService = new CustomerServiceImpl();

    public List<Customer> displayCustomer() {
        try {
            return this.customerService.getList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addCustomer(Customer customer) {
        try {
            this.customerService.add(customer);
        } catch (ExistException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editCustomer(Customer customer) {
        try {
            this.customerService.edit(customer);
        } catch (IOException | ExistException e) {
            throw new RuntimeException(e);
        }
    }
}

package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Customer;
import services.IService;
import services.extend.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CustomerServiceImpl implements ICustomerService {

    private static final List<Customer> customerList;

    static {
        customerList = new LinkedList<>();
    }
    @Override
    public List<Customer> getList() {
        return CustomerServiceImpl.customerList;
    }

    @Override
    public void add(Customer object) throws ExistException {
        for (Customer customer : customerList){
            if (Objects.equals(customer.getCustomerCode(), object.getCustomerCode())){
                throw new ExistException();
            }
        }
        CustomerServiceImpl.customerList.add(object);
    }

    @Override
    public void edit(Customer object) {
        for (Customer customer : customerList){
            if (Objects.equals(customer.getCustomerCode(), object.getCustomerCode())){
                customer.setName(object.getName());
                customer.setBirthday(object.getBirthday());
                customer.setGender(object.getGender());
                customer.setIdCard(object.getIdCard());
                customer.setPhoneNumber(object.getPhoneNumber());
                customer.setEmail(object.getEmail());
                customer.setCustomerTypes(object.getCustomerTypes());
                customer.setAddress(object.getAddress());
                break;
            }
        }
    }

    @Override
    public void delete(Customer object) throws NotFoundInDatabase {

    }
}

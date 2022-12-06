package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Customer;
import services.IFileListService;
import services.IService;
import services.extend.ICustomerService;
import services.impl.CustomerIOService;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CustomerServiceImpl implements ICustomerService {

    private final CustomerIOService customerIOService = new CustomerIOService();

    private final String PATH_FILE_CUSTOMER = "src/data/customer.csv";

    //    private static final List<Customer> customerList;
//
//    static {
//        customerList = new LinkedList<>();
//    }
    @Override
    public List<Customer> getList() throws IOException {
        return this.customerIOService.readFile(PATH_FILE_CUSTOMER);
    }

    @Override
    public void add(Customer customer) throws ExistException, IOException {
        List<Customer> customerList = this.customerIOService.readFile(PATH_FILE_CUSTOMER);
        for (Customer cus : customerList) {
            if (Objects.equals(cus.getCustomerCode(), customer.getCustomerCode())) {
                throw new ExistException();
            }
        }
        customerList.add(customer);
        this.customerIOService.writeFile(PATH_FILE_CUSTOMER, customerList);
    }

    @Override
    public void edit(Customer object) throws IOException {
        List<Customer> customerList = this.customerIOService.readFile(PATH_FILE_CUSTOMER);
        for (Customer customer : customerList) {
            if (Objects.equals(customer.getCustomerCode(), object.getCustomerCode())) {
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

        this.customerIOService.writeFile(PATH_FILE_CUSTOMER, customerList);
    }

    @Override
    public void delete(Customer object) throws NotFoundInDatabase {

    }
}

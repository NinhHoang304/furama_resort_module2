package models.person;

import models.person.dependency.CustomerCode;

public class Customer extends Person{

    private String customerCode;
    private String customerTypes;
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String customerTypes, String address) {
        this.customerCode = customerCode;
        this.customerTypes = customerTypes;
        this.address = address;
    }

    public Customer(String name, String birthday, String gender, int idCard, int phoneNumber, String email, String customerCode, String customerTypes, String address) {
        super(name, birthday, gender, idCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerTypes = customerTypes;
        this.address = address;
    }

    public String formatCSVFileCustomer() {
        return this.formatCSVFilePerson() + "," +
                this.customerCode + "," +
                this.customerTypes + "," +
                this.address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerTypes() {
        return customerTypes;
    }

    public void setCustomerTypes(String customerTypes) {
        this.customerTypes = customerTypes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", customerTypes='" + customerTypes + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

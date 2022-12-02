package models;

import models.facility.dependency.ServiceName;
import models.person.dependency.CustomerCode;

public class Booking implements ServiceName, CustomerCode {

    private String bookingCode;
    private String checkin;
    private String checkout;
    private ServiceName nameService;
    private CustomerCode customerCode;

    public Booking() {
    }

    public Booking(String bookingCode, String checkin, String checkout, ServiceName nameService, CustomerCode customerCode) {
        this.bookingCode = bookingCode;
        this.checkin = checkin;
        this.checkout = checkout;
        this.nameService = nameService;
        this.customerCode = customerCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public ServiceName getNameService() {
        return nameService;
    }

    public void setNameService(ServiceName nameService) {
        this.nameService = nameService;
    }

    public CustomerCode getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(CustomerCode customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", nameService=" + nameService +
                ", customerCode=" + customerCode +
                '}';
    }
}

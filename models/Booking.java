package models;

import models.facility.dependency.ServiceName;
import models.person.dependency.CustomerCode;

public class Booking implements ServiceName, CustomerCode {

    private String bookingCode;
    private String checkin;
    private String checkout;
    private String nameServiceBooking;
    private String customerCodeBooking;

    public Booking() {
    }

    public Booking(String bookingCode, String checkin, String checkout, String nameService, String customerCode) {
        this.bookingCode = bookingCode;
        this.checkin = checkin;
        this.checkout = checkout;
        this.nameServiceBooking = nameService;
        this.customerCodeBooking = customerCode;
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

    public String getNameServiceBooking() {
        return nameServiceBooking;
    }

    public void setNameServiceBooking(String nameServiceBooking) {
        this.nameServiceBooking = nameServiceBooking;
    }

    public String getCustomerCodeBooking() {
        return customerCodeBooking;
    }

    public void setCustomerCodeBooking(String customerCodeBooking) {
        this.customerCodeBooking = customerCodeBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", nameService=" + nameServiceBooking +
                ", customerCode=" + customerCodeBooking +
                '}';
    }
}

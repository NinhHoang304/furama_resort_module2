package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.Booking;
import services.extend.IBookingService;

import java.util.List;

public class BookingServiceImpl implements IBookingService {

    @Override
    public List<Booking> getList() {
        return null;
    }

    @Override
    public void add(Booking object) throws ExistException {

    }

    @Override
    public void edit(Booking object) {

    }

    @Override
    public void delete(Booking object) throws NotFoundInDatabase {

    }

    @Override
    public boolean checkId(String id) {
        return false;
    }
}

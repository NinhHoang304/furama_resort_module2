package controllers;

import common.exception.ExistException;
import models.facility.Facility;
import services.extend.IFacilityService;
import services.extend.impl.FacilityServiceImpl;

import java.io.IOException;

public class FacilityController {

    private final IFacilityService facilityService = new FacilityServiceImpl();

    public void displayFacility() {
        this.facilityService.getFacility();
    }

    public void displayFacilityMaintenance() {
        this.facilityService.getFacilityMaintenance();
    }

    public void addFacility(Facility facility) {
        try {
            this.facilityService.add(facility);
        } catch (ExistException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

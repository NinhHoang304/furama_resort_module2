package controllers;

import common.exception.ExistException;
import models.facility.Facility;
import services.IService;
import services.extend.IFacilityService;
import services.extend.impl.FacilityServiceImpl;

public class FacilityController {

    private final IFacilityService facilityService = new FacilityServiceImpl();

    public void displayFacility() {
        this.facilityService.displayFacility();
    }

    public void displayFacilityMaintenance() {
        this.facilityService.displayFacilityMaintenance();
    }

    public void addFacility(Facility facility) {
        try {
            this.facilityService.add(facility);
        } catch (ExistException e) {
            throw new RuntimeException(e);
        }
    }
}

package controllers;

import models.facility.Room;
import models.facility.Villa;
import services.extend.IFacilityService;
import services.extend.impl.FacilityServiceImpl;

import java.io.IOException;

public class FacilityController {

    private final IFacilityService facilityService = new FacilityServiceImpl();

    public void displayFacility() {
        try {
            this.facilityService.displayFacility();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayFacilityMaintenance() {
        try {
            this.facilityService.getFacilityMaintenance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addNewVilla(Villa villa) {
        try {
            this.facilityService.addNewVilla(villa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addNewRoom(Room room) {
        try {
            this.facilityService.addNewRoom(room);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public void addFacility(Facility facility) {
//        try {
//            this.facilityService.add(facility);
//        } catch (ExistException | IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}

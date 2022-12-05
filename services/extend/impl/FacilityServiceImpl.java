package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.extend.IFacilityService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {

    private static final Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    private int countNewVilla = 1;

    private int countNewRoom = 1;

    private int COUNT = 1;


    static {
        Facility villa = new Villa("SVVL-0001", "Villa", 200.0, 1000,
                4, "Day", "Vip", 40.0, 1);

        Facility villa1 = new Villa("SVVL-0002", "Villa ", 200.0, 1000,
                4, "Day", "Vip", 40.0, 2);

        Facility room = new Room("SVRO-0001", "Room", 200.0, 1000,
                4, "Day", "Cafe");

        Facility room1 = new Room("SVRO-0002", "Room", 200.0, 1000,
                4, "Day", "Cafe");

        facilityList.put(villa, 0);
        facilityList.put(villa1, 5);
        facilityList.put(room, 0);
        facilityList.put(room1, 5);
    }

    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            System.out.println(entry);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void add(Facility facility) {
        if (facility instanceof Villa) {
            Villa villa = (Villa) facility;
            facilityList.put(villa, 0);
        } else if (facility instanceof Room) {
            Room room = (Room) facility;
            facilityList.put(room, 0);
        }
    }

    @Override
    public void edit(Facility object) {

    }

    @Override
    public void delete(Facility object) {

    }

    @Override
    public List<Facility> display() {
        return null;
    }
}

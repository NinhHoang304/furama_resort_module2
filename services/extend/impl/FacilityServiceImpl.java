package services.extend.impl;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.IFileMapService;
import services.extend.IFacilityService;
import services.impl.RoomIOService;
import services.impl.VillaIOService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {

    private static final Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    private final IFileMapService<Room, Integer> roomIOService = new RoomIOService();

    private final IFileMapService<Villa, Integer> villaIOService = new VillaIOService();

    private final String PATH_FILE_VILLA = "src/data/villa.csv";
    private final String PATH_FILE_ROOM = "src/data/room.csv";

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
    public void displayFacility() throws IOException {
        // TODO get all villa list in villa.csv -> push all villa list in facility list
        Map<Villa, Integer> villaList = this.villaIOService.readFile(PATH_FILE_VILLA);
        facilityList.putAll(villaList);
        //TODO get all room list in room.csv -> push all room list in facility list
        Map<Room, Integer> roomList = this.roomIOService.readFile(PATH_FILE_ROOM);
        facilityList.putAll(roomList);
        //TODO display all
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            System.out.println(entry.getKey() + " Used: " + entry.getValue() + " time");
        }
    }

    @Override
    public void getFacilityMaintenance() throws IOException {
        // TODO get all villa list in villa.csv -> push all villa list in facility list
        Map<Villa, Integer> villaList = this.villaIOService.readFile(PATH_FILE_VILLA);
        facilityList.putAll(villaList);
        //TODO get all room list in room.csv -> push all room list in facility list
        Map<Room, Integer> roomList = this.roomIOService.readFile(PATH_FILE_ROOM);
        facilityList.putAll(roomList);
        //TODO display list maintenance when value >= 5
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " Used: " + entry.getValue() + " time");
            }
        }
    }

    @Override
    public void addNewVilla(Villa villa) throws IOException {
        Map<Villa, Integer> villaList = this.villaIOService.readFile(PATH_FILE_VILLA);
        villaList.put(villa, 0);
        this.villaIOService.writeFile(PATH_FILE_VILLA, villaList);
    }

    @Override
    public void addNewRoom(Room room) throws IOException {
        Map<Room, Integer> roomList = this.roomIOService.readFile(PATH_FILE_ROOM);
        roomList.put(room, 0);
        this.roomIOService.writeFile(PATH_FILE_ROOM, roomList);
    }

    @Override
    public boolean checkId(String id) {
        return false;
    }

    @Override
    public void add(Facility facility) throws IOException {

    }

    @Override
    public void edit(Facility object) {

    }

    @Override
    public void delete(Facility object) {

    }


    @Override
    public List<Facility> getList() {
        return null;
    }
}
